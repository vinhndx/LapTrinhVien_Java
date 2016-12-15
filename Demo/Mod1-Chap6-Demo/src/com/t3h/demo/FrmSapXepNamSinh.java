package com.t3h.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrmSapXepNamSinh extends JFrame {

	private JPanel contentPane;
	private JTextField tfTen;
	private JTextField tfNamSinh;
	private List<Person> listPerson = new ArrayList<Person>();
	private JList list;
	private DefaultListModel defaultListModel = new DefaultListModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSapXepNamSinh frame = new FrmSapXepNamSinh();
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
	public FrmSapXepNamSinh() {
		setTitle("Sort by Age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTen = new JLabel("Name");
		lblTen.setBounds(10, 11, 79, 14);
		contentPane.add(lblTen);
		
		JLabel lblNamSinh = new JLabel("Birth");
		lblNamSinh.setBounds(10, 38, 79, 14);
		contentPane.add(lblNamSinh);
		
		tfTen = new JTextField();
		tfTen.setBounds(80, 8, 140, 20);
		contentPane.add(tfTen);
		tfTen.setColumns(10);
		
		tfNamSinh = new JTextField();
		tfNamSinh.setColumns(10);
		tfNamSinh.setBounds(80, 35, 140, 20);
		contentPane.add(tfNamSinh);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Person person  =new Person(tfTen.getText(), Integer.parseInt(tfNamSinh.getText()));
				
				listPerson.add(person);
				
				defaultListModel.clear();
				
				Person [] persons  = listPerson.toArray(new Person[]{});
				
				Arrays.sort(persons);
				
				for (Person p : persons) {
					defaultListModel.addElement(p.getTen() + " - " + p.getNamSinh());
				}
				
				
			}
		});
		btnAdd.setBounds(230, 7, 62, 45);
		contentPane.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 318, 186);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.setModel(defaultListModel);
		scrollPane.setViewportView(list);
	}
}
