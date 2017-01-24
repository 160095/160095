import java.awt.*;
import javax.swing.*;

public class TestButton {
	public static void main(String[] args) {
		TestButtonMan tbm=new TestButtonMan();
	}
}
class TestButtonMan{
	JFrame frame;
	JButton button;
	public TestButtonMan(){
		frame=new JFrame("TestButton");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button=new JButton("click me");

		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(button);

		frame.setVisible(true);
	}
}