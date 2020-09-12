package com.cursojava.aula71;

public class Calculadora {

	private int soma;
	
	//synchronized faz com que apenas uma thread por vez acesse o método
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i=0; i<array.length; i++) {
			soma += array[i];
			
			//currentThread acessa a thread que está utilizando o método
			System.out.println("Executando a soma " + Thread.currentThread().getName() +
					" somando o valor " + array[i] + " com total de " + soma);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return soma;
	}
}
