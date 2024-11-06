package br.com.math;

public class Calculadora_Static {
	public static int numeroDeOperacoes = 0;
	
	public static int somar(int a, int b) {
		numeroDeOperacoes++;
		return a+b;
	}
	
	public static int subtrair(int a, int b) {
		numeroDeOperacoes++;
		return a-b;
	}
	
	public static int multiplicar(int a, int b) {
		numeroDeOperacoes++;
		return a*b;
	}
	
	public static int dividir(int a, int b) {
		numeroDeOperacoes++;
		if(b != 0)
			return a/b;
		else
			return 0;
	}
	
	public static int getNumeroDeOperacoes() {
		return numeroDeOperacoes;
	}
}
