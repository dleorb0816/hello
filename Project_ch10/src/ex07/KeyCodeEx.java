package ex07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	Container c;

	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);// 키입력 받을수 이도록 포커스 강제 지정
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));

			if (e.getKeyChar() == '%')
				c.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_1)
				c.setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
