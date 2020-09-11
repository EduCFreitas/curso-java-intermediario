package com.cursojava.aula65;

public @interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://blog.com";
	
	String site() default "http://site.com";
}
