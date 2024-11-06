package ccccccccccc;

public class Livro extends Item{
	String autor;
	int numPaginas;
	
	Livro(String titulo, String descricao, double preco, String autor, int numPaginas){
		super(titulo, descricao, preco);
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	@Override
	void detalhesDoItem() {
		System.out.println("Titulo do Livro: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Numero de Paginas : " + numPaginas);
		System.out.println("Preco: " + preco);
	}

}
