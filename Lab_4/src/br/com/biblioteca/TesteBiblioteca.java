package br.com.biblioteca;

import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Livro livro1 = new Livro(1, "Moby Dick", "H. Melville");
		Livro livro2 = new Livro(2, "Don Quixote", "M. de Cervantes");
		
		Emprestimo emprestimo1 = new Emprestimo(livro1);
		Emprestimo emprestimo2 = new Emprestimo(livro2);

		System.out.printf("Dias restantes do emprestimo: %d\n", emprestimo1.diasRestantes(LocalDate.now()));
		
		if(emprestimo1.atrasado(LocalDate.now()))
		{
			System.out.println("Emprestimo esta atrasado.");
		}else {
			System.out.println("Emprestimo nao esta atrasado.");
		}
		
		LocalDate temp = LocalDate.now();
		temp = temp.plusDays(15);
		if(emprestimo2.atrasado(temp))
		{
			System.out.println("Emprestimo esta atrasado.");
		}else {
			System.out.println("Emprestimo nao esta atrasado.");
		}
		
		livro1.devolver();
		livro1.devolver();
		livro2.devolver();
	}
}