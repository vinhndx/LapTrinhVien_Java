package com.t3h.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Demo {

	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh("hs1", 10);
		HocSinh hs2 = new HocSinh("hs2", 8);
		HocSinh hs3 = new HocSinh("hs3", 11);
		HocSinh hs10 = new HocSinh("hs10", 7);
		HocSinh hs4 = new HocSinh("hs4", 9);

		List<HocSinh> dsHS = Arrays.asList(hs1, hs2, hs3, hs4, hs10);

		Collections.sort(dsHS, new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				return o1.getTuoi() - o2.getTuoi();
			}
		});

		for (HocSinh hocSinh : dsHS) {
			System.out.println(hocSinh);
		}

	}
}
