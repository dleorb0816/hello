package ex02;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//1.JLable 생성자 매개 변수로 -> 객체String
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/beauty.jpg");
		//2.JLabel 생성자 매개변수로 ->객체 IMageIcon
		//JLabel imageLabel = new JLabel(beauty);
		JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/beauty.jpg"));
		
		//폴더 접근 기호
		//부모 (한단계 앞) -> ../
		//자신 -> ./ or / ->이거는 생략가능
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Project_ch11\\src\\ex02\\images/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요",
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
