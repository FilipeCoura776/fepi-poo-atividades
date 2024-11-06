package br.com.personagem;

public class Stat {
	public String type;
	public int base;
	public int growth;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public Stat(String type, int base, int growth){
		this.type = type;
		this.base = base;
		this.growth = growth;
	}

}