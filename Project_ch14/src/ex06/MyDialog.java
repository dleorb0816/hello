package ex06;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");

	public MyDialog(JFrame jframe,String title) {
		super(jframe,title);
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
}

	


