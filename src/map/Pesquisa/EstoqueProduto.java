package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	private Map<Long, Produto> estoque;

	public EstoqueProduto() {
		this.estoque = new HashMap<>();
	}
	
	public void adicionarProduto(Long cd, String name, int quantidade, double preco) {
		estoque.put(cd,new Produto( name, preco, quantidade));
	}
	
	public void exibirTodosProdutos() {
		System.out.println("estoque");
	}
	
	public double calcularTotalEstoque() {
		double valorTotal = 0;
		if(!estoque.isEmpty()) {
			for (Produto p : estoque.values()) {
				valorTotal += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotal;
		
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorValor =  Double.MIN_VALUE;
		if(!estoque.isEmpty()) {
			for (Produto p : estoque.values()) {
				if(p.getPreco() > maiorValor){
					produtoMaisCaro= p;
				}
			}
		
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		
		Produto produtoMaisBarato= null;
		double menorValor =  Double.MAX_VALUE;
		if(!estoque.isEmpty()) {
			for (Produto p : estoque.values()) {
				if(p.getPreco() < menorValor){
					produtoMaisBarato= p;
				}
			}
		
		}
		return produtoMaisBarato;
	}
	
	
}
