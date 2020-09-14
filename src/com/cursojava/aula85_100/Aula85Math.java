package com.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3));
		
		//Arredondamento
		System.out.println(Math.round(4.7));
		System.out.println(Math.round(4.4));
		//Arredonda para cima
		System.out.println(Math.ceil(4.4));
		System.out.println(Math.ceil(4.7));
		//Arredonda para baixo
		System.out.println(Math.floor(4.4));
		System.out.println(Math.floor(4.7));
		
		//Gerar número aleatório
		System.out.println(Math.round(Math.random()*100));
		
		//Funções trigonométricas
		//Por padrão, funções da classe Math usam radianos
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));

	}

}
