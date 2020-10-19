package ex04;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon(
				"C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\eclipse-workspace\\\\\\\\Project_ch11\\\\\\\\src\\\\\\\\ex02\\\\\\\\images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon(
				"C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\eclipse-workspace\\\\\\\\Project_ch11\\\\\\\\src\\\\\\\\ex02\\\\\\\\images/selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(350, 250);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
