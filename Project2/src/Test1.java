import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test1 extends JFrame {

	public Test1() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JButton btn = new JButton("ok");
		JLabel lbl = new JLabel("cancel");
		contentPane.add( btn);
		contentPane.add(lbl);
		
		btn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("ok");
			}
		});

		setSize(300, 150);
		setVisible(true);

	}
	public static void main(String[] args) {
		
		new Test1();
		
	}

}
