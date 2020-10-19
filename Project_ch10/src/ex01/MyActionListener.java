package ex01;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class MyActionListener implements  ActionListener {

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("ACTION"))
			b.setText("¾×¼Ç");
		else
			b.setText("ACTION");
	
}

	public static void main(String[] args) {
		new IndepClassListener();
	}

}
