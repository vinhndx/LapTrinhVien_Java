package com.t3h.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.t3h.bean.LienHe;

public class LienHeService {

	private static final String FILE_NAME = "data.txt";

	public static List<LienHe> layDanhSachLienHe() {

		List<LienHe> lst = new ArrayList<LienHe>();

		try {
			File file = new File(FILE_NAME);
			if (!file.exists()) {
				return lst;
			}

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String t = br.readLine();
				if (t == null) {
					break;
				}

				String[] arr = t.split("\\|");
				String ten = arr[0];
				String sdt = arr[1];
				String hinhAnh = arr[2];
				LienHe lh = new LienHe(ten, sdt, hinhAnh);
				lst.add(lh);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return lst;
	}
	
	public static void themLienHe(LienHe lienHe) throws IOException{
		FileWriter fw = new FileWriter(FILE_NAME, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(lienHe.getTen() + "|" + lienHe.getSdt() + "|" + lienHe.getHinhAnh() + System.getProperty("line.separator"));
		bw.close();
	}
	
	public static void themDanhSachLienHe( List<LienHe> dsLienHe, boolean isAppend) throws IOException{
		FileWriter fw = new FileWriter(FILE_NAME, isAppend);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (LienHe lienHe : dsLienHe) {
			bw.write(lienHe.getTen() + "|" + lienHe.getSdt() + "|" + lienHe.getHinhAnh() + System.getProperty("line.separator"));
		}
		
		bw.close();
	}
}
