package com.cursojava.aula54;

import com.cursojava.aula54.Formulario.Genero;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(10, 9, 2020, DiaSemana.QUINTA);
		System.out.println(data.getDiaSemana());
		
		Formulario form = new Formulario();
		form.setNome("Edu");
		form.setGenero(Genero.MASCULINO);
		System.out.println(form.getNome() + " - " + form.getGenero() + " - " + form.getGenero().getValor());

	}

}
