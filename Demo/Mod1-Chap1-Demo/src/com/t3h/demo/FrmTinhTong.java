package com.t3h.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTinhTong extends JFrame {

	private JPanel contentPane;
	private JTextField tfSo1;
	private JTextField tfSo2;
	private JTextField tfKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTinhTong frame = new FrmTinhTong();
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
	public FrmTinhTong() {
		setTitle("Tinh tong hai so");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTinhTongHai = new JLabel("Tinh tong hai so");
		lblTinhTongHai.setBounds(98, 11, 173, 14);
		contentPane.add(lblTinhTongHai);

		JLabel lblSoThu = new JLabel("So thu 1");
		lblSoThu.setBounds(10, 43, 71, 14);
		contentPane.add(lblSoThu);

		tfSo1 = new JTextField();
		tfSo1.setBounds(98, 40, 208, 20);
		contentPane.add(tfSo1);
		tfSo1.setColumns(10);

		tfSo2 = new JTextField();
		tfSo2.setColumns(10);
		tfSo2.setBounds(98, 68, 208, 20);
		contentPane.add(tfSo2);

		JLabel lblSoThu_1 = new JLabel("So thu 2");
		lblSoThu_1.setBounds(10, 71, 71, 14);
		contentPane.add(lblSoThu_1);

		tfKetQua = new JTextField();
		tfKetQua.setEditable(false);
		tfKetQua.setColumns(10);
		tfKetQua.setBounds(98, 99, 208, 20);
		contentPane.add(tfKetQua);

		JLabel lblKetQua = new JLabel("Ket qua");
		lblKetQua.setBounds(10, 102, 71, 14);
		contentPane.add(lblKetQua);

		JButton btnTinhTong = new JButton("Tinh tong");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int so1 = Integer.parseInt(tfSo1.getText());
					int so2 = Integer.parseInt(tfSo2.getText());

					int tong = so1 + so2;
					tfKetQua.setText(String.valueOf(tong));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Vui long nhap vao so nguyen");
				}
			}
		});
		btnTinhTong.setBounds(144, 130, 91, 23);
		contentPane.add(btnTinhTong);
	}

}
