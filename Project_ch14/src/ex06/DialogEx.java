package ex06;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DialogEx extends JFrame {
	private MyDialog dialog;

	public DialogEx() {
		super("DialogEx 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");

		MyDialog dialog = new MyDialog(this, "Test Dialog");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx();
	}
}
