package com.t3h.frms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FrmDemo extends JFrame {

	private JPanel contentPane;
	private JLabel lbHinhAnh;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtnNu;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDemo frame = new FrmDemo();
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
	public FrmDemo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\Penguins.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);
		
		JMenuItem mntmProject = new JMenuItem("Project");
		mntmProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello");
			}
		});
		mnNew.add(mntmProject);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHienThiFrm = new JButton("Hien thi hinh anh");
		btnHienThiFrm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Hello");
			}
		});
		btnHienThiFrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*FrmFrameCon frmCon = new FrmFrameCon();
				frmCon.setVisible(true);*/
				
				JFileChooser chooser = new JFileChooser("D:/Sample Pictures");
				int status = chooser.showOpenDialog(null);
				
				if(status == JFileChooser.APPROVE_OPTION){
					String path = chooser.getSelectedFile().getAbsolutePath();
					lbHinhAnh.setIcon(new ImageIcon(path));
				}
				
				
			}
		});
		btnHienThiFrm.setBounds(255, 30, 153, 23);
		contentPane.add(btnHienThiFrm);
		
		lbHinhAnh = new JLabel("");
		lbHinhAnh.setBounds(10, 42, 211, 132);
		contentPane.add(lbHinhAnh);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Doc sach");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectCheckbox(e);
			}
		});
		chckbxNewCheckBox.setBounds(254, 60, 101, 23);
		contentPane.add(chckbxNewCheckBox);
		
		rdbtnNam = new JRadioButton("Nam");
		buttonGroup.add(rdbtnNam);
		rdbtnNam.setBounds(254, 140, 109, 23);
		contentPane.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nu");
		buttonGroup.add(rdbtnNu);
		rdbtnNu.setBounds(254, 166, 109, 23);
		contentPane.add(rdbtnNu);
		
		JCheckBox chckbxNgheNhac = new JCheckBox("Nghe nhac");
		buttonGroup.add(chckbxNgheNhac);
		chckbxNgheNhac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			selectCheckbox(e);
			}
		});
		chckbxNgheNhac.setBounds(254, 86, 101, 23);
		contentPane.add(chckbxNgheNhac);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = "nu";
				
				Enumeration enumeration = buttonGroup.getElements();
				while(enumeration.hasMoreElements()){
					AbstractButton button = (AbstractButton) enumeration.nextElement();
					if(button.isSelected()){
						gt = button.getText();
						break;
					}
				}
				
				JOptionPane.showMessageDialog(null, "Gt cua ban la " + gt);
				
			}
		});
		btnTest.setBounds(254, 220, 91, 23);
		contentPane.add(btnTest);
		
		JRadioButton rdbtnKhac = new JRadioButton("Khac");
		buttonGroup.add(rdbtnKhac);
		rdbtnKhac.setBounds(254, 192, 109, 23);
		contentPane.add(rdbtnKhac);
		
		comboBox = new JComboBox();
		
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Gt ban vua chon la " + comboBox.getSelectedItem());
			}
		});
		comboBox.setBounds(20, 185, 202, 22);
		contentPane.add(comboBox);
		
		JButton btnAddItem = new JButton("Add item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] arr = {"11", "22", "33", "44", "55"};
				comboBox.setModel(new DefaultComboBoxModel<String>(arr));
				
			}
		});
		btnAddItem.setBounds(130, 220, 91, 23);
		contentPane.add(btnAddItem);
	}
	
	private void selectCheckbox(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ban vua chon " + ((JCheckBox)e.getSource()).getText());
	}
}
