package com.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

	public static void main(String[] args) throws ParseException {
		
		Locale en = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(en);	
		String num = nf.format(100.99);
		System.out.println(num);
		
		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num);
		
		//Moedas
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		Currency currency = moeda.getCurrency();
		System.out.println(currency);
		
		//Porcentagem
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(7);
		porcent.setMinimumIntegerDigits(5);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		//Arredondamento
		nf = NumberFormat.getInstance();
		
		nf.setRoundingMode(RoundingMode.HALF_UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
		Number num3 = nf.parse("100,00");
		System.out.println(num3.intValue());

	}

}
