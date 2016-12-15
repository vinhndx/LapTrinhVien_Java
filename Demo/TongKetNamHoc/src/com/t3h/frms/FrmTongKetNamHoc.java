package com.t3h.frms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrmTongKetNamHoc extends JFrame {

	private JPanel contentPane;
	private JTextField tfHoTen;
	private JTextField tfDiemHK1;
	private JTextField tfDiemHK2;
	private JTable table;
	private JComboBox cbbKhoi;
	private final static String FILE_NAME = "data.dat";
	private DefaultTableModel defaultTableModel = new DefaultTableModel(
			new String[] { "Ho va Ten", "Khoi", "TB HK1", "TB HK2", "TB Ca Nam" },
			0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					FrmTongKetNamHoc frame = new FrmTongKetNamHoc();
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
	public FrmTongKetNamHoc() {

		setTitle("Tong ket nam hoc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHoVaTen = new JLabel("Ho va ten");
		lblHoVaTen.setBounds(10, 30, 66, 14);
		contentPane.add(lblHoVaTen);

		tfHoTen = new JTextField();
		tfHoTen.setBounds(86, 27, 142, 20);
		contentPane.add(tfHoTen);
		tfHoTen.setColumns(10);

		JLabel lblKhoiLop = new JLabel("Khoi lop");
		lblKhoiLop.setBounds(10, 58, 66, 14);
		contentPane.add(lblKhoiLop);

		tfDiemHK1 = new JTextField();
		tfDiemHK1.setColumns(10);
		tfDiemHK1.setBounds(86, 86, 142, 20);
		contentPane.add(tfDiemHK1);

		JLabel lblDiemTbHki = new JLabel("Diem TB HKI");
		lblDiemTbHki.setBounds(10, 89, 66, 14);
		contentPane.add(lblDiemTbHki);

		tfDiemHK2 = new JTextField();
		tfDiemHK2.setColumns(10);
		tfDiemHK2.setBounds(86, 117, 142, 20);
		contentPane.add(tfDiemHK2);

		JLabel lblDiemTbHkii = new JLabel("Diem TB HKII");
		lblDiemTbHkii.setBounds(10, 120, 66, 14);
		contentPane.add(lblDiemTbHkii);

		cbbKhoi = new JComboBox();
		cbbKhoi.setModel(new DefaultComboBoxModel(new String[] { "10", "11",
				"12" }));
		cbbKhoi.setBounds(86, 54, 142, 22);
		contentPane.add(cbbKhoi);

		JButton btnNewButton = new JButton("Them moi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				themMoiHocSinh();
			}
		});
		btnNewButton.setBounds(251, 26, 112, 23);
		contentPane.add(btnNewButton);

		JButton btnTiepTuc = new JButton("Tiep tuc");
		btnTiepTuc.setBounds(251, 54, 112, 23);
		contentPane.add(btnTiepTuc);

		JButton btnDocDanhSach = new JButton("Doc danh sach");
		btnDocDanhSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadDanhSachHocSinh();
			}
		});
		btnDocDanhSach.setBounds(251, 85, 112, 23);
		contentPane.add(btnDocDanhSach);

		JButton btnThongKe = new JButton("Thong ke");
		btnThongKe.setBounds(251, 116, 112, 23);
		contentPane.add(btnThongKe);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 422, 177);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(defaultTableModel);
		scrollPane.setViewportView(table);

	}

	private void loadDanhSachHocSinh() {
		try {

			File f = new File(FILE_NAME);
			if (!f.exists()) {
				return;
			}

			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			defaultTableModel.setRowCount(0);

			while (true) {
				try {
					HocSinh hs = (HocSinh) ois.readObject();

					defaultTableModel
							.addRow(new String[] {
									hs.getHoVaTen(),
									hs.getKhoiLop(),
									String.valueOf(hs.getDiemHK1()),
									String.valueOf(hs.getDiemHK2()),
									String.valueOf((hs.getDiemHK1() + hs
											.getDiemHK2() * 2) / 3) });


				} catch (Exception e) {
					break;
				}
			}
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void themMoiHocSinh() {
		String hoTen = tfHoTen.getText();
		double diemHK1 = Double.parseDouble(tfDiemHK1.getText());
		double diemHK2 = Double.parseDouble(tfDiemHK2.getText());
		String khoiLop = (String) cbbKhoi.getSelectedItem();

		HocSinh hs = new HocSinh(hoTen, khoiLop, diemHK1, diemHK2);

		try {
			File f = new File(FILE_NAME);
			ObjectOutputStream oos = null;

			if(!f.exists()){
				oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			} else {
				oos = new NoHeaderObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
			}

			oos.writeObject(hs);
			oos.flush();
			oos.close();

			JOptionPane.showMessageDialog(null, "Them moi hoc sinh \"" + hoTen
					+ "\" thanh cong!");

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Them moi hoc sinh that bai!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Them moi hoc sinh that bai!");
			e.printStackTrace();
		}

	}
}
