package ex02;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//1.JLable ������ �Ű� ������ -> ��üString
		JLabel textLabel = new JLabel("����մϴ�.");
		
		ImageIcon beauty = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/beauty.jpg");
		//2.JLabel ������ �Ű������� ->��ü IMageIcon
		//JLabel imageLabel = new JLabel(beauty);
		JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/beauty.jpg"));
		
		//���� ���� ��ȣ
		//�θ� (�Ѵܰ� ��) -> ../
		//�ڽ� -> ./ or / ->�̰Ŵ� ��������
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���",
				normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
