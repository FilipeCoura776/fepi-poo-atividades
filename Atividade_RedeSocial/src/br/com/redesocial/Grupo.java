package br.com.redesocial;

import java.util.ArrayList;

public class Grupo {
	private int id;
	private String nome;
	private String descricao;
	private ArrayList<Usuario> membros;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Grupo(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.membros = new ArrayList();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Usuario> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<Usuario> membros) {
		this.membros = membros;
	}
	
	public void adicionarMembro(Usuario usuario) {
		membros.add(usuario);
		System.out.println("Usuario adicionado.");
	}
	
	public void removerMembro(Usuario usuario) {
		membros.remove(usuario);
		System.out.println("Usuario removido.");
	}
	
	public void listarMembros() {
		for (Usuario usuario : membros) {
			System.out.printf("%s\n", usuario.getNome());
		}
	}
}
