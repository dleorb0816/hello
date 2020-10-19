import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPanel02 extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanelTest win;
	
	public JPanel02(JPanelTest win) {
		setLayout(null);
		this.win = win;
		JLabel lblLbl = new JLabel("���̵�");
		lblLbl.setBounds(31, 40, 67, 15);
		add(lblLbl);
		
		textField = new JTextField();
		textField.setBounds(123, 40, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblLbl_1 = new JLabel("��ȣ");
		lblLbl_1.setBounds(31, 84, 67, 15);
		add(lblLbl_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123,84,116,21);
		add(passwordField);
		
		JButton btn = new JButton("��ư");
		btn.setSize(70, 20);
		btn.setLocation(10, 10);
		add(btn);
		btn.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			win.change("panel01");
		}
		
	}
	
}
