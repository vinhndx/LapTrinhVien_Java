package com.t3h.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class DemoIOStream {
	public static void main(String[] args) {
		// byteStream();
		// characterStream();
		// buffered();
		// demoScanner();
		// dataStream();
		
		objectStream();
	}


	private static void objectStream() {
		try {
			// Ghi file data
			FileOutputStream fos = new FileOutputStream("D:/objectstream.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			SinhVien sv1 = new SinhVien("Nguyen van A", 10, "Lop 10");
			SinhVien sv2 = new SinhVien("Nguyen van B", 11, "Lop 11");
			SinhVien sv3 = new SinhVien("Nguyen van C", 12, "Lop 12");
			
			oos.writeObject(sv1);
			oos.writeObject(sv2);
			oos.writeObject(sv3);
			
			oos.close();
			System.out.println("Ghi file thanh cong!");
			
			// Doc file
			FileInputStream fis = new FileInputStream("D:/objectstream.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			while(true){
				try {
					SinhVien sinhVien = (SinhVien) ois.readObject();
					System.out.println(sinhVien);
				} catch (Exception e) {
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void dataStream() {
		try {
			
			// Ghi file data
			FileOutputStream fos = new FileOutputStream("D:/datastream.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			String s = "Hello";
			int i = 10;
			float f = 1.2f;
			
			dos.writeUTF(s);
			dos.writeInt(i);
			dos.writeFloat(f);
			
			dos.close();
			
			System.out.println("Ghi file thanh cong!");
			
			// Doc file data do
			FileInputStream fis = new FileInputStream("D:/datastream.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void demoScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu 1:");
		int so1 = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nhap so thu 2:");
		int so2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Tong hai so la:" + (so1 + so2));
	}

	private static void buffered() {
		try {
			// Doc file
			FileReader fr = new FileReader("D:/data.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while(true){
				String t = br.readLine();
				if(t == null){
					break;
				}
				
				s += t + System.getProperty("line.separator");
			}
			System.out.println(s);	
			
			// Ghi file
			FileWriter fw = new FileWriter("D:/data4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(s);

			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void characterStream() {
		try {
			// Doc file
			FileReader fr = new FileReader("D:/data.txt");
			int i;
			String s = "";
			
			while((i = fr.read()) != -1){
				s = s + (char)i;
			}
			System.out.println(s);
			
			// Ghi file
			FileWriter fw = new FileWriter("D:/data3.txt");
			fw.write(s);
			
			fw.close();
			System.out.println("Ghi file thanh cong!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void byteStream() {
		try {
			// Doc file
			FileInputStream fis = new FileInputStream("D:/data.txt");
			int i;
			String s = "";
			
			/*while((i = fis.read()) != -1){
				s = s + (char)i;
			}*/
			
			while(true){
				i = fis.read();
				if(i < 0){
					break;
				}
				s += (char)i;
			}
			
			System.out.println(s);
			
			// Ghi ra file khac
			FileOutputStream fos = new FileOutputStream("D:/data2.txt");

			// Duyet qua tung ky tu trong chuoi s
			for(int j = 0; j < s.length(); j++){
//			for(char c : s.toCharArray()){
				fos.write(s.charAt(j));
			}
			System.out.println("Ghi file thanh cong!");
			fos.close();
		
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Co loi xay ra");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
