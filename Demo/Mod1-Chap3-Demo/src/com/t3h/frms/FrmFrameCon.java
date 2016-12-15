package com.t3h.frms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class FrmFrameCon extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel defaultTableModel = new DefaultTableModel(new String [] {"STT", "Ho ten", "SDT", "Hinh anh"},  0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFrameCon frame = new FrmFrameCon();
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
	public FrmFrameCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 450, 300);
		setTitle("Day la frame con");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 422, 230);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(defaultTableModel);
		
		for (int i = 0; i < 10; i++) {
			defaultTableModel.addRow(new Object[] {i, "Nguyen van a", "123", "xxx"});
		}
		
		scrollPane.setViewportView(table);
		
		ImageIcon icon = new ImageIcon("images\\Penguins.jpg");
	}
}
