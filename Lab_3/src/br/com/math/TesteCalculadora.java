package br.com.math;

public class TesteCalculadora {
	public static void main(String[] args) {
		System.out.println(Calculadora_Static.somar(5, 3));
		System.out.println(Calculadora_Static.subtrair(5, 3));
		System.out.println(Calculadora_Static.multiplicar(5, 3));
		System.out.println(Calculadora_Static.dividir(5, 3));
		System.out.println(Calculadora_Static.dividir(5, 0));
		
		System.out.println(Calculadora_Static.getNumeroDeOperacoes());
	}

}
