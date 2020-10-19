package ex03;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalicon = new ImageIcon("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Project_ch11\\\\src\\\\ex02\\\\images/normalIcon.gif");
		ImageIcon rollovericon = new ImageIcon("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Project_ch11\\\\src\\\\ex02\\\\images/rolloverIcon.gif");
		ImageIcon pressedicon = new ImageIcon("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Project_ch11\\\\src\\\\ex02\\\\images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalicon);
		btn.setPressedIcon(pressedicon);
		btn.setRolloverIcon(rollovericon);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
