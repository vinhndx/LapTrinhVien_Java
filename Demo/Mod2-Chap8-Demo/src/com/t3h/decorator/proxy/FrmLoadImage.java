package com.t3h.decorator.proxy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLoadImage extends JFrame {

	private JPanel contentPane;
	private ProxyImage proxyImage = new ProxyImage("Chrysanthemum.jpg");
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLoadImage frame = new FrmLoadImage();
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
	public FrmLoadImage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 47, 422, 215);
		contentPane.add(lblNewLabel);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				load();
			}
		});
		btnLoad.setBounds(37, 11, 91, 23);
		contentPane.add(btnLoad);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(null);
				
			}
		});
		btnClear.setBounds(170, 11, 91, 23);
		contentPane.add(btnClear);
	}

	private void load() {
		String username = JOptionPane.showInputDialog("Nhap username:");
		String password = JOptionPane.showInputDialog("Nhap password:");
		proxyImage.checkLogin(username, password);
		proxyImage.display(lblNewLabel);
	}
}
