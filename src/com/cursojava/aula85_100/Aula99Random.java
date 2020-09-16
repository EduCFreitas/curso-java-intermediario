package com.cursojava.aula85_100;

import java.util.Random;

public class Aula99Random {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random()*101));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(5+1));

	}

}
