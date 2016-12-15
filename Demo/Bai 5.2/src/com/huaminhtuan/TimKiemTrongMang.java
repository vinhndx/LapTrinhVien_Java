package com.huaminhtuan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

public class TimKiemTrongMang extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtX;
	private JTextArea txtMang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimKiemTrongMang frame = new TimKiemTrongMang();
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
	public TimKiemTrongMang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNhpN = new JLabel("Nh\u00E2\u0323p n:");
		lblNhpN.setBounds(10, 11, 46, 14);
		contentPane.add(lblNhpN);

		txtN = new JTextField();
		txtN.setBounds(122, 8, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);

		JLabel lblNhpX = new JLabel("Nh\u00E2\u0323p x:");
		lblNhpX.setBounds(10, 36, 46, 14);
		contentPane.add(lblNhpX);

		txtX = new JTextField();
		txtX.setBounds(122, 33, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);

		JLabel lblMangcPhat = new JLabel("Ma\u0309ng \u0111\u01B0\u01A1\u0323c pha\u0301t sinh:");
		lblMangcPhat.setBounds(10, 61, 112, 14);
		contentPane.add(lblMangcPhat);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 64, 198, 124);
		contentPane.add(scrollPane);

		txtMang = new JTextArea();
		scrollPane.setViewportView(txtMang);
		txtMang.setLineWrap(true);
		txtMang.setEditable(false);

		JLabel lblKtQuaTim = new JLabel("K\u00EA\u0301t qua\u0309 ti\u0300m ki\u00EA\u0301m:");
		lblKtQuaTim.setBounds(10, 200, 95, 14);
		contentPane.add(lblKtQuaTim);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(122, 200, 196, 122);
		contentPane.add(scrollPane_1);

		JTextArea txtKetQua = new JTextArea();
		scrollPane_1.setViewportView(txtKetQua);
		txtKetQua.setLineWrap(true);
		txtKetQua.setEditable(false);

		JButton btnTimKiem = new JButton("Ti\u0300m Ki\u00EA\u0301m");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					int n = Integer.parseInt(txtN.getText());
					int x = Integer.parseInt(txtX.getText());
					String kq = "";

					int mang[] = phatSinhMang(n);
					txtMang.setText(xuatMang(mang));
					int viTriDauTienCuaX = timViTriDauTienCuaX(mang, x);
					kq += (viTriDauTienCuaX < 0)? "Không tìm thấy x" : "Tìm thấy x tại vị trí " + viTriDauTienCuaX;
					kq += "\n";
					kq += xLonHonTatCa(mang, x)? "X lớn hơn tất cả" : "X không lớn hơn tất cả";
					kq += "\n";
					kq += timCacSoLonHonXTrongMang(mang, x);
					
					txtKetQua.setText(kq);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnTimKiem.setBounds(122, 341, 89, 23);
		contentPane.add(btnTimKiem);
	}

	private boolean xLonHonTatCa(int[] mang, int x) {
		boolean ret = true;
		for(int i : mang)
		{
			if(x <= i)
			{
				ret  = false;
				break;
			}
		}
		return ret;
	}

	private String timCacSoLonHonXTrongMang(int[] mang, int x) {
		String ret = "";
		for(int i : mang)
		{
			if(x < i)
				ret += i + " ";
		}
		return ret;
	}

	private int timViTriDauTienCuaX(int[] mang, int x) {
		int viTriDauTienCuaX = -1;
		for(int i = 0; i < mang.length; i++)
		{
			if(mang[i] == x)
			{
				viTriDauTienCuaX = i;
				break;
			}
		}
		return viTriDauTienCuaX;
		
/*		Arrays.sort(mang);
		return Arrays.binarySearch(mang, x);
*/		
	}

	private String xuatMang(int[] mang) {
		String s = "";
		for(int i : mang)
		{
			s += i + " ";
		}
		return s;
	}

	private int[] phatSinhMang(int n) {
		Random random = new Random();
		int[] mang = new int[n];

		for(int i = 0; i < n; i++)
		{
			mang[i] = random.nextInt(100);
		}
		return mang;
	}
}
