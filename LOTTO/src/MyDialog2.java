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
	private JButton check_btn = new JButton("확인");
	
	
	public String getRandTestString() {
	      String RandomNames[] = {"오늘은 좋은일이 일어날것 같아요","짝사랑이 있다면 고백해보세요","힘들었던 일들이 풀리고 행복해질것입니다",
	    		  					"고민이 다 풀릴것입니다","가족과의 사이가 가까워집니다","스스로 졌다고 생각하면 진다.",
	    		  					"좌절이란 있어도 포기란 없다.","매일 희망이라는 태양이 떠오르게 하자"};
	      
	      Random oRandom = new Random();
	      int randNum = oRandom.nextInt(RandomNames.length);
	      return RandomNames[randNum];
	   }
	
	public MyDialog2(JFrame frame, String title) {
		super(frame,"포츈쿠키!");
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
