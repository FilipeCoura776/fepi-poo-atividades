package br.com.concessionariaso;

public class Caminhao extends VeiculoBase{

	int eixos;

	public Caminhao(String marca, String modelo, int ano, int eixos) {
		super(marca, modelo, ano);
		this.eixos = eixos;
	}
	
	public void acelerar() {
		System.out.println("vrum vrum (greve dos caminhoneiros version)");
	}
	
	public void frear() {
		System.out.println("*barulho de freio de caminhao*");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Nº de eixos: " + eixos);
	}
}
