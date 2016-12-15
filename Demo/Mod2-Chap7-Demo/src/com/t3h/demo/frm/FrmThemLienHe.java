package com.t3h.demo.frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.t3h.demo.bean.LienHe;
import com.t3h.demo.dao.LienHeDAO;
import com.t3h.demo.dao.UserDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmThemLienHe extends JFrame {

	private JPanel contentPane;
	private JTextField tfHoTen;
	private JTextField tfSdt;
	private JTextField tfHinhAnh;
	private JLabel lbHinhAnh;


	/**
	 * Create the frame.
	 */
	public FrmThemLienHe() {
		setTitle("Them Lien He");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHoTen = new JLabel("Ho ten");
		lblHoTen.setBounds(10, 47, 79, 14);
		contentPane.add(lblHoTen);
		
		JLabel lblDienThoai = new JLabel("Dien thoai");
		lblDienThoai.setBounds(10, 72, 79, 14);
		contentPane.add(lblDienThoai);
		
		JLabel lblHinhAnh = new JLabel("Hinh anh");
		lblHinhAnh.setBounds(10, 106, 79, 14);
		contentPane.add(lblHinhAnh);
		
		tfHoTen = new JTextField();
		tfHoTen.setBounds(95, 44, 207, 20);
		contentPane.add(tfHoTen);
		tfHoTen.setColumns(10);
		
		tfSdt = new JTextField();
		tfSdt.setColumns(10);
		tfSdt.setBounds(95, 72, 207, 20);
		contentPane.add(tfSdt);
		
		tfHinhAnh = new JTextField();
		tfHinhAnh.setColumns(10);
		tfHinhAnh.setBounds(95, 103, 207, 20);
		contentPane.add(tfHinhAnh);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser("D:/a");
				chooser.setAcceptAllFileFilterUsed(false);
				chooser.setFileFilter(new FileNameExtensionFilter("Image", "jpg", "png", "gif"));
				int status = chooser.showOpenDialog(null);
				
				if(status == JFileChooser.APPROVE_OPTION){
					String filename = chooser.getSelectedFile().getAbsolutePath();
					tfHinhAnh.setText(filename);
					ImageIcon imageIcon = new ImageIcon(filename);
					Image image = imageIcon.getImage().getScaledInstance(lbHinhAnh.getWidth(), lbHinhAnh.getHeight(), Image.SCALE_DEFAULT);
					
					lbHinhAnh.setIcon(new ImageIcon(image));
				}
			}
		});
		btnNewButton.setBounds(305, 102, 43, 23);
		contentPane.add(btnNewButton);
		
		lbHinhAnh = new JLabel("");
		lbHinhAnh.setBounds(365, 11, 182, 251);
		contentPane.add(lbHinhAnh);
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LienHe lh = new LienHe(tfHoTen.getText(), tfSdt.getText(), tfHinhAnh.getText());
				
				boolean kq = LienHeDAO.themLienHe(lh);
				
				JOptionPane.showMessageDialog(null, "Them lien he " +
				(kq ? "thanh cong!" : "that bat!"));
				
			}
		});
		btnThem.setBounds(148, 155, 91, 23);
		contentPane.add(btnThem);
	}

}
