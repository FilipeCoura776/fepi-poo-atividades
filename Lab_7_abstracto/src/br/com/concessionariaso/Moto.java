package br.com.concessionariaso;

public class Moto extends VeiculoBase{

	int cilindradas;

	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	public void acelerar() {
		System.out.println("vrum vrum (moto version)");
	}
	
	public void frear() {
		System.out.println("*barulho de freio de moto*");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Cilindradas: " + cilindradas);
	}
}
