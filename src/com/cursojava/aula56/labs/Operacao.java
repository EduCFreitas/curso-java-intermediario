package com.cursojava.aula56.labs;

public enum Operacao {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	}, MUTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			try {
				return x/y;
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
				return 0;
			}
		}
	};
	
	private String simbolo;
	
	Operacao(String simbolo){
		this.simbolo = simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	public String toString() {
		return this.simbolo;
	}
}
