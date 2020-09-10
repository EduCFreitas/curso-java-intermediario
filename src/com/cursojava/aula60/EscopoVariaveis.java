package com.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		valor = valor+10;
		//this.valor = valor;
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		
		if(true) {
			valor--;
		}
		
		//this.valor = valor; //referencial valor global/atributo da classe;
		return valor;
	}
	
	public void outroTeste() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//i++; //Erro de compila��o
		
		int j;
		for(j=0; j<10; j++) {
			System.out.println(j);
		}
		System.out.println(j); //j 
	}
	
	public void maisUmTeste() {
		boolean flag = true;
		
		if(flag) {
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
		
		//System.out.println(umaVariavel); //Erro de compila��o
	}
	
	public void maisUmOutroTeste(int num) {
		int total = 0;
		
		try {
			int outroNum = 0;
			total = num/outroNum;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			total++;
			//outroNum++; //Erro de compila��o
			//e.printStackTrace; //Erro de compila��o
		}
		
		num++;
		//outroNum++; //Erro de compila��o
		//e.printStackTrace(); //Erro de compila��o
	}
}
