package com.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//Autoboxing - transforma tipo primitivo em tipo objeto
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character d = 'd';
		
		//Auto unboxing - tranforma tipo onjeto em tipo primitivo
		int num13 = num9; //Mesma coisa que: num9.intValue();

		//Autoboxing em expressões
		num9++;
		System.out.println(num9);
		
		//Auto unboxing do num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		
		//Mau uso
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c)/3;
		System.out.println(media);
	}

}
