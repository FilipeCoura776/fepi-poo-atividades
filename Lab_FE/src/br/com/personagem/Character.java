package br.com.personagem;

import java.util.ArrayList;
import java.util.List;

public class Character {
	public String name;
	public String cclass;
	public int levelt1;
	public int levelt2;
	//public int exp;
	//public String affin;
	public List<Stat> stats;
	//public List<WpnRank> wpnRanks;
	
	public Character(String name, String cclass, int levelt1, int levelt2) {
		this.name = name;
		this.cclass = cclass;
		this.levelt1 = levelt1;
		this.levelt2 = levelt2;
		//this.exp = exp;
		//this.affin = affin;
		this.stats = new ArrayList<>();
		//this.wpnRanks = new ArrayList<>();
	}
	
	public void loadStats(Stat st) {
		
		this.stats.add(st);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCclass() {
		return cclass;
	}

	public void setCclass(String cclass) {
		this.cclass = cclass;
	}

	public int getLevelt1() {
		return levelt1;
	}

	public void setLevelt1(int levelt1) {
		this.levelt1 = levelt1;
	}

	public int getLevelt2() {
		return levelt2;
	}

	public void setLevelt2(int levelt2) {
		this.levelt2 = levelt2;
	}

	public List<Stat> getStats() {
		return stats;
	}
	
	public String getStatList() {
		String x = "";
		
		for (int i = 0; i < 6; i++) {
			stats.toString();;
		}
		
		return x;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	
}

