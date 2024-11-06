package br.com.forma;

public class Retangulo {
	double base;
	double altura;
	
	double calcularArea() {
		System.out.println("Este metodo calcula a area do retangulo.");
		return base*altura;
	}
	
	void calcularPerimetro() {
		System.out.println("Este metodo calcula o perimetro do retangulo.");
	}

}
