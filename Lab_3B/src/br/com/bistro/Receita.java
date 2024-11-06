package br.com.bistro;

public class Receita {

	private String nome;
	private String ingrediente_1;
	private String ingrediente_2;
	private String ingrediente_3;
	private String ingrediente_4;
	int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngrediente_1() {
		return ingrediente_1;
	}
	public void setIngrediente_1(String ingrediente_1) {
		this.ingrediente_1 = ingrediente_1;
	}
	public String getIngrediente_2() {
		return ingrediente_2;
	}
	public void setIngrediente_2(String ingrediente_2) {
		this.ingrediente_2 = ingrediente_2;
	}
	public String getIngrediente_3() {
		return ingrediente_3;
	}
	public void setIngrediente_3(String ingrediente_3) {
		this.ingrediente_3 = ingrediente_3;
	}
	public String getIngrediente_4() {
		return ingrediente_4;
	}
	public void setIngrediente_4(String ingrediente_4) {
		this.ingrediente_4 = ingrediente_4;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
