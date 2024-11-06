package br.com.triatlo;

public class Pato implements Voar,Nadar{
	private String nome;
	private int idade;
	
	public Pato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public void nadar() {
		System.out.println("patinho a nadar");
	}
	
	@Override
	public void voar() {
		System.out.println("patinho a voar");
	}
	
	public void exibirInfo() {
		System.out.println("Nome do patasso: " + this.nome);
		System.out.println("Idade do patasso: " + this.idade);
	}
}
