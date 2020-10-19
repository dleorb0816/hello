package ex08;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		setTitle("¿É¼Ç ÆÒ ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(),BorderLayout.NORTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
