package br.com.personagem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String stattype[] = {"str","skl","spd","luk","def","res"};
		
		System.out.printf("Character Specification\n");
		System.out.printf("Insert base level: ");
		a = sc.nextInt();
		Character borabil = new Character("Borabil", "Bilbora", a, 0);
		
		for (int i = 0; i<6; i++) {
			System.out.printf("Insert %s base: ", stattype[i]);
			a = sc.nextInt(); //a = base
			System.out.printf("Insert %s growth: ", stattype[i]);
			b = sc.nextInt(); //b = growth
			
			Stat stat = new Stat(stattype[i], a, b);
			borabil.loadStats(stat);
		}
		
		System.out.println(borabil.getStats().toString());
		
		
		
		sc.close();
	}
}
