package br.com.oficina;

import java.util.List;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private Motor motor;
	private List<Pneu> pneus;
	private Proprietario dono;

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
	
}