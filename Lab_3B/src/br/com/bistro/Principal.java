package br.com.bistro;

public class Principal {

	public static void main(String[] args) {
		Receita bacaiau = new Receita();
		
		bacaiau.setNome("Bacalhau com limao");
		
		bacaiau.setIngrediente_1("512 Bacalhau");
		bacaiau.setIngrediente_2("todos os limao");
		bacaiau.setIngrediente_3("Paranaense pilantra");
		bacaiau.setIngrediente_4("Mentiroso e preguicoso");

		bacaiau.setQuantidade(42);
		
		System.out.printf("%s: %s, %s, %s e %s. Quantidade: %d.", bacaiau.getNome(), 
				bacaiau.getIngrediente_1(), 
				bacaiau.getIngrediente_2(), 
				bacaiau.getIngrediente_3(), 
				bacaiau.getIngrediente_4(),
				bacaiau.getQuantidade());
	}

}
