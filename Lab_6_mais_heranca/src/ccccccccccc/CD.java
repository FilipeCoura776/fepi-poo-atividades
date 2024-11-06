package ccccccccccc;

public class CD extends Item{
	String artistaPrincipal;
	String[] faixas;
	
	CD(String titulo, String descricao, double preco, String artistaPrincipal, String[] faixas){
		super(titulo, descricao, preco);
		this.artistaPrincipal = artistaPrincipal;
		this.faixas = faixas;
	}
	
	@Override
	void detalhesDoItem() {
		System.out.println("Titulo do CD: " + titulo);
		System.out.println("Artista Principal: " + artistaPrincipal);
		System.out.print("Faixas: ");
		for (String faixa : faixas) {
			System.out.print(faixa + ", ");
		}
		System.out.println("\nPreco: " + preco);
	}

}
