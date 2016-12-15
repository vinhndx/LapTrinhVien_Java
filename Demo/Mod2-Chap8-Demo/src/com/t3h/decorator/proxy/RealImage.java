package com.t3h.decorator.proxy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements Image {

	private String fileName;
	private ImageIcon imageIcon;

	public RealImage(String fileName) {
		this.fileName = fileName;
		this.imageIcon = loadFromDisk(this.fileName);
	}

	@Override
	public void display(JLabel label) {
		label.setIcon(imageIcon);
	}

	private ImageIcon loadFromDisk(String fileName) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageIcon(fileName);
	}
}