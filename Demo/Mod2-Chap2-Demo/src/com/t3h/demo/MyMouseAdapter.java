package com.t3h.demo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MyMouseAdapter extends MouseAdapter{
	
	private JButton button;
	
	public JButton getButton() {
		return button;
	}
	
	public void setButton(JButton button) {
		this.button = button;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		button.setToolTipText("Hello");
		
	}
}
