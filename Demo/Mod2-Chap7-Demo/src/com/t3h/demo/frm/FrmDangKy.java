package com.t3h.demo.frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.t3h.demo.bean.User;
import com.t3h.demo.dao.UserDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class FrmDangKy extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public FrmDangKy() {
		setTitle("Dang ky");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 441, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 44, 120, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 69, 120, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(136, 41, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 66, 192, 20);
		contentPane.add(passwordField);
		
		JButton btnResgister = new JButton("Register");
		btnResgister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String pass = String.valueOf(passwordField.getPassword());
				String salt = new Random().nextInt(100000) + "";
				
				User user = new User(username, pass, salt);
				
				boolean kq = UserDAO.insertUser(user);
				
				JOptionPane.showMessageDialog(null, "Them user " +
				(kq ? "thanh cong!" : "that bat!"));
			}
		});
		btnResgister.setBounds(164, 114, 91, 23);
		contentPane.add(btnResgister);
	}
}
