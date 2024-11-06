package br.com.bbbbbbbbbbbbbb;

public class Estudante extends Pessoa{
	String matricula;
	
	Estudante(String nome, int idade, String matricula){
		super(nome, idade);
		this.matricula = matricula;
	}
}
