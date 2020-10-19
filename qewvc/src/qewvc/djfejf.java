package qewvc;
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

public class djfejf extends JFrame {

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
					TestFrame frame = new TestFrame();
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
	public djfejf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 558);
		contentPane = new JPanel();
		TitledBorder tb = new TitledBorder("타이틀제목");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		rdbtn_M.setSelected(true);
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
		
		JButton check_btn = new JButton("\uC2E0\uCCB4\uC0C1\uD0DC \uCE21\uC815");
		check_btn.setBounds(376, 10, 132, 23);
		contentPane.add(check_btn);
		
		JLabel lblNewLabel = new JLabel("BMI \uACB0\uACFC");
		lblNewLabel.setBounds(289, 48, 57, 15);
		contentPane.add(lblNewLabel);
		
		JPanel BMI_result_panel = new JPanel();
		BMI_result_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		BMI_result_panel.setBounds(289, 73, 208, 214);
		contentPane.add(BMI_result_panel);
		BMI_result_panel.setLayout(null);
		
		JTextArea result_textArea = new JTextArea();
		result_textArea.setBackground(UIManager.getColor("Panel.background"));
		result_textArea.setBounds(12, 10, 186, 68);
		BMI_result_panel.add(result_textArea);
		
		Canvas result_canvas = new Canvas();
		result_canvas.setBounds(49, 100, 100, 100);
		BMI_result_panel.add(result_canvas);
		
		JLabel Opnion_label = new JLabel("\uC18C \uACAC");
		Opnion_label.setBounds(289, 297, 57, 15);
		contentPane.add(Opnion_label);
		
		JPanel Opinion_panel = new JPanel();
		Opinion_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Opinion_panel.setBounds(289, 322, 208, 139);
		contentPane.add(Opinion_panel);
		Opinion_panel.setLayout(null);
		
		JTextArea Opinion_ta = new JTextArea();
		Opinion_ta.setBackground(UIManager.getColor("Panel.background"));
		Opinion_ta.setBounds(12, 10, 184, 77);
		Opinion_panel.add(Opinion_ta);
	}
}
