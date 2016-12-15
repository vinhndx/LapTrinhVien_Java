package com.t3h.entities2;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loai_cong_viec database table.
 * 
 */
@Entity
@Table(name="loai_cong_viec")
@NamedQuery(name="LoaiCongViec.findAll", query="SELECT l FROM LoaiCongViec l")
public class LoaiCongViec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String ten;

	//bi-directional many-to-many association to NhanVien
	@ManyToMany
	@JoinTable(
		name="phieu_phan_cong"
		, joinColumns={
			@JoinColumn(name="ID_LOAI_CONG_VIEC")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_NHAN_VIEN")
			}
		)
	private List<NhanVien> nhanViens;

	public LoaiCongViec() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<NhanVien> getNhanViens() {
		return this.nhanViens;
	}

	public void setNhanViens(List<NhanVien> nhanViens) {
		this.nhanViens = nhanViens;
	}

}