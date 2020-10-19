import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Canvas;

public class lotto extends JFrame {

	private JPanel contentPane;

	MyDialog dialog;
	MyDialog1 dialog1;
	MyDialog2 dialog2;

	private JLabel sort;
	private JLabel suryang;

	public lotto() {
		String[] bok = { "--", "연금복권", "즉석복권", "로또복권", "스포츠복권" };
		String[] bok_price = { "--", "1000", "500", "1500", "2000" };
		String[] bok_suryang = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		setTitle("\uB85C\uB610 \uD310\uB9E4 \uBC0F \uBC88\uD638\uC0DD\uC131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 333);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton ynum = new JButton("\uC5F0\uAE08\uC790\uB3D9");
		ynum.setToolTipText("\uB85C\uB610 \uC790\uB3D9");
		
		
		dialog = new MyDialog(this, "Test Dialog");
		ynum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dialog.setVisible(true);
				dialog.setLocation(200, 500);
			}
		});
		getContentPane().add(ynum);
		setSize(436, 345);
		setVisible(true);
		ynum.setBounds(7, 256, 97, 23);
		contentPane.add(ynum);

		sort = new JLabel("\uBCF5\uAD8C \uC885\uB958 :");
		sort.setBounds(29, 105, 61, 34);
		contentPane.add(sort);

		suryang = new JLabel("\uC218\uB7C9       :");
		suryang.setBounds(29, 149, 61, 34);
		contentPane.add(suryang);

		JComboBox bsort_cb = new JComboBox(bok);

		bsort_cb.setBounds(102, 112, 85, 21);
		contentPane.add(bsort_cb);

		JComboBox bsuryang_cb = new JComboBox(bok_suryang);

		bsuryang_cb.setBounds(102, 156, 85, 21);
		contentPane.add(bsuryang_cb);

		JTextArea cal_ta = new JTextArea();
		cal_ta.setBounds(223, 23, 61, 189);
		contentPane.add(cal_ta);

		JTextArea cal_ta2 = new JTextArea();
		cal_ta2.setBounds(282, 23, 61, 189);
		contentPane.add(cal_ta2);

		JTextArea cal_ta3 = new JTextArea();
		cal_ta3.setBounds(342, 23, 61, 189);
		contentPane.add(cal_ta3);

		JButton cal_btn = new JButton("\uACC4\uC0B0");

		cal_btn.setBounds(223, 256, 85, 23);
		contentPane.add(cal_btn);

		JButton reset_btn = new JButton("\uCD08\uAE30\uD654");

		reset_btn.setBounds(318, 256, 85, 23);
		contentPane.add(reset_btn);

		JTextArea cal_ta4 = new JTextArea();
		cal_ta4.setBounds(223, 222, 180, 24);
		contentPane.add(cal_ta4);

		JLabel cal_label = new JLabel("0");
		cal_label.setBounds(39, 0, 25, 15);
		cal_label.setVisible(false);
		contentPane.add(cal_label);

		JLabel cal_label2 = new JLabel("0");
		cal_label2.setBounds(49, 0, 25, 15);
		cal_label2.setVisible(false);
		contentPane.add(cal_label2);

		JLabel cal_label3 = new JLabel("0");
		cal_label3.setBounds(12, 0, 25, 15);
		cal_label3.setVisible(false);
		contentPane.add(cal_label3);

		JLabel cal_label4 = new JLabel("0");
		cal_label4.setBounds(29, 0, 25, 15);
		cal_label4.setVisible(false);
		contentPane.add(cal_label4);

		JButton lnum = new JButton("\uB85C\uB610\uC790\uB3D9");
		dialog1 = new MyDialog1(this, "Test Dialog");
		lnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dialog1.setVisible(true);
				dialog1.setLocation(500, 500);
			}
		});
		lnum.setBounds(114, 256, 97, 23);
		contentPane.add(lnum);

		JLabel daebak_label = new JLabel("");
		daebak_label.setIcon(
				new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\LOTTO\\images\\\uB300\uBC15\uAE30\uC6D0.png"));
		daebak_label.setBounds(7, 23, 180, 79);
		contentPane.add(daebak_label);

		JButton fortune_btn = new JButton("");
		dialog2 = new MyDialog2(this, "오늘의 운세");
		fortune_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog2.setVisible(true);
				dialog2.setLocation(800, 500);
			}
		});
		fortune_btn.setIcon(
				new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\LOTTO\\images\\\uD3EC\uCD98\uCFE0\uD0A4.png"));
		fortune_btn.setBounds(112, 189, 66, 57);
		contentPane.add(fortune_btn);

		JLabel wunsae_label = new JLabel("\uC624\uB298\uC758 \uC6B4\uC138\uB294?");
		wunsae_label.setBounds(12, 193, 97, 23);
		contentPane.add(wunsae_label);

		JLabel lblNewLabel = new JLabel("CLICK!->");
		lblNewLabel.setBounds(31, 226, 78, 15);
		contentPane.add(lblNewLabel);

		bsuryang_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int index = bsort_cb.getSelectedIndex(); // 복권의 인덱스 값
				int index1 = bsuryang_cb.getSelectedIndex(); // 수량의 인덱스 값

				int a = Integer.parseInt(bok_price[index]); // 복권 가격지정
				int b = Integer.parseInt(bok_suryang[index1]); // 수량 갯수지정
				int total = a * b;

				if (bsort_cb.getSelectedItem().equals("연금복권")) {
					cal_ta.append(bsort_cb.getSelectedItem() + "\n");
					cal_ta2.append(" " + index1 + "\n");
					cal_ta3.append("" + total + "\n");

					String s = Integer.toString(total);
					cal_label.setText(s);

					bsuryang_cb.setSelectedIndex(0); // 선택했을때 수량 콤보박스 초기화
					bsort_cb.setSelectedIndex(0); // 선택했을때 복권 콤보박스 초기화

				} else if (bsort_cb.getSelectedItem().equals("즉석복권")) {
					cal_ta.append(bsort_cb.getSelectedItem() + "\n");
					cal_ta2.append(" " + index1 + "\n");
					cal_ta3.append("" + total + "\n");

					String s1 = Integer.toString(total);
					cal_label2.setText(s1);

					bsuryang_cb.setSelectedIndex(0); // 선택했을때 수량 콤보박스 초기화
					bsort_cb.setSelectedIndex(0); // 선택했을때 복권 콤보박스 초기화
				} else if (bsort_cb.getSelectedItem().equals("로또복권")) {
					cal_ta.append(bsort_cb.getSelectedItem() + "\n");
					cal_ta2.append(" " + index1 + "\n");
					cal_ta3.append("" + total + "\n");

					String s2 = Integer.toString(total);
					cal_label3.setText(s2);

					bsuryang_cb.setSelectedIndex(0); // 선택했을때 수량 콤보박스 초기화
					bsort_cb.setSelectedIndex(0); // 선택했을때 복권 콤보박스 초기화

				} else if (bsort_cb.getSelectedItem().equals("스포츠복권")) {
					cal_ta.append(bsort_cb.getSelectedItem() + "\n");
					cal_ta2.append(" " + index1 + "\n");
					cal_ta3.append("" + total + "\n");

					String s3 = Integer.toString(total);
					cal_label4.setText(s3);

					bsuryang_cb.setSelectedIndex(0); // 선택했을때 수량 콤보박스 초기화
					bsort_cb.setSelectedIndex(0); // 선택했을때 복권 콤보박스 초기화
				}

			}
		});

		cal_btn.addActionListener(new ActionListener() { // 계산 결과 이벤트
			public void actionPerformed(ActionEvent e) {
				int q = Integer.parseInt(cal_label.getText());
				int w = Integer.parseInt(cal_label2.getText());
				int e1 = Integer.parseInt(cal_label3.getText());
				int r = Integer.parseInt(cal_label4.getText());

				int sum = q + w + e1 + r;

				cal_ta4.setText("총합:                               " + sum);
			}
		});

		reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_ta.setText(null);
				cal_ta2.setText(null);
				cal_ta3.setText(null);
				cal_ta4.setText(null);

				cal_label.setText("0");
				cal_label2.setText("0");
				cal_label3.setText("0");
				cal_label4.setText("0");

			}
		});

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lotto frame = new lotto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
