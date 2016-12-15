package com.t3h.entities2;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the nhan_vien database table.
 * 
 */
@Entity
@Table(name="nhan_vien")
@NamedQuery(name="NhanVien.findAll", query="SELECT n FROM NhanVien n")
public class NhanVien implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private int id;

	@EmbeddedId
	private NhanVienPK nhanVienPK;
	
	private String dia_chi;

	private int gioi_tinh;


	private double muc_luong;

	@Temporal(TemporalType.DATE)
	private Date ngay_sinh;

	//bi-directional many-to-many association to LoaiCongViec
	@ManyToMany(mappedBy="nhanViens")
	private List<LoaiCongViec> loaiCongViecs;

	public NhanVien() {
	}
	
	public NhanVienPK getNhanVienPK() {
		return nhanVienPK;
	}
	
	public void setNhanVienPK(NhanVienPK nhanVienPK) {
		this.nhanVienPK = nhanVienPK;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDia_chi() {
		return this.dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public int getGioi_tinh() {
		return this.gioi_tinh;
	}

	public void setGioi_tinh(int gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	public double getMuc_luong() {
		return this.muc_luong;
	}

	public void setMuc_luong(double muc_luong) {
		this.muc_luong = muc_luong;
	}

	public Date getNgay_sinh() {
		return this.ngay_sinh;
	}

	public void setNgay_sinh(Date ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}

	public List<LoaiCongViec> getLoaiCongViecs() {
		return this.loaiCongViecs;
	}

	public void setLoaiCongViecs(List<LoaiCongViec> loaiCongViecs) {
		this.loaiCongViecs = loaiCongViecs;
	}

}