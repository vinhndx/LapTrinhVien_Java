package com.t3h.frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import com.t3h.bean.LienHe;
import com.t3h.service.LienHeService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class FrmDanhSachLienHe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel defaultTableModel = new DefaultTableModel(
			new String[] { "Hinh anh", "Ten", "Dien thoai", "Hanh dong"}, 0);
	
	private List<LienHe> dsLienHe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					FrmDanhSachLienHe frame = new FrmDanhSachLienHe();
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
	public FrmDanhSachLienHe() {

		initComponents();

		loadDanhSachLienHe();
	}

	private void loadDanhSachLienHe() {
		dsLienHe = LienHeService.layDanhSachLienHe();

		if(dsLienHe != null){
			defaultTableModel.setRowCount(0);
			for (LienHe lienHe : dsLienHe) {
				defaultTableModel.addRow(new String[] { lienHe.getHinhAnh(),
						lienHe.getTen(), lienHe.getSdt(), "delete.png" });
			}
		}
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Lien He");
		menuBar.add(mnNewMenu);

		JMenuItem mntmThem = new JMenuItem("Them");
		mntmThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmThemLienHe frmThemLienHe = new FrmThemLienHe();
				frmThemLienHe.setVisible(true);
				
				frmThemLienHe.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent arg0) {
						loadDanhSachLienHe();
					}
				});
				
			}
		});
		mnNewMenu.add(mntmThem);

		JMenuItem mntmNewMenuItem = new JMenuItem("Tim kiem");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmTimLienHe frmTimLienHe = new FrmTimLienHe(dsLienHe);
				frmTimLienHe.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmCapNhat = new JMenuItem("Cap nhat - Xoa");
		mntmCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row >= 0){
					xoaLienHe(row);
				}
			}
		});
		mnNewMenu.add(mntmCapNhat);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 422, 230);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int col = table.getSelectedColumn();
				int row = table.getSelectedRow();
				if(col == 3){
					xoaLienHe(row);
				}
				
			}
		});
		table.setModel(defaultTableModel);
		table.getColumnModel().getColumn(0).setCellRenderer(new ImageTableCellRenderer(25, 25));
		table.getColumnModel().getColumn(3).setCellRenderer(new ImageTableCellRenderer(25, 25));
		table.setRowHeight(50);
		scrollPane.setViewportView(table);
	}

	private void xoaLienHe(int row) {
		int status = JOptionPane.showConfirmDialog(null, "Ban co muon xoa?");
		if(status == JOptionPane.OK_OPTION){
			defaultTableModel.removeRow(row);
			dsLienHe.remove(row);
			try {
				LienHeService.themDanhSachLienHe(dsLienHe, false);
				JOptionPane.showMessageDialog(null, "Xoa thanh cong!");
			} catch (IOException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Xoa that bai!");
			}
		}
		loadDanhSachLienHe();
	}
	
	
}
