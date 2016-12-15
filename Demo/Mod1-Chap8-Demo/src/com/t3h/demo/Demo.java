package com.t3h.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Demo {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://dongabank.com.vn/exchange/export");
			URLConnection connection = url.openConnection();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String input = bufferedReader.readLine();
			bufferedReader.close();
			
			input = input.substring(1, input.length() - 1);
			
			System.out.println(input);
			
//			JSONObject jsonObject = new JSONObject(input);
//			JSONArray items = jsonObject.getJSONArray("items");
//			for (int i = 0; i < items.length(); i++) {
//				JSONObject item = items.getJSONObject(i);
//				String type = item.getString("type");
//				String muatienmat = item.getString("muatienmat");
//				
//				System.out.println(type + " - " +  muatienmat);
//			}
			
			
			Gson gson = new Gson();
			DanhSachTyGia danhSachTyGia = gson.fromJson(input, DanhSachTyGia.class);
			
			for(TyGia tyGia : danhSachTyGia.getItems()){
				System.out.println(tyGia.getType() + " - " + tyGia.getBantienmat());
			}
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
