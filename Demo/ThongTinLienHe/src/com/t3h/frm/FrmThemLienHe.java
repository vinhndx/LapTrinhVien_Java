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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmThemLienHe extends JFrame {

	private JPanel contentPane;
	private JTextField tfTen;
	private JTextField tfSDT;
	private JTextField tfHinhAnh;


	/**
	 * Create the frame.
	 */
	public FrmThemLienHe() {
		
		setTitle("Them Lien He");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 382, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThemLienHe = new JLabel("Them Lien He");
		lblThemLienHe.setFont(new Font("Arial", Font.PLAIN, 17));
		lblThemLienHe.setBounds(126, 11, 238, 14);
		contentPane.add(lblThemLienHe);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setBounds(25, 50, 48, 14);
		contentPane.add(lblTen);
		
		JLabel lblSdt = new JLabel("SDT");
		lblSdt.setBounds(25, 75, 48, 14);
		contentPane.add(lblSdt);
		
		JLabel lblHinhAnh = new JLabel("Hinh anh");
		lblHinhAnh.setBounds(25, 103, 48, 14);
		contentPane.add(lblHinhAnh);
		
		tfTen = new JTextField();
		tfTen.setBounds(111, 48, 198, 20);
		contentPane.add(tfTen);
		tfTen.setColumns(10);
		
		tfSDT = new JTextField();
		tfSDT.setColumns(10);
		tfSDT.setBounds(111, 75, 198, 20);
		contentPane.add(tfSDT);
		
		tfHinhAnh = new JTextField();
		tfHinhAnh.setColumns(10);
		tfHinhAnh.setBounds(111, 100, 198, 20);
		contentPane.add(tfHinhAnh);
		
		JButton button = new JButton("...");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser("D:/image");
				
				chooser.setFileFilter(new FileNameExtensionFilter("Image file", "jpg", "png", "gif"));
				chooser.setAcceptAllFileFilterUsed(false);
				
				int status  = chooser.showOpenDialog(null);
				if(status == JFileChooser.APPROVE_OPTION){
					String path = chooser.getSelectedFile().getAbsolutePath();
					tfHinhAnh.setText(path);
				}
			}
		});
		button.setBounds(319, 99, 30, 23);
		contentPane.add(button);
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LienHe lienHe = new LienHe(tfTen.getText(), tfSDT.getText(), tfHinhAnh.getText());
				
				try {
					LienHeService.themLienHe(lienHe);
					JOptionPane.showMessageDialog(null, "Them lien he thanh cong!");
				} catch (IOException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Them lien he that bai!");
				}
				
				dispose();
			}
		});
		btnThem.setBounds(136, 131, 91, 23);
		contentPane.add(btnThem);
	}
}
