package com.t3h.demo.frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmQuanLyLienHe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmQuanLyLienHe frame = new FrmQuanLyLienHe();
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
	public FrmQuanLyLienHe() {
		setTitle("Quan Ly Lien He");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnChucNang = new JMenu("Chuc nang");
		menuBar.add(mnChucNang);
		
		JMenuItem mntmDangNhap = new JMenuItem("Dang nhap");
		mntmDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrmLogin().setVisible(true);
			}
		});
		mnChucNang.add(mntmDangNhap);
		
		JMenuItem mntmDangKy = new JMenuItem("Dang ky");
		mntmDangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmDangKy().setVisible(true);
			}
		});
		mnChucNang.add(mntmDangKy);
		
		JMenu mnLienHe = new JMenu("Lien He");
		menuBar.add(mnLienHe);
		
		JMenuItem mntmThemLienHe = new JMenuItem("Them Lien He");
		mntmThemLienHe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmThemLienHe().setVisible(true);
			}
		});
		mnLienHe.add(mntmThemLienHe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
