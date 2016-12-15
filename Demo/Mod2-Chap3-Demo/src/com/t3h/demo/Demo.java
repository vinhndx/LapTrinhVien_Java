package com.t3h.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
	//	demo1();

		demo2();

	}

	private static void demo2() {
		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

		list.forEach(abc -> System.out.println(abc));
	}

	private static void demo1() {
		HocSinh hs1 = new HocSinh("hs1", 10);
		HocSinh hs2 = new HocSinh("hs2", 8);
		HocSinh hs3 = new HocSinh("hs3", 11);
		HocSinh hs10 = new HocSinh("hs10", 7);
		HocSinh hs4 = new HocSinh("hs4", 9);

		List<HocSinh> dsHS = Arrays.asList(hs1, hs2, hs3, hs4, hs10);

		Collections.sort(dsHS, (a, b) -> a.getTuoi() - b.getTuoi());

		for (HocSinh hocSinh : dsHS) {
			System.out.println(hocSinh);
		}
	}

}
