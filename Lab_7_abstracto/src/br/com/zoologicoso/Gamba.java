package br.com.zoologicoso;

public class Gamba extends Animal{
	String raca;

	public Gamba(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void fazerSom() {
		System.out.println("Vai curintia");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Raca: " + raca);
	}
	
	
}
