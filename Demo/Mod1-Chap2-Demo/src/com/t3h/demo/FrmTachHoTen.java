package com.t3h.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTachHoTen extends JFrame {

	private JPanel contentPane;
	private JTextField tfHoTen;
	private JTextField tfHo;
	private JTextField tfTenDem;
	private JTextField tfTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTachHoTen frame = new FrmTachHoTen();
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
	public FrmTachHoTen() {
		setTitle("Tach ho ten");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTachHoTen = new JLabel("Tach ho ten");
		lblTachHoTen.setBounds(133, 11, 189, 14);
		contentPane.add(lblTachHoTen);
		
		JLabel lblHoVaTen = new JLabel("Ho Va Ten");
		lblHoVaTen.setBounds(10, 36, 76, 14);
		contentPane.add(lblHoVaTen);
		
		tfHoTen = new JTextField();
		tfHoTen.setBounds(96, 33, 298, 20);
		contentPane.add(tfHoTen);
		tfHoTen.setColumns(10);
		
		tfHo = new JTextField();
		tfHo.setEditable(false);
		tfHo.setColumns(10);
		tfHo.setBounds(96, 70, 298, 20);
		contentPane.add(tfHo);
		
		JLabel lblHo = new JLabel("Ho");
		lblHo.setBounds(10, 73, 76, 14);
		contentPane.add(lblHo);
		
		tfTenDem = new JTextField();
		tfTenDem.setEditable(false);
		tfTenDem.setColumns(10);
		tfTenDem.setBounds(96, 101, 298, 20);
		contentPane.add(tfTenDem);
		
		JLabel lblTenDem = new JLabel("Ten Dem");
		lblTenDem.setBounds(10, 104, 76, 14);
		contentPane.add(lblTenDem);
		
		tfTen = new JTextField();
		tfTen.setEditable(false);
		tfTen.setColumns(10);
		tfTen.setBounds(96, 132, 298, 20);
		contentPane.add(tfTen);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setBounds(10, 135, 76, 14);
		contentPane.add(lblTen);
		
		JButton btnTach = new JButton("Tach");
		btnTach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hoTen = tfHoTen.getText().trim();
				tfHo.setText(hoTen.substring(0, hoTen.indexOf(" ")));
				tfTen.setText(hoTen.substring(hoTen.lastIndexOf(" ")).trim());
				tfTenDem.setText(hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" ")).trim());
				
			}
		});
		btnTach.setBounds(157, 163, 91, 23);
		contentPane.add(btnTach);
	}
}
