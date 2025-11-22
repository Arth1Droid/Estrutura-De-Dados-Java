package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private String nome;
	private Long codigoProdduto;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, Long codigoProdduto, double preco, int quantidade) {
		this.nome = nome;
		this.codigoProdduto = codigoProdduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Long getCodigoProdduto() {
		return codigoProdduto;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigoProdduto=" + codigoProdduto + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProdduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoProdduto, other.codigoProdduto);
	}

	@Override
	public int compareTo(Produto o) {
		return nome.compareToIgnoreCase(o.getNome());
	}
	
	
}

	class ComparablePorPreco implements Comparator<Produto>{

		@Override
		public int compare(Produto o1, Produto o2) {
			return Double.compare(o1.getPreco(), o2.getPreco());
		}
		
	}
	
