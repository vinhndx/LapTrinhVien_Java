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

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public FrmLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 427, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Username");
		label.setBounds(27, 41, 120, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 38, 198, 20);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 63, 192, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String pass = String.valueOf(passwordField.getPassword());
				
				User user = UserDAO.getUserByUsername(username);
				if(user == null){
					JOptionPane.showMessageDialog(null, "Sai username!");
					return;
				}
				
				String hashPass = UserDAO.getMD5(pass, user.getSalt());
				if(hashPass != null && hashPass.equals(user.getPass())){
					JOptionPane.showMessageDialog(null, "Dang nhap thanh cong!");
				} else {
					JOptionPane.showMessageDialog(null, "Dang nhap that bai!");
				}
				
				
			}
		});
		btnLogin.setBounds(184, 94, 91, 23);
		contentPane.add(btnLogin);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(27, 66, 120, 14);
		contentPane.add(label_1);
	}

}
