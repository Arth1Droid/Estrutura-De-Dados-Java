package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoas;
	
	public OrdenacaoPessoa() {
		pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura){
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> listaOrdenadaPorIdade(){
		List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(pessoas);
		Collections.sort(pessoasOrdenadasPorIdade);
		return pessoasOrdenadasPorIdade;
	}
	
	public List<Pessoa> listaOrdenadaPorAltura(){
		List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoas);
		Collections.sort(pessoasOrdenadasPorAltura);
		return pessoasOrdenadasPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
		ordenacao.adicionarPessoa("ARTHDROID1", 12, 1.80);
		ordenacao.adicionarPessoa("Ab", 13, 1.90);
		ordenacao.adicionarPessoa("Bob", 20, 1.30);
		ordenacao.adicionarPessoa("Lion", 1, 1.00);
		
		System.out.println(ordenacao.listaOrdenadaPorAltura());
		System.out.println(ordenacao.listaOrdenadaPorIdade());

	}
}

