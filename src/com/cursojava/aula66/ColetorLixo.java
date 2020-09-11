package com.cursojava.aula66;

import com.cursojava.aula61.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUtilizada() {
		
		final int MB = 1024 * 1024;
				
		Runtime runtime = Runtime.getRuntime(); //Singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
		
		
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[1000000];
		Contato contato;
		
		for(int i=0; i<contatos.length; i++) {
			contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUtilizada();
		
		contatos = null;
		
		//Raramente utilizado em programas Java
		//Finaliza marca os objetos para serem coletados pelo garbage collector
		Runtime.getRuntime().runFinalization();
		//Força a execução do garbage collector, porém não há a garantia de que ele será utilizado
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUtilizada();

	}

}
