package com.cursojava.aula75_84;

public class Aula75 {

	public static void main(String[] args) {
		
		String vazia = new String(); //""
		System.out.println(vazia);
		
		String java = new String("Java");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charsJava = {'J', 'a', 'v', 'a'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		char[] abcdef = {'a', 'b', 'c', 'd', 'e', 'f'};
		String abc = new String(abcdef, 0, 3);
		System.out.println(abc);
		
		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		String java3 = "Java";
		String java4 = "Java";
		System.out.println(java3);
		System.out.println(java4);

	}

}
