package br.com.biblioteca;

public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private boolean estaEmprestado;
	
	Livro(int codigo, String titulo, String autor){
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.estaEmprestado = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isEstaEmprestado() {
		return estaEmprestado;
	}

	public void setEstaEmprestado(boolean estaEmprestado) {
		this.estaEmprestado = estaEmprestado;
	}
	
	public void emprestar() {
		if(!estaEmprestado) {
			estaEmprestado = true;
			System.out.println("Livro emprestado com sucesso.");
		}
		else {
			System.out.println("O livro ja esta emprestado.");
		}
	}
	
	public void devolver() {
		if(estaEmprestado) {
			estaEmprestado = false;
			System.out.println("Livro devolvido com sucesso.");
		}
		else {
			System.out.println("O livro ja esta na biblioteca.");
		}
	}
}
