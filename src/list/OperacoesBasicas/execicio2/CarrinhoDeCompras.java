package list.OperacoesBasicas.execicio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double  preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItemPorNome(String nome) {
		List<Item> itensRemovidos = new ArrayList<>();
		
		for (Item item : itens) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensRemovidos.add(item);
			}
		}	
		itens.removeAll(itensRemovidos);
		
	}
	public void exibirItens() {
		System.out.println(itens);
	}
	public double calcularValorTotal() {
		double total = 0;
		for (Item item : itens) {
			 total +=  item.getPreco();
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Pão", 4, 2);
		carrinho.adicionarItem("Tomate", 1, 2);
		carrinho.adicionarItem("Leite", 4, 2);
		carrinho.adicionarItem("Melancia", 4, 2);
		
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		
	}
}
