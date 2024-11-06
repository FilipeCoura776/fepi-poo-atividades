package br.com.zoologicoso;

public class Animal {
	String nome;
	int idade;
	
	public Animal(String nome, int idade) {
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
	
	public void fazerSom(){
		System.out.println("Som do animal");
	}
	
	public void exibirInfo(){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}