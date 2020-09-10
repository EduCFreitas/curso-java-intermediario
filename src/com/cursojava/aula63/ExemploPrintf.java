package com.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("%s", "Ol� mundo!");
		System.out.println();
		System.out.printf("%S", "Ol� mundo!");
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.printf("%n");
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println();
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		
		String olaMundo = "Ol� mundo!";
		//Alinhamento � direita
		System.out.printf("%20s", olaMundo);
		System.out.println();
		//Alinhamento � esquerda
		System.out.printf("%-20s", olaMundo);
		System.out.println();
		
		System.out.printf("%+d", valor);
		System.out.println();
		
		//Sa�da com 15 d�gitos, acrescentando zeros � esquerda
		System.out.printf("%015d", valor);
		System.out.println();
		
		//Separa��o de casas de milhares
		System.out.printf("%,d", valor);
		System.out.println();
		
		int valor2 = -123456789;
		//Mant�m o sinal de - no come�o do n�mero
		System.out.printf("% d", valor2);
		System.out.println();
		//D� espa�o antes de imprimir o n�mero
		System.out.printf("% d", valor);
		System.out.println();
		
		//Formata quantidade de casas decimais
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();
		
		//Formata��o de valores monet�rios
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.println();
		
		testeMaisCompleto();
		
	}
	
	
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: Total de R$%,10.2f%n", "Item", i, precos[i]);
		}
		//Java.util.Formater -> Faz quase a mesma coisa que printf
	}

}
