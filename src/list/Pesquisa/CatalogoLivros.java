package list.Pesquisa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import list.ordenacao.Pessoa;

public class CatalogoLivros {
	List<Livro> livros;
	
	public CatalogoLivros() {
		livros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro>livrosDoAutor = new ArrayList<>();
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosDoAutor.add(livro);
				}
			}
		}
		return livrosDoAutor;
	}
	
	public List<Livro> pesquisarPorInTervaloDeAno(int anoInicial, int anoFinal){
		List<Livro>livrosEncontrados = new ArrayList<>();
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ) {
					livrosEncontrados.add(livro);
				}
			}
		}
		return livrosEncontrados;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Livro 1", "ArthDroid1", 2006);
		catalogo.adicionarLivro("Livro 1", "ArthDroid1", 2006);
		catalogo.adicionarLivro("Livro 2", "DrathRoi1", 2019);
		catalogo.adicionarLivro("Livro 3", "AirdothR1", 2040);
		catalogo.adicionarLivro("Livro 4", "DorthAri1", 1990);
		
		catalogo.pesquisarPorAutor("ArthDroid1");
		catalogo.pesquisarPorTitulo("Livro 1");
		catalogo.pesquisarPorInTervaloDeAno(2006, 2020);
		

	}
}

		
