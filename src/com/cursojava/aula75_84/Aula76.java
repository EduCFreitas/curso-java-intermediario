package com.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {
		
		String curso = "Curso ";
		String java = "Java";
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		String resultado2Com2 = "Resultado 2+2 = " + (2+2);
		System.out.println(resultado2Com2);
		
		String resultado2Com2_ = "Resultado 2+2 = " + 2+2;
		System.out.println(resultado2Com2_);
		
		String um = String.valueOf(1);
		System.out.println(um);
		
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer" + 
				"pharetra gravida nisi id ultrices. Pellentesque pellentesque, mi eget condimentum ornare," +
				"lacus nulla ultricies mi, ac luctus odio lectus vel tellus. Aliquam lorem odio, eleifend" +
				"quis sollicitudin vehicula, molestie at augue. Vestibulum feugiat nulla vel odio tincidunt" +
				"scelerisque. Sed sagittis placerat metus vel sollicitudin. Curabitur auctor luctus enim, nec" +
				"accumsan felis. Nunc nec sagittis ante. Donec condimentum augue ac volutpat egestas. Cras" +
				"quis mollis felis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec " + 
				"posuere turpis ex, eget lobortis turpis pretium lacinia. Sed et odio dapibus, facilisis mi " + 
				"eu, sodales massa. Nulla bibendum turpis nibh, quis fringilla leo dapibus vitae. Curabitur " +
				"bibendum auctor dui ut sagittis. Integer ligula velit, porta vitae volutpat sed, volutpat " +
				"vitae metus. Vestibulum faucibus sagittis nunc, non tincidunt quam condimentum quis.";
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer";
		concatenacao2 += "pharetra gravida nisi id ultrices. Pellentesque pellentesque, mi eget condimentum ornare,";
		concatenacao2 += "lacus nulla ultricies mi, ac luctus odio lectus vel tellus. Aliquam lorem odio, eleifend";
		concatenacao2 += "quis sollicitudin vehicula, molestie at augue. Vestibulum feugiat nulla vel odio tincidunt";
		concatenacao2 += "scelerisque. Sed sagittis placerat metus vel sollicitudin. Curabitur auctor luctus enim, nec";
		concatenacao2 += "accumsan felis. Nunc nec sagittis ante. Donec condimentum augue ac volutpat egestas. Cras";
		concatenacao2 += "quis mollis felis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec ";
		concatenacao2 += "posuere turpis ex, eget lobortis turpis pretium lacinia. Sed et odio dapibus, facilisis mi "; 
		concatenacao2 += "eu, sodales massa. Nulla bibendum turpis nibh, quis fringilla leo dapibus vitae. Curabitur ";
		concatenacao2 += "bibendum auctor dui ut sagittis. Integer ligula velit, porta vitae volutpat sed, volutpat ";
		concatenacao2 += "vitae metus. Vestibulum faucibus sagittis nunc, non tincidunt quam condimentum quis.";
		System.out.println(concatenacao2);
		
	}

}
