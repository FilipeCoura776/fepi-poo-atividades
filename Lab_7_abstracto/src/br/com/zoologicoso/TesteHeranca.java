package br.com.zoologicoso;

public class TesteHeranca {

	public static void main(String[] args) {
		Gamba neto = new Gamba("Jose Ferreira Neto", 58, "ex-jogador");
		
		neto.fazerSom();
		neto.exibirInfo();

		System.out.println();
		
		Animal tiao = new Animal("Tiao do Mato", 7);
		
		tiao.fazerSom();
		tiao.exibirInfo();
	}

}
