package ex07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title,true);//모달 다이얼로그로 설정
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	
	public String getInput() {
		if(tf.getText().length()==0) 
			return null;
		else
			return tf.getText();
	}
}