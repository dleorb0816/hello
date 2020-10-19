
import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

public class gs extends JFrame {

	private JPanel contentPane;
	String show = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gs frame = new gs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public gs() {

		String[] bab = { "--", "고치돈", "제육볶음", "치킨마요" };
		String[] ramyun = { "--", "라면", "치즈라면", "땡초라면" };
		String[] bprice = { "0", "3500", "4000", "3000" };
		String[] rprice = { "0", "2000", "3000", "3500" };
		String[] dprice = { "1500" };
		String[] suryan = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		int sum = 0;

		setTitle("\uC800\uB141 \uBB50 \uBA39\uC744\uB798?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel haksik_panel = new JPanel();
		haksik_panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\uD559\uC2DD\uC774 \uCD5C\uACE0!", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		haksik_panel.setBounds(12, 10, 359, 171);
		contentPane.add(haksik_panel);
		haksik_panel.setLayout(null);

		JLabel bab_label = new JLabel("     \uBC25");
		bab_label.setBounds(12, 33, 57, 15);
		haksik_panel.add(bab_label);

		JLabel ramyun_label = new JLabel("   \uB77C\uBA74");
		ramyun_label.setBounds(12, 69, 57, 15);
		haksik_panel.add(ramyun_label);

		JLabel suryan_label = new JLabel("\uC218\uB7C9");
		suryan_label.setBounds(186, 33, 57, 15);
		haksik_panel.add(suryan_label);

		JTextArea cal_ta = new JTextArea("");
		cal_ta.setLineWrap(true);
		cal_ta.setBounds(383, 10, 78, 137);
		contentPane.add(cal_ta);

		JTextArea cal_ta4 = new JTextArea();
		cal_ta4.setWrapStyleWord(true);
		cal_ta4.setBackground(Color.WHITE);
		cal_ta4.setBounds(383, 168, 195, 24);
		contentPane.add(cal_ta4);

		JComboBox bab_cb = new JComboBox(bab);

		bab_cb.setBounds(60, 30, 120, 21);
		haksik_panel.add(bab_cb);

		JComboBox ramyun_cb = new JComboBox(ramyun);
		ramyun_cb.setBounds(60, 66, 120, 21);
		haksik_panel.add(ramyun_cb);

		JComboBox suryan_cb = new JComboBox(suryan);

		suryan_cb.setBounds(230, 30, 65, 21);
		haksik_panel.add(suryan_cb);

		JCheckBox ddalgi_cb = new JCheckBox("딸기요거트");

		ddalgi_cb.setBounds(43, 106, 115, 23);
		haksik_panel.add(ddalgi_cb);

		JPanel receipt_panel = new JPanel();
		receipt_panel.setBorder(
				new TitledBorder(null, "\uC601\uC218\uC99D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		receipt_panel.setBounds(222, 191, 149, 98);
		contentPane.add(receipt_panel);
		receipt_panel.setLayout(null);

		JRadioButton nobuga_rb = new JRadioButton("\uBD80\uAC00\uC138 \uBBF8\uD3EC\uD568");
		nobuga_rb.setBounds(8, 28, 121, 23);
		receipt_panel.add(nobuga_rb);

		JRadioButton buga_rb = new JRadioButton("\uBD80\uAC00\uC138 \uD3EC\uD568");
		buga_rb.setBounds(8, 53, 121, 23);
		receipt_panel.add(buga_rb);

		JButton cal_btn = new JButton("\uACC4\uC0B0\uD558\uAE30");

		cal_btn.setBounds(491, 212, 102, 32);
		contentPane.add(cal_btn);

		JTextArea cal_ta2 = new JTextArea("");
		cal_ta2.setWrapStyleWord(true);
		cal_ta2.setLineWrap(true);
		cal_ta2.setBounds(460, 10, 59, 137);
		contentPane.add(cal_ta2);

		JTextArea cal_ta3 = new JTextArea("");
		cal_ta3.setBackground(Color.WHITE);
		cal_ta3.setWrapStyleWord(true);
		cal_ta3.setLineWrap(true);
		cal_ta3.setBounds(519, 10, 59, 137);
		contentPane.add(cal_ta3);

		JLabel cal_label = new JLabel("0");
		cal_label.setEnabled(false);
		cal_label.setBounds(383, 240, 45, 15);
		cal_label.setVisible(false);
		contentPane.add(cal_label);

		JLabel cal_label2 = new JLabel("0");
		cal_label2.setBounds(426, 249, 45, 15);
		cal_label2.setVisible(false);
		contentPane.add(cal_label2);

		JLabel cal_label3 = new JLabel("0");
		cal_label3.setVisible(false);
		cal_label3.setBounds(370, 274, 57, 15);

		contentPane.add(cal_label3);

		JLabel cal_label4 = new JLabel("0");
		cal_label4.setVisible(false);
		cal_label4.setBounds(426, 274, 36, 15);
		contentPane.add(cal_label4);

		JLabel cal_label5 = new JLabel("0");
		cal_label5.setVisible(false);
		cal_label5.setBounds(462, 274, 57, 15);
		contentPane.add(cal_label5);

		JTextArea cal_ta7 = new JTextArea();
		cal_ta7.setBounds(519, 146, 59, 24);
		contentPane.add(cal_ta7);

		JTextArea cal_ta6 = new JTextArea();
		cal_ta6.setBounds(460, 146, 59, 24);
		contentPane.add(cal_ta6);

		JTextArea cal_ta5 = new JTextArea();
		cal_ta5.setBounds(383, 146, 78, 24);
		contentPane.add(cal_ta5);

		JButton reset_btn = new JButton("\uCD08\uAE30\uD654");

		reset_btn.setBounds(491, 254, 102, 32);
		contentPane.add(reset_btn);

		JLabel cal_label6 = new JLabel("0");
		cal_label6.setBounds(12, 221, 57, 15);
		cal_label6.setVisible(false);
		contentPane.add(cal_label6);

		JLabel cal_label7 = new JLabel("0");
		cal_label7.setBounds(12, 249, 57, 15);
		cal_label7.setVisible(false);
		contentPane.add(cal_label7);

		suryan_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int index = bab_cb.getSelectedIndex();// 밥의 인덱스값
				int index1 = suryan_cb.getSelectedIndex();// 수량의 인덱스값
				int index2 = ramyun_cb.getSelectedIndex();// 라면의 인덱스값

				int a = Integer.parseInt(bprice[index]);// 밥 가격 지정
				int b = Integer.parseInt(rprice[index2]);// 라면 가격지정
				int c = Integer.parseInt(suryan[index1]);// 수량 갯수 지정
				int bab = a * c;
				int ramyun = b * c;
				int sum = 0;

				if (bab_cb.getSelectedItem().equals("고치돈") && ramyun_cb.getSelectedItem().equals("--")) { // 수량이벤트
					cal_ta.append(bab_cb.getSelectedItem() + "\n");
					// cal_ta.append("딸기 요거트");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + bab + "\n");

					String s = Integer.toString(bab);

					cal_ta4.append(s);
					cal_label.setText(s);

					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
					cal_ta4.setText(null);
				}

				else if (bab_cb.getSelectedItem().equals("제육볶음") && ramyun_cb.getSelectedItem().equals("--")) {
					cal_ta.append(bab_cb.getSelectedItem() + "\n");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + bab + "\n");

					String s2 = Integer.toString(bab);
					cal_label3.setText(s2);
					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
				}

				else if (bab_cb.getSelectedItem().equals("치킨마요") && ramyun_cb.getSelectedItem().equals("--")) {
					cal_ta.append(bab_cb.getSelectedItem() + "\n");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + a * c + "\n");

					String s5 = Integer.toString(bab);
					cal_label5.setText(s5);
					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
				}

				if (bab_cb.getSelectedItem().equals("--") && ramyun_cb.getSelectedItem().equals("라면")) {
					cal_ta.append(ramyun_cb.getSelectedItem() + "\n");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + b * c + "\n");

					String s1 = Integer.toString(ramyun);
					cal_label2.setText(s1);

					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
				} else if (bab_cb.getSelectedItem().equals("--") && ramyun_cb.getSelectedItem().equals("치즈라면")) {
					cal_ta.append(ramyun_cb.getSelectedItem() + "\n");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + b * c + "\n");

					String s6 = Integer.toString(ramyun);
					cal_label6.setText(s6);

					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
				} else if (bab_cb.getSelectedItem().equals("--") && ramyun_cb.getSelectedItem().equals("땡초라면")) {
					cal_ta.append(ramyun_cb.getSelectedItem() + "\n");
					cal_ta2.append(index1 + " \n");
					cal_ta3.append("    " + b * c + "\n");

					String s7 = Integer.toString(ramyun);
					cal_label7.setText(s7);

					suryan_cb.setSelectedIndex(0);
					bab_cb.setSelectedIndex(0);
					ramyun_cb.setSelectedIndex(0);
				}
			}

		});

		ddalgi_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ddalgi_cb.isSelected() == true) {
					cal_ta5.append("딸기요거트");
					cal_ta6.append(1 + "");
					cal_ta7.append("    " + 1500);
					cal_label4.setText("1500");
				} else if (ddalgi_cb.isSelected() == false) {
					cal_ta5.setText(null);
					cal_ta6.setText(null);
					cal_ta7.setText(null);
					cal_label4.setText("0");
				}
			}
		});

		cal_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int q = Integer.parseInt(cal_label2.getText());
				int w = Integer.parseInt(cal_label.getText());
				int e = Integer.parseInt(cal_label3.getText());
				int r = Integer.parseInt(cal_label4.getText());
				int t = Integer.parseInt(cal_label5.getText());
				int y = Integer.parseInt(cal_label6.getText());
				int u = Integer.parseInt(cal_label7.getText());
				int sum = q + w + e + r + t + y + u;
				double sum2 = (q + w + e + r + t + y + u) * 1.1;
				String sum1 = Double.toString(sum2);

				if (buga_rb.isSelected() == true)
					cal_ta4.setText("총합\t" + "                    " + (int) sum2);
				else if (nobuga_rb.isSelected() == true)
					cal_ta4.setText("총합\t" + "                    " + sum);
			}
		});

		reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_ta.setText(null);
				cal_ta2.setText(null);
				cal_ta3.setText(null);
				cal_ta4.setText(null);
				cal_ta5.setText(null);
				cal_ta6.setText(null);
				cal_ta7.setText(null);
				ddalgi_cb.setSelected(false);
				nobuga_rb.setSelected(false);
				buga_rb.setSelected(false);

				cal_label.setText("0");
				cal_label2.setText("0");
				cal_label3.setText("0");
				cal_label4.setText("0");
				cal_label5.setText("0");
			}
		});

	}
}
