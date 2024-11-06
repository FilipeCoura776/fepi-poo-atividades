package br.com.concessionariaso;

public class TesteVeiculos {

	public static void main(String[] args) {
		Carro carro = new Carro("Ford", "KA", 2016, 4);
		
		carro.acelerar();
		carro.frear();
		carro.exibirInfo();

	}

}
