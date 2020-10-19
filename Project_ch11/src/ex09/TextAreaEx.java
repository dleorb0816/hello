package ex09;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(9, 20);

	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//추가적으로 keyListener사용하는법 공부 필요!
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");//텍스트필드에 초기값을 줌
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
