import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gazou {
	public static void main(String[] args) {
		GazouMan man = new GazouMan();
	}
}


class GazouMan implements ActionListener {

	ImageIcon img;
	ImageIcon img2;
	JFrame frame;					
	JButton button1;
	JButton button2;					
			
	
	JLabel label;
	JPanel panel;
				

	public GazouMan(){
		frame = new JFrame("GazouMan");
		frame.setLocation(0, 0);		
		frame.setSize(1500, 900);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("1.jpg" );
		img2 = new ImageIcon("2.jpg" );
		

			
			label = new JLabel(img);
			

			panel = new JPanel();
			button1= new JButton("Next");
			button2= new JButton("Prev");

			button1.addActionListener(this);
			button1.setActionCommand("next");

			button2.addActionListener(this);
			button2.setActionCommand("prev");

		Container con = frame.getContentPane();
		
		panel.add(label);

		

		panel.add(button1);
		panel.add(button2);

		con.add(panel);
		
		
		frame.setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("next")){

			
			label.setIcon(img2);

		} else if(cmd.equals("prev")) {
			
			label.setIcon(img);
		}

			
	}
}

