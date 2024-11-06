package ccccccccccc;

public class maudfiah {

	public static void main(String[] args) {
		Livro livro = new Livro("O Mundo da Programação", "Uma introducao a programacao", 29.99, "Joao Silva",300);
		CD cd = new CD("Melhores Crits (feat. Areadbhar)", "Coletanea das melhores pedradas do ano", 19.99, "Dimitri Alexandre Blaiddyd", new String[] {"Porrada no Capacho, Porrada na Mulher, Porrada na Mulher (Demonic Beast version)"});
		livro.detalhesDoItem();	
		System.out.println();
		cd.detalhesDoItem();
	}

	
}
