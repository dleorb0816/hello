import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyDialog2 extends JDialog{

	private JLabel lbl = new JLabel();
	private JButton check_btn = new JButton("Ȯ��");
	
	
	public String getRandTestString() {
	      String RandomNames[] = {"������ �������� �Ͼ�� ���ƿ�","¦����� �ִٸ� ����غ�����","������� �ϵ��� Ǯ���� �ູ�������Դϴ�",
	    		  					"����� �� Ǯ�����Դϴ�","�������� ���̰� ��������ϴ�","������ ���ٰ� �����ϸ� ����.",
	    		  					"�����̶� �־ ����� ����.","���� ����̶�� �¾��� �������� ����"};
	      
	      Random oRandom = new Random();
	      int randNum = oRandom.nextInt(RandomNames.length);
	      return RandomNames[randNum];
	   }
	
	public MyDialog2(JFrame frame, String title) {
		super(frame,"������Ű!");
		setLayout(new BorderLayout());
		add(lbl,BorderLayout.CENTER);
		add(check_btn,BorderLayout.SOUTH);
		setSize(300,150);
		
		check_btn.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText(getRandTestString());
				
			}
			
		});
	}

}
