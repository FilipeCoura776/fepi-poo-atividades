package br.com.redesocial;

public class Usuario {
	private int id;
	private String nome;
	private int idade;
	private int reputacao;
	private boolean ativo;
	
	public Usuario(int id, String nome, int idade, int reputacao) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.reputacao = reputacao;
		this.ativo = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getReputacao() {
		return reputacao;
	}

	public void setReputacao(int reputacao) {
		this.reputacao = reputacao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void ativar() {
		if(!ativo) {
			ativo = true;
			System.out.println("Usuario ativado.");
		}
		else {
			System.out.println("Usuario ja esta ativo.");
		}
	}
	
	public void desativar() {
		if(ativo) {
			ativo = false;
			System.out.println("Usuario desativado.");
		}
		else {
			System.out.println("Usuario ja esta desativado.");
		}
	}
}
