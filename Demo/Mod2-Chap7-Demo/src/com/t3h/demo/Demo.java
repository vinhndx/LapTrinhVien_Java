package com.t3h.demo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Demo {

	public static void main(String[] args) {
		
		try {
		
			String pass = "123";
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			
			messageDigest.reset();
			messageDigest.update(pass.getBytes());
			
			byte[] by = messageDigest.digest();
			
			String newPass = DatatypeConverter.printHexBinary(by).toLowerCase();
			System.out.println(newPass);
			System.out.println("202cb962ac59075b964b07152d234b70");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//UPDATE `user` SET `Pass`=md5(pass) 
//ALTER TABLE `user` ADD `Salt` varchar(16)
