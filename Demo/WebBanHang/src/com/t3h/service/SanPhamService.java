package com.t3h.service;

import java.util.ArrayList;
import java.util.List;

import com.t3h.beans.SanPham;

public class SanPhamService {
	public List<SanPham> layTatCaSanPham (){
		List<SanPham> ds = new ArrayList<SanPham>();
		SanPham sp = new SanPham(1,
				"http://daiphatloc.com.vn/upload/sanpham/ntmproductfull03042014110424-14131709858.jpg",
				"Samsung-Smart-Tv 1", 34535, 4545);
		ds.add(sp);
		sp = new SanPham(2,
				"http://vidic.com.vn/media/product/1040_1040_1216.jpg",
				"Samsung-Smart-Tv 2", 324234, 5656);
		ds.add(sp);
		sp = new SanPham(3,
				"http://daiphatloc.com.vn/upload/sanpham/ntmproductfull03042014110424-14131709858.jpg",
				"Samsung-Smart-Tv 3", 10000000, 999999);
		ds.add(sp);
		sp = new SanPham(4,
				"http://vidic.com.vn/media/product/1040_1040_1216.jpg",
				"Samsung-Smart-Tv 4", 10000000, 999999);
		ds.add(sp);
		sp = new SanPham(5,
				"http://daiphatloc.com.vn/upload/sanpham/ntmproductfull03042014110424-14131709858.jpg",
				"Samsung-Smart-Tv 5", 10000000, 999999);
		ds.add(sp);
		
		sp = new SanPham(6,
				"http://daiphatloc.com.vn/upload/sanpham/ntmproductfull03042014110424-14131709858.jpg",
				"Samsung-Smart-Tv 6", 10000000, 999999);
		ds.add(sp);
		
		sp = new SanPham(7,
				"http://daiphatloc.com.vn/upload/sanpham/ntmproductfull03042014110424-14131709858.jpg",
				"Samsung-Smart-Tv 7", 10000000, 999999);
		ds.add(sp);
		
		return ds;
	}
	
	public List<SanPham> layDanhSachSanPhamMoiNhat(int soSp) {
		List<SanPham> ds = new ArrayList<SanPham>();
		List<SanPham> dsall = layTatCaSanPham();
		
		for (int i = 0; i < soSp; i++) {
			ds.add(dsall.get(i));
		}
		
		return ds;
	}
	
	public SanPham laySanPhamTheoID(int id){
		List<SanPham> dsall = layTatCaSanPham();
		for (SanPham sp : dsall) {
			if(sp.getId() == id){
				return sp;
			}
		}
		
		return null;
	}
	
}
