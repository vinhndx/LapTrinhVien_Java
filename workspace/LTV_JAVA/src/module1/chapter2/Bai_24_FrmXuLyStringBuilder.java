package module1.chapter2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class Bai_24_FrmXuLyStringBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtSb;
	private JTextField txtSb1;
	private JTextField txtSb2;
	private JTextField txtViTri;
	private JTextField txtBatDau;
	private JTextField txtKetThuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai_24_FrmXuLyStringBuilder frame = new Bai_24_FrmXuLyStringBuilder();
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
	public Bai_24_FrmXuLyStringBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblChuiSb = new JLabel("Chu\u1ED7i sb");
		lblChuiSb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblChuiSb_1 = new JLabel("Chu\u1ED7i sb1");
		lblChuiSb_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblChuiSb_2 = new JLabel("Chu\u1ED7i sb2");
		lblChuiSb_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblVTrChn = new JLabel("V\u1ECB tr\u00ED ch\u00E8n");
		lblVTrChn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblVTru = new JLabel("V\u1ECB tr\u00ED \u0111\u1EA7u");
		lblVTru.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblVTrCui = new JLabel("V\u1ECB tr\u00ED cu\u1ED1i");
		lblVTrCui.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtSb = new JTextField();
		txtSb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSb.setColumns(10);
		
		txtSb1 = new JTextField();
		txtSb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSb1.setColumns(10);
		
		txtSb2 = new JTextField();
		txtSb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSb2.setColumns(10);
		
		txtViTri = new JTextField();
		txtViTri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtViTri.setColumns(10);
		
		txtBatDau = new JTextField();
		txtBatDau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBatDau.setColumns(10);
		
		txtKetThuc = new JTextField();
		txtKetThuc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtKetThuc.setColumns(10);
		
		JButton btnXuLyChuoi = new JButton("X\u1EED l\u00FD chu\u1ED7i");
		btnXuLyChuoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblVTru)
							.addGap(62)
							.addComponent(txtBatDau, 257, 257, 257))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblVTrChn)
							.addGap(56)
							.addComponent(txtViTri, 257, 257, 257))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblChuiSb)
								.addComponent(lblChuiSb_1)
								.addComponent(lblChuiSb_2)
								.addComponent(lblVTrCui)
								.addComponent(lblKtQu))
							.addGap(57)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(scrollPane)
								.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtSb2)
									.addComponent(txtSb1)
									.addComponent(txtSb, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
								.addComponent(txtKetThuc, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
								.addComponent(btnXuLyChuoi))))
					.addGap(56))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChuiSb)
						.addComponent(txtSb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChuiSb_1)
						.addComponent(txtSb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChuiSb_2)
						.addComponent(txtSb2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVTrChn)
						.addComponent(txtViTri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVTru)
						.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVTrCui)
						.addComponent(txtKetThuc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(btnXuLyChuoi)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKtQu)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		
		JTextArea txtaKetQua = new JTextArea();
		scrollPane.setViewportView(txtaKetQua);
		contentPane.setLayout(gl_contentPane);
	}
}
