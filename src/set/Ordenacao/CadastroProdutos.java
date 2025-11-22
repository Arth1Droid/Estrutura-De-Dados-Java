package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, Long codigo, double preco, int quantidade) {
		produtos.add(new Produto(nome, codigo, preco,quantidade));
	}
	
	public Set<Produto> exibirProdutoPorNome(){
		Set<Produto> produtosPornome = new TreeSet<>(produtos);
		return produtosPornome;
		
	}
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparablePorPreco());
		 produtosPorPreco.addAll(produtos);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		
		 CadastroProdutos cp = new CadastroProdutos();
		 
		 cp.adicionarProduto("Biscoito", 1L, 7.0, 9);
		 cp.adicionarProduto("Maçã", 5L, 9.0, 7);
		 cp.adicionarProduto("Banana", 2L, 10.0, 3);
		 cp.adicionarProduto("Fone", 4L, 5.0, 12);
		 cp.adicionarProduto("Relogio", 3L, 3.0, 10);
		 
		 System.out.println(cp.exibirPorPreco());
		 System.out.println("=====================================");
		 System.out.println(cp.exibirProdutoPorNome());


		
	}
}
