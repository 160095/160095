import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Memo{
	public static void main(String[] args) {
		MemoWindow mw = new MemoWindow();
	}
}
class MemoWindow implements ActionListener{
	JFrame frame;
	JButton btnSave;
	JTextArea textArea;
	JPanel panel;
	JScrollPane scrollPane;
	String fileName;
	public MemoWindow() {
		fileName = "test.txt";
		
		frame = new JFrame("Memo");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		panel = new JPanel();
		textArea = new JTextArea(5, 20);
		scrollPane = new JScrollPane(textArea);

		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		FileWriter fw= null;
		PrintWriter pw= null;
	try {
		fw = new FileWriter(fileName, true);
		pw = new PrintWriter(fw);

		String data = textArea.getText();
		pw.println(data);

	} catch(IOException e) {
		System.out.println("IO error.");
		} finally {
			try {
				fw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO Error.");
			}
		}
	}
}