package com.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

	public static void main(String[] args) {
		
		System.out.println("Locale atual " + Locale.getDefault());
		//Arquivo meu-texto.properties criado no src
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Olá: " + rb.getString("ola"));
		System.out.println("Mundo: " + rb.getString("mundo"));
		
		//Locale.setDefault(new Locale("en_BR", "en_BR"));
		//Arquivo meu-texto_en_BR.properties criado no src
		rb = ResourceBundle.getBundle("meu-texto", new Locale("en_BR", "en_BR"));
		
		System.out.println("Olá en_BR: " + rb.getString("ola"));
		System.out.println("Mundo en_BR: " + rb.getString("mundo"));
	}

}
