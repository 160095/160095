import java.awt.*;
import javax.swing.*;

public class MainFrameMan{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}
class FrameMan{
	JFrame frame;
	JPanel panel;
	JLabel label;
	public FrameMan(){
		System.out.println("ALOHA2!");
		openWindow();

	}
private void openWindow(){
	frame = new JFrame();

		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel= new JPanel();
		label= new JLabel("ALOHA!");

		panel.add(label);
		frame.add(panel);

		frame.setVisible(true);
	}
}
