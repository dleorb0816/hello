import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.TextArea;
import javax.swing.JTextArea;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bmi extends JFrame {

	private JPanel contentPane;
	private JTextField name_tf;
	private JTextField height_tf;
	private JTextField weight_tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi frame = new bmi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bmi() {
		setTitle("BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 558);
		contentPane = new JPanel();
		TitledBorder tb = new TitledBorder("타이틀제목");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		double Weight = Integer.parseInt(weight_tf.getText());
//		double height = Integer.parseInt(height_tf.getText());
//		double BMI_result= Weight/((height/100)*(height/100));
 
		
		JPanel BMI_jp = new JPanel();
		BMI_jp.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Body Max Index", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		BMI_jp.setBounds(12, 10, 265, 486);
		contentPane.add(BMI_jp);
		BMI_jp.setLayout(null);
		
		JLabel name_label = new JLabel("\uC774   \uB984 :");
		name_label.setBounds(26, 36, 57, 15);
		BMI_jp.add(name_label);
		
		JLabel height_label = new JLabel("   \uD0A4    :");
		height_label.setBounds(26, 72, 57, 15);
		BMI_jp.add(height_label);
		
		JLabel weight_label = new JLabel("\uBAB8\uBB34\uAC8C :");
		weight_label.setBounds(26, 107, 57, 15);
		BMI_jp.add(weight_label);
		
		name_tf = new JTextField();
		name_tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = name_tf.getText();
				
			}
		});
		name_tf.setBounds(77, 33, 116, 21);
		BMI_jp.add(name_tf);
		name_tf.setColumns(10);
		
		height_tf = new JTextField();
		height_tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double height = Integer.parseInt(height_tf.getText());
			}
		});
		height_tf.setColumns(10);
		height_tf.setBounds(77, 69, 116, 21);
		BMI_jp.add(height_tf);
		
		weight_tf = new JTextField();
		weight_tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Weight = Integer.parseInt(weight_tf.getText());
			}
		});
	
		
		weight_tf.setColumns(10);
		weight_tf.setBounds(77, 104, 116, 21);
		BMI_jp.add(weight_tf);
		
		JLabel cm_label = new JLabel("(cm)");
		cm_label.setBounds(196, 72, 57, 15);
		BMI_jp.add(cm_label);
		
		JLabel kg_label = new JLabel("(kg)");
		kg_label.setBounds(196, 107, 57, 15);
		BMI_jp.add(kg_label);
		
		JPanel gender_jp = new JPanel();
		gender_jp.setBorder(new TitledBorder(null, "\uC131 \uBCC4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		gender_jp.setBounds(26, 176, 197, 90);
		BMI_jp.add(gender_jp);
		gender_jp.setLayout(null);
		
		JRadioButton rdbtn_W = new JRadioButton("\uC5EC\uC790");
		rdbtn_W.setBounds(8, 33, 64, 23);
		gender_jp.add(rdbtn_W);
		
		JRadioButton rdbtn_M = new JRadioButton("\uB0A8\uC790");
		rdbtn_M.setBounds(92, 33, 64, 23);
		gender_jp.add(rdbtn_M);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uC2B5  \uAD00", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(26, 302, 197, 144);
		BMI_jp.add(panel);
		panel.setLayout(null);
		
		JCheckBox CB_umju = new JCheckBox("\uC74C\uC8FC");
		CB_umju.setBounds(8, 60, 55, 23);
		panel.add(CB_umju);
		
		JCheckBox CB_smoke = new JCheckBox("\uD761\uC5F0");
		CB_smoke.setBounds(67, 60, 55, 23);
		panel.add(CB_smoke);
		
		JCheckBox CB_undong = new JCheckBox("\uC6B4\uB3D9");
		CB_undong.setBounds(126, 60, 55, 23);
		panel.add(CB_undong);
		
		JPanel BMI_result_panel = new JPanel();
		BMI_result_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		BMI_result_panel.setBounds(289, 73, 208, 214);
		contentPane.add(BMI_result_panel);
		BMI_result_panel.setLayout(null);
		

		JTextArea result_textArea = new JTextArea();
		result_textArea.setBackground(UIManager.getColor("Panel.background"));
		result_textArea.setWrapStyleWord(true);
		result_textArea.setLineWrap(true);
		result_textArea.setBounds(12, 10, 184, 84);
		BMI_result_panel.add(result_textArea);
		
		Canvas result_canvas = new Canvas();
		result_canvas.setBounds(50, 100, 100, 100);
		BMI_result_panel.add(result_canvas);
		
		
		JLabel Opnion_label = new JLabel("\uC18C \uACAC");
		Opnion_label.setBounds(289, 297, 57, 15);
		contentPane.add(Opnion_label);
		
		JPanel Opinion_panel = new JPanel();
		Opinion_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Opinion_panel.setBounds(289, 322, 208, 139);
		contentPane.add(Opinion_panel);
		Opinion_panel.setLayout(null);
		
		JTextArea Opinion_ta1 = new JTextArea();
		Opinion_ta1.setBackground(UIManager.getColor("Panel.background"));
		Opinion_ta1.setBounds(12, 10, 184, 24);
		Opinion_panel.add(Opinion_ta1);
		
		JTextArea Opinion_ta2 = new JTextArea();
		Opinion_ta2.setBackground(UIManager.getColor("Panel.background"));
		Opinion_ta2.setBounds(12, 33, 184, 24);
		Opinion_panel.add(Opinion_ta2);
		
		JTextArea Opinion_ta3 = new JTextArea();
		Opinion_ta3.setBackground(UIManager.getColor("Panel.background"));
		Opinion_ta3.setBounds(12, 56, 184, 24);
		Opinion_panel.add(Opinion_ta3);
		
		JButton check_btn = new JButton("\uC2E0\uCCB4\uC0C1\uD0DC \uCE21\uC815");
		check_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double height, weight,BMI;
				height = Double.parseDouble(height_tf.getText());
				weight = Double.parseDouble(weight_tf.getText());
				//BMI = Math.round(weight/((height/100)*(height/100))*100)/100.0;
				BMI = weight/((height/100)*(height/100));
				String name = name_tf.getText();
				//result_textArea.setText(String.format("%.5f", BMI));
				if(rdbtn_W.isSelected()==true) {
					if(BMI<18.5) {
						result_textArea.setText("아름다운 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(저체중)입니다.");
						result_canvas.setBackground(Color.BLUE);
					}
					else if(BMI>=18.5 && BMI<=22.9) {
						result_textArea.setText("아름다운 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(정상)입니다.");
						result_canvas.setBackground(Color.green);
					}else if(BMI>=23 && BMI<=24.9) {
						result_textArea.setText("아름다운 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(과체중)입니다.");
						result_canvas.setBackground(Color.red);
					}else if(BMI>=25 && BMI<=29.9) {
						result_textArea.setText("아름다운 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(중도비만)입니다.");
						result_canvas.setBackground(Color.red);
					}else if(BMI>=30) {
						result_textArea.setText("아름다운 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(고도비만)입니다.");
						result_canvas.setBackground(Color.red);
					}
				}
				
				
				else if(rdbtn_M.isSelected()==true) {
					if(BMI<18.5) {
						result_textArea.setText("멋진 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(저체중)입니다.");
						result_canvas.setBackground(Color.BLUE);
					}
					else if(BMI>=18.5 && BMI<=22.9) {
						result_textArea.setText("멋진 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(정상)입니다.");
						result_canvas.setBackground(Color.GREEN);
					}else if(BMI>=23 && BMI<=24.9) {
						result_textArea.setText("멋진 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(과체중)입니다.");
						result_canvas.setBackground(Color.RED);
					}else if(BMI>=25 && BMI<=29.9) {
						result_textArea.setText("멋진 "+name+"의 신체질량지수는 "+String.format("%.5f", BMI) + "(중도비만)입니다.");
						result_canvas.setBackground(Color.RED);
					}else if(BMI>=30) {
						result_textArea.setText("멋진 "+name+"의 신체질량지수는 "+BMI + "(고도비만)입니다.");
						result_canvas.setBackground(Color.RED);
					}
				}
				
				
				if(CB_umju.isSelected()==true) {
					Opinion_ta1.setText("술 그만 마셔요 !! \n");
				}
				if(CB_smoke.isSelected()==true) {
					Opinion_ta2.setText("담배 끊으세요!! \n");
				}
				if(CB_undong.isSelected()==false) {
					Opinion_ta3.setText("운동 좀 하세요!! \n");
				}
				}
				catch(NumberFormatException e1) {
					 result_textArea.setText("이름, 키, 체중을 정확히 입력하세요");
					 Opinion_ta1.setText(" ");
				}
				
			}
		});
		
		check_btn.setBounds(376, 10, 132, 23);
		contentPane.add(check_btn);
		
		JLabel lblNewLabel = new JLabel("BMI \uACB0\uACFC");
		lblNewLabel.setBounds(289, 48, 57, 15);
		lblNewLabel.setBackground(Color.red);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
	
	}
}



