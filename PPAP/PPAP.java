import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PPAP {
	public static void main(String[] args) {
		PPAPMan man = new PPAPMan();
	}
}	
class PPAPMan implements ActionListener{
		JFrame frame;
		JButton buttonSave;
		JButton buttonNext;
		JPanel buttonPanel;
		JLabel word1;
		JLabel word2;
		JPanel wordPanel;
		JTextArea memo;
		JScrollPane memoPane;
		String[] words = new String[23];
		


	public PPAPMan(){
		frame = new JFrame("PPAP");
		frame.setLocation(800,500);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonSave= new JButton("Save");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		buttonNext = new JButton("Next");
		buttonNext.addActionListener(this);
		buttonNext.setActionCommand("next");


		word1 = new JLabel("ALOHA");
		word2 = new JLabel("ALOHA");

		memo  =new JTextArea(5,20);



		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3,1));
		buttonPanel = new JPanel();
		wordPanel = new JPanel();
		memoPane = new JScrollPane(memo);

		


		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		wordPanel.add(word1);
		wordPanel.add(word2);

		con.add(buttonPanel);
		con.add(wordPanel);
		con.add(memoPane);

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("save")){
			FileWriter fW = null;
			FileReader fr = null;
		try {
			fw = new FileWriter("memo.txt");
			pw = new PrintWriter(fw);

			String data = memo.getText();
			pw.println(data);

		} catch(IOException e) {
			System.out.println("IO Error.");
			} finally {
				try {
					fw.close();
					pw.close();
				} catch(IOException e) {
					System.out.println("IO Error.");
				}
			}
		}else if(cmd.equals("next")){
		FileReader fr;
		BufferedReader br;

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("words.txt"),"UTF-8"));

			String data;
			int i = 0;
			while((data = br.readLine()) != null) {
				words[i] = data;
				i++;
			}

			int rdm1 =(int)(Math.random()*23);
			int rdm2 =(int)(Math.random()*23);

			word1.setText(words[rmd1]);
			word2.setText(words[rmd2]);

		} catch(IOException e) {
		System.out.println("IO Error.");
		}
	}
 
}


