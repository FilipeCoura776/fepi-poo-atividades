package br.com.aaaaaaa;


class Peixe extends Animal {
	
	void fodase() {
		System.out.println("peixe");
	}

	@Override
	void fazerSom() {
		System.out.println("lguguluglggulggluglugulglugluglugugluglugul");
		
	}
}

class Gato extends Animal{

	void fodase() {
		System.out.println("gates");
	}
	
	@Override
	void fazerSom() {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
}