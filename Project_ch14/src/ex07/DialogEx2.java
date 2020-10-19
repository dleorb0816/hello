package ex07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DialogEx2 extends JFrame {
	private MyModalDialog dialog;
	
	public DialogEx2() {
		super("DialogEx2 ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		
		dialog = new MyModalDialog(this, "Test Modal Dialog");
		
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String text = dialog.getInput();
				
				if(text == null)
					return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
			
		});
		
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx2();
	}

}
