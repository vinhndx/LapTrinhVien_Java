package org.o7planning.tutorial.regex.stringmatches;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private JButton btnHello;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnHello = new JButton("Hello");
		btnHello.setBounds(155, 185, 91, 23);
		contentPane.add(btnHello);
		
		JButton btnTiengViet = new JButton("Tieng Viet");
		btnTiengViet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateLocale(new Locale("vi", "VN"));
			}
		});
		btnTiengViet.setBounds(54, 30, 91, 23);
		contentPane.add(btnTiengViet);
		
		JButton btnEnglish = new JButton("English");
		btnEnglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateLocale(new Locale("en", "US"));
			}
		});
		btnEnglish.setBounds(155, 30, 91, 23);
		contentPane.add(btnEnglish);
	}
	
	private void updateLocale(Locale locale){
		ResourceBundle bundle = ResourceBundle.getBundle("bundle", locale);
		btnHello.setText(bundle.getString("chao"));
		
	}
}
