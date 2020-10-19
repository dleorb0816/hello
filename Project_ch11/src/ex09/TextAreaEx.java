package ex09;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(9, 20);

	public TextAreaEx() {
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//�߰������� keyListener����ϴ¹� ���� �ʿ�!
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");//�ؽ�Ʈ�ʵ忡 �ʱⰪ�� ��
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
