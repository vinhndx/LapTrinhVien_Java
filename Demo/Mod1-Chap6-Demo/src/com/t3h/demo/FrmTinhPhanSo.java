package com.t3h.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTinhPhanSo extends JFrame {

	private JPanel contentPane;
	private JTextField tfTuSo1;
	private JTextField tfMauSo1;
	private JTextField tfTuSo2;
	private JTextField tfMauSo2;
	private JTextField tfKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTinhPhanSo frame = new FrmTinhPhanSo();
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
	public FrmTinhPhanSo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPs = new JLabel("Phan so 1");
		lblPs.setBounds(45, 11, 92, 14);
		contentPane.add(lblPs);
		
		JLabel lblPhanSo = new JLabel("Phan so 2");
		lblPhanSo.setBounds(222, 11, 105, 14);
		contentPane.add(lblPhanSo);
		
		tfTuSo1 = new JTextField();
		tfTuSo1.setBounds(33, 28, 86, 20);
		contentPane.add(tfTuSo1);
		tfTuSo1.setColumns(10);
		
		tfMauSo1 = new JTextField();
		tfMauSo1.setColumns(10);
		tfMauSo1.setBounds(33, 53, 86, 20);
		contentPane.add(tfMauSo1);
		
		tfTuSo2 = new JTextField();
		tfTuSo2.setColumns(10);
		tfTuSo2.setBounds(208, 28, 86, 20);
		contentPane.add(tfTuSo2);
		
		tfMauSo2 = new JTextField();
		tfMauSo2.setColumns(10);
		tfMauSo2.setBounds(208, 53, 86, 20);
		contentPane.add(tfMauSo2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		comboBox.setBounds(144, 40, 47, 22);
		contentPane.add(comboBox);
		
		JLabel lblKetQua = new JLabel("Ket qua");
		lblKetQua.setBounds(43, 87, 71, 14);
		contentPane.add(lblKetQua);
		
		tfKq = new JTextField();
		tfKq.setEditable(false);
		tfKq.setBounds(138, 84, 141, 20);
		contentPane.add(tfKq);
		tfKq.setColumns(10);
		
		JButton btnTinh = new JButton("Tinh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tuSo1 = Integer.parseInt(tfTuSo1.getText());
				int tuSo2 = Integer.parseInt(tfTuSo2.getText());
				int mauSo1 = Integer.parseInt(tfMauSo1.getText());
				int mauSo2 = Integer.parseInt(tfMauSo2.getText());
			}
		});
		btnTinh.setBounds(138, 115, 91, 23);
		contentPane.add(btnTinh);
	}
}
