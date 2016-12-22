import java.awt.*;
import javax.swing.*;

public class MainFrameMan2{
  public static void main(String[] args) {
    FrameMan fm = new FrameMan();
  }
}
class FrameMan{
  JFrame frame;
  JPanel panel;
  JLabel label;
  ImageIcon icon;

  public FrameMan(){
    System.out.println("ALOHA2!");
    openWindow();

  }
private void openWindow(){
  frame = new JFrame();


    frame.setLocation(200,200);
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel= new JPanel();
    icon = new ImageIcon("JAVA_icons/java_cup.png");
    label= new JLabel(icon);

    panel.add(label);
    frame.add(panel);

    frame.setVisible(true);
  }
}
