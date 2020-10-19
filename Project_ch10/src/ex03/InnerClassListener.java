package ex03;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public  class InnerClassListener extends JFrame{
	InnerClassListener(){
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		
		});
		
		setSize(350,150);
		setVisible(true);
	}
	class MyActionListener implements ActionListener {


		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("ACTION"))
				b.setText("�׼�");
			else
				b.setText("Action");
			
			InnerClassListener.this.setTitle(b.getText());
		}
	}
	public static void main(String [] args) {
		new InnerClassListener();
	}
}

