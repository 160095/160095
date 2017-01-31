import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Aloha3 {
	public static void main(String[] args) {
		DataMan man = new DataMan();
	}
}
class DataMan implements ActionListener{
	JFrame frame;
	JTextField fileName;
	JPanel fieldPanel;
	JButton buttonOpen;			
	JButton buttonSave;
	JTextArea textArea;			
	JScrollPane scrollPane;

	public DataMan() {
		frame = new JFrame("Dataman");
		frame.setLocation(500, 500);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		fileName = new JTextField("DATA", 12);
		fieldPanel = new JPanel();

		buttonOpen = new JButton("開く");
		buttonOpen.addActionListener(this);
		buttonOpen.setActionCommand("open");
		buttonSave = new JButton("保存");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		
		fieldPanel.add(fileName);
		fieldPanel.add(buttonOpen);
		fieldPanel.add(buttonSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(fieldPanel);
		con.add(scrollPane);


		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){
			textArea.append("開く"+'\n');
			FileReader fr;
			BufferedReader br;
			String textFileName = "Directory";
			try {
				JFileChooser  fc = new JFileChooser();
				fc.setCurrentDirectory(new File("."));

				int ret = fc.showOpenDialog(frame);

				if(ret==JFileChooser.APPROVE_OPTION){
					File file = fc.getSelectedFile();
					textFileName = file.getAbsolutePath();
					fileName.setText(textFileName);
				}
				fr = new FileReader(textFileName);
				br = new BufferedReader(fr);

				String data;
				while((data = br.readLine()) != null){
					textArea.append(data+'\n');

				}
				
			} catch(IOException e) {
					System.out.println("IO error.");
			}
		} else if(cmd.equals("save")) {
			FileWriter fw = null;
			PrintWriter pw = null;
			String textFileName = "save";

			try {
				JFileChooser  fc = new JFileChooser();
				fc.setCurrentDirectory(new File("."));

				int ret = fc.showSaveDialog(frame);

				if(ret==JFileChooser.APPROVE_OPTION){
					File file = fc.getSelectedFile();
					textFileName = file.getAbsolutePath();
					fileName.setText(textFileName);
				}
				fw = new FileWriter(textFileName);
				pw = new PrintWriter(fw);

				String data = textArea.getText();
				pw.println(data);
			} catch(IOException e) {
					
			}finally{
				try{
					pw.close();
					fw.close();
				} catch(IOException e){
					System.out.println("IO error.");
				}
			}
		}
	}
}