import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestButton2 {
	public static void main(String[] args) {
		TestButtonMan2 man = new TestButtonMan2();
	}
}
//   
class TestButtonMan2 implements ActionListener{
	JFrame frame;
	JButton button1;
	JButton button2;
	JTextField fileName;
	JPanel panel;

	public TestButtonMan2(){
		frame=new JFrame("TestButton2");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1=new JButton("HELLO");
		button1.addActionListener(this);
		button1.setActionCommand("btn1");

		button2=new JButton("青木！");
		button2.addActionListener(this);
		button2.setActionCommand("btn2");

		fileName=new JTextField("ALOHA",20);
		panel=new JPanel();

		panel.add(fileName);
		panel.add(button1);
		panel.add(button2);
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);

		frame.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent ae){
		String btn=ae.getActionCommand();

		if (btn.equals("btn1")) {
			fileName.setText("HELLO");
		}else if (btn.equals("btn2")) {
			fileName.setText("青木！");
		}
	}
}