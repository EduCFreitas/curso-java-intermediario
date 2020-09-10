package com.cursojava.aula55;

import com.cursojava.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		//Método values retorna um array com todos os valore do enum
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}

	}

}
