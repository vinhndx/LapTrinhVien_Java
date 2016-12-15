package com.t3h.entities2;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class NhanVienPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String cmnd;

	private String ho_ten;
	
	public String getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHo_ten() {
		return this.ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
