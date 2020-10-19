package ex07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
							new ImageIcon("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\admin\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Project_ch11\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ex02\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images/apple.jpg"),
							new ImageIcon("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\admin\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Project_ch11\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ex02\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images/pear.jpg"),
							new ImageIcon("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\admin\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Project_ch11\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ex02\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images/cherry.jpg")};
	private JLabel imageLabel = new JLabel();

	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//화면을 나누기 위해서, 패널(JPanel)을 사용함
		JPanel radioPanel = new JPanel(); 
		radioPanel.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup(); 

		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true); 
		c.add(radioPanel, BorderLayout.NORTH); 
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); 
		setSize(250,200);
		setVisible(true);
	}


	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; 
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String [] args) {
		new RadioButtonItemEventEx();
	}
}
