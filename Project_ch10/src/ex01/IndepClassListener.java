package ex01;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class IndepClassListener extends JFrame {
	public IndepClassListener() {
	setTitle("Action이벤트 리스너 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn = new JButton("ACTION");
	btn.addActionListener((ActionListener) new MyActionListener());
	c.add(btn);
	
	setSize(350, 150);
	setVisible(true);}
	}

