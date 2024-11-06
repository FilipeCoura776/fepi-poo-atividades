package br.com.concessionariaso;

public class VeiculoBase {
	String marca;
	String modelo;
	int ano;
	
	public VeiculoBase(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void acelerar() {
		System.out.println("vrum vrum");
	}
	
	public void frear() {
		System.out.println("*barulho de freio*");
	}
	
	public void exibirInfo(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
}
