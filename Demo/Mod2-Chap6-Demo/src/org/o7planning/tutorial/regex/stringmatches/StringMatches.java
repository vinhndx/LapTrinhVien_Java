package org.o7planning.tutorial.regex.stringmatches;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class StringMatches {

	public static void main(String[] args) {
		Locale locale = new Locale("es", "ES");

		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		//System.out.println(format.format(a));
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		//System.out.println(dateFormat.format(new Date()));
		
		ResourceBundle bundle = ResourceBundle.getBundle("bundle", locale);
		
		System.out.println(bundle.getString("chao"));
	}

}