package ccccccccccc;

abstract class Item {
	String titulo;
	String descricao;
	double preco;
	
	Item(String titulo, String descricao, double preco){
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	abstract void detalhesDoItem();
}
