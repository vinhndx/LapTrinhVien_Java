package com.t3h.frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.t3h.bean.LienHe;
import com.t3h.service.LienHeService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JSeparator;

public class FrmTimLienHe extends JFrame {

	private JPanel contentPane;
	private JTextField tfTen;
	private JTextField tfSDT;
	private JTextField tfHinhAnh;
	private JTextField tfTimTen;
	private List<LienHe> dsLienHe;


	/**
	 * Create the frame.
	 */
	public FrmTimLienHe(List<LienHe> ds) {
		this.dsLienHe = ds;
		
		setTitle("Tim Lien He");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 382, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThemLienHe = new JLabel("Tim Lien He");
		lblThemLienHe.setFont(new Font("Arial", Font.PLAIN, 17));
		lblThemLienHe.setBounds(126, 11, 238, 14);
		contentPane.add(lblThemLienHe);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setBounds(25, 109, 48, 14);
		contentPane.add(lblTen);
		
		JLabel lblSdt = new JLabel("SDT");
		lblSdt.setBounds(25, 134, 48, 14);
		contentPane.add(lblSdt);
		
		JLabel lblHinhAnh = new JLabel("Hinh anh");
		lblHinhAnh.setBounds(25, 162, 48, 14);
		contentPane.add(lblHinhAnh);
		
		tfTen = new JTextField();
		tfTen.setEditable(false);
		tfTen.setBounds(111, 107, 198, 20);
		contentPane.add(tfTen);
		tfTen.setColumns(10);
		
		tfSDT = new JTextField();
		tfSDT.setEditable(false);
		tfSDT.setColumns(10);
		tfSDT.setBounds(111, 134, 198, 20);
		contentPane.add(tfSDT);
		
		tfHinhAnh = new JTextField();
		tfHinhAnh.setEditable(false);
		tfHinhAnh.setColumns(10);
		tfHinhAnh.setBounds(111, 159, 198, 20);
		contentPane.add(tfHinhAnh);
		
		tfTimTen = new JTextField();
		tfTimTen.setBounds(111, 39, 198, 20);
		contentPane.add(tfTimTen);
		tfTimTen.setColumns(10);
		
		JLabel label = new JLabel("Ten");
		label.setBounds(10, 42, 48, 14);
		contentPane.add(label);
		
		JButton btnTim = new JButton("Tim");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (LienHe lienHe : dsLienHe) {
					if(lienHe.getTen().equals(tfTimTen.getText())){
						tfTen.setText(lienHe.getTen());
						tfSDT.setText(lienHe.getSdt());
						tfHinhAnh.setText(lienHe.getHinhAnh());
						break;
					}
				}
			}
		});
		btnTim.setBounds(147, 70, 91, 23);
		contentPane.add(btnTim);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 92, 354, 7);
		contentPane.add(separator);
	}
}
