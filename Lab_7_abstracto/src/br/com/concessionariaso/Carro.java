package br.com.concessionariaso;

public class Carro extends VeiculoBase{

	int numeroDePortas;

	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}
	
	public void acelerar() {
		System.out.println("vrum vrum (carro version)");
	}
	
	public void frear() {
		System.out.println("*barulho de freio de carro*");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("No de portas: " + numeroDePortas);
	}
}
