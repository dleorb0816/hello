package java0924;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex7 extends JFrame {
	
	public Ex7() {
		setTitle("시계");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel clockLable = new JLabel("");
		clockLable.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		Container contentPane = getContentPane();
		contentPane.add(clockLable, BorderLayout.CENTER);
		
		JButton btnStart = new JButton("Start");
		JButton btnStop = new JButton("Stop");
		btnStop.setEnabled(false);
		
		// 시계 구동
		btnStart.addActionListener(event -> {
			
			new Thread(() -> {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Date date = new Date();	//현재 지금 시간을 받아오는 기능
					SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss");	//받아올 양식을 지정
					String str = sdf.format(date); //받아온 값을 지정된 양식에 적용하여 str 변수에 저장
					clockLable.setText(str);	//레이블에 str내용 출력
				}//while
			}).start();//버튼눌렀을때 시작
			
			btnStart.setEnabled(false);
			btnStop.setEnabled(true);
		});
		
		// 시계 중지
		btnStop.addActionListener(e -> {
			
			
			btnStop.setEnabled(false);
			btnStart.setEnabled(true);
		});
		
		JPanel panel = new JPanel();
		panel.add(btnStart);
		panel.add(btnStop);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		
		setLocationByPlatform(true);
		setSize(600, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex7();
		
		/*
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss");
				String str = sdf.format(date);
				System.out.println(str);
			}
		}).start();
		*/
		
	} // main

}
