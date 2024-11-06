package br.com.forma;

public class Principal {

	public static void main(String[] args) {
		Retangulo ret1 = new Retangulo();
		ret1.altura = 2;
		ret1.base = 3;
		System.out.println(ret1.calcularArea());
		
		ret1.calcularPerimetro();
		
		Triangulo tri1 = new Triangulo();
		tri1.calcularArea();
		tri1.calcularPerimetro();
		
		Circulo cir1 = new Circulo();
		cir1.calcularArea();
		cir1.calcularCircunferencia();
	}
}
