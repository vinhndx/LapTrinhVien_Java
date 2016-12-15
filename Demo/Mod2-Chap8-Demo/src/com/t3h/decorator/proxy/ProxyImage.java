package com.t3h.decorator.proxy;

import javax.swing.JLabel;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	private boolean isLoggedIn;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	public void checkLogin(String username, String pass){
		this.isLoggedIn = "admin".equals(username) && "admin".equals(pass);
	}

	@Override
	public void display(JLabel label) {
		if(isLoggedIn){
			if (realImage == null) {
				realImage = new RealImage(fileName);
			}
			realImage.display(label);
		}
	}
}