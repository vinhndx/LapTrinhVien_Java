package com.t3h.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import com.google.gson.Gson;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDocTyGia extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfSoTien;
	private JTextField tfMua;
	private JTextField tfBan;
	private DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Quoc ky", "Ma", "Gia mua", "Gia ban"}, 0);
	private JComboBox cbbLoaiNgoaiTe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDocTyGia frame = new FrmDocTyGia();
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
	public FrmDocTyGia() {
		setTitle("Ty Gia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 422, 221);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(defaultTableModel);
		table.getColumnModel().getColumn(0).setCellRenderer(new ImageTableCellRenderer(35, 35));
		table.setRowHeight(35);
		scrollPane.setViewportView(table);
		
		JLabel lblNhapSoTien = new JLabel("Nhap so tien");
		lblNhapSoTien.setBounds(20, 245, 94, 14);
		contentPane.add(lblNhapSoTien);
		
		JLabel lblLoaiNgoaiTe = new JLabel("Loai ngoai te");
		lblLoaiNgoaiTe.setBounds(30, 270, 94, 14);
		contentPane.add(lblLoaiNgoaiTe);
		
		JLabel lblThanhtien = new JLabel("ThanhTien");
		lblThanhtien.setBounds(20, 295, 94, 14);
		contentPane.add(lblThanhtien);
		
		tfSoTien = new JTextField();
		tfSoTien.setBounds(130, 242, 86, 20);
		contentPane.add(tfSoTien);
		tfSoTien.setColumns(10);
		
		cbbLoaiNgoaiTe = new JComboBox();
		cbbLoaiNgoaiTe.setBounds(134, 266, 86, 22);
		contentPane.add(cbbLoaiNgoaiTe);
		
		tfMua = new JTextField();
		tfMua.setBounds(165, 292, 86, 20);
		contentPane.add(tfMua);
		tfMua.setColumns(10);
		
		tfBan = new JTextField();
		tfBan.setColumns(10);
		tfBan.setBounds(165, 316, 86, 20);
		contentPane.add(tfBan);
		
		JLabel lblMua = new JLabel("Mua");
		lblMua.setBounds(124, 295, 31, 14);
		contentPane.add(lblMua);
		
		JLabel lblBan = new JLabel("Ban");
		lblBan.setBounds(130, 319, 31, 14);
		contentPane.add(lblBan);
		
		JButton btnTinhj = new JButton("Tinh");
		btnTinhj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double soTien = Double.parseDouble(tfSoTien.getText());
				TyGia tyGia = (TyGia) cbbLoaiNgoaiTe.getSelectedItem();
				
				tfMua.setText(String.valueOf(soTien * Double.parseDouble(tyGia.getMuack())));
				tfBan.setText(String.valueOf(soTien * Double.parseDouble(tyGia.getBanck())));
				
			}
		});
		btnTinhj.setBounds(125, 347, 91, 23);
		contentPane.add(btnTinhj);
		
		layTyGia();
	}

	private void layTyGia() {
		try {
			URL url = new URL("http://dongabank.com.vn/exchange/export");
			URLConnection connection = url.openConnection();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String input = bufferedReader.readLine();
			bufferedReader.close();
			
			input = input.substring(1, input.length() - 1);
			
			Gson gson = new Gson();
			DanhSachTyGia danhSachTyGia = gson.fromJson(input, DanhSachTyGia.class);
			
			List<TyGia> list = danhSachTyGia.getItems();
			
			defaultTableModel.setRowCount(0);
			for(TyGia tyGia : list){
				defaultTableModel.addRow(new String[]{tyGia.getImageurl(), tyGia.getType(), tyGia.getMuack(), tyGia.getBanck()});
			}
			
			cbbLoaiNgoaiTe.setModel(new DefaultComboBoxModel(list.toArray()));
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
