package br.com.biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
	private Livro livro;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	Emprestimo(Livro livro){
		if(livro.isEstaEmprestado()==false) {
			this.livro = livro;
			dataEmprestimo = LocalDate.now();
			dataDevolucao = dataEmprestimo.plusDays(14);
			livro.emprestar();
		}
		else {
			livro.emprestar();
		}
		
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public long diasRestantes(LocalDate dataAtual) {
		long dias = ChronoUnit.DAYS.between(dataAtual, dataDevolucao);
		return dias;
	}
	
	public boolean atrasado(LocalDate dataAtual) {
		if(dataAtual.isAfter(dataDevolucao))
			return true;
		else
			return false;
	}
}
