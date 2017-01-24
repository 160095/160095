import java.awt.*;
import javax.swing.*;

public class TestField{
	public static void main(String[] args) {
		TestFieldMan man=new TestFieldMan();
	}
}

class TestFieldMan {
	JFrame frame;
	JButton button;
	JTextField fileName;
	JPanel fieldPanel;

	public TestFieldMan() {
		frame=new JFrame("TestField");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Click Me!");
		fileName = new JTextField("ALOHA", 20);
		fieldPanel = new JPanel();

		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2,1));

		fieldPanel.add(fileName);

		fieldPanel.add(button);	

		con.add(fieldPanel);

		frame.setVisible(true);

	}
}