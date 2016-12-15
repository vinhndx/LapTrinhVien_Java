package com.t3h.demo;

public class TyGia {
	private String type;
	private String imageurl;
	private String mautienmat;
	private String muack;
	private String bantienmat;
	private String banck;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getMautienmat() {
		return mautienmat;
	}

	public void setMautienmat(String mautienmat) {
		this.mautienmat = mautienmat;
	}

	public String getMuack() {
		return muack;
	}

	public void setMuack(String muack) {
		this.muack = muack;
	}

	public String getBantienmat() {
		return bantienmat;
	}

	public void setBantienmat(String bantienmat) {
		this.bantienmat = bantienmat;
	}

	public String getBanck() {
		return banck;
	}

	public void setBanck(String banck) {
		this.banck = banck;
	}
	
	@Override
	public String toString() {
		return getType();
	}
}
