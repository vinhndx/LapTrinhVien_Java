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

public class FrmXinChao extends JFrame {

	private JPanel contentPane;
	private JTextField tfHoTen;
	private JLabel lbCauChao;
	private String CauChao = "Xin chao %s, chao mung ban den voi ....";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmXinChao frame = new FrmXinChao();
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
	public FrmXinChao() {
		setTitle("Xin Chao");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHoTen = new JLabel("Ho ten");
		lblHoTen.setBounds(59, 23, 69, 14);
		contentPane.add(lblHoTen);
		
		tfHoTen = new JTextField();
		tfHoTen.setBounds(138, 20, 262, 20);
		contentPane.add(tfHoTen);
		tfHoTen.setColumns(10);
		
		lbCauChao = new JLabel("");
		lbCauChao.setBounds(10, 53, 390, 14);
		contentPane.add(lbCauChao);
		
		JButton btnXinChao = new JButton("Xin chao");
		btnXinChao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String hoTen = tfHoTen.getText();
				lbCauChao.setText(String.format(CauChao, hoTen));
			}
		});
		btnXinChao.setBounds(157, 80, 91, 23);
		contentPane.add(btnXinChao);
	}
}
