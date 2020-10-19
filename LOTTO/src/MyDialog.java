import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class MyDialog extends JDialog {
	JPanel center = new JPanel(new GridLayout(2,3));
	JPanel south = new JPanel(new BorderLayout());
	
	JTextField tf = new JTextField(15);
	JButton okButton = new JButton("辆丰");
	JButton generate = new JButton("积己");
	JButton btn[]=new JButton[6];
	
	
	public MyDialog(JFrame frame,String title) {
		
		super(frame,"楷陛积己");
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		add(generate);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		center.setSize(50,50);
		
		
		String num[]= {"1","2","3","4","5","6"};
		for(int i = 0; i<num.length;i++) {
			btn[i] = new JButton(num[i]);
			center.add(btn[i]);
		}
		add(center,"Center");
		south.add(tf,"Center");
		south.add(generate,"East");
		south.add(okButton,"South");
		add(south,"South");
		setSize(300,250);
		
		
		
		ArrayListLotto al = new ArrayListLotto();
		
		generate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ArrayListLotto al = new ArrayListLotto();
				
				al.randomAdd();
				for(int i =0; i<6;i++) {
					btn[i].setText(Integer.toString(al.get(i)));
					tf.setText(tf.getText()+" "+ btn[i].getText()+" ");
				}
			
				
				
			}
			
		});
		
		
		okButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i =0; i<6;i++) {
					btn[i].setText(null);
					tf.setText(null);
				}
				setVisible(false);
				dispose();
			}
		});
	}
}
