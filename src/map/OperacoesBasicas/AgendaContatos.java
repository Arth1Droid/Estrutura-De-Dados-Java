package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> contatos;

	public AgendaContatos() {
		this.contatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatos.put(nome,numero);
	}
	
	public void removerContatoPornome(String nome) {
		if(!contatos.isEmpty()) {
			contatos.remove(nome);
		}	
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!contatos.isEmpty()) {
			numeroPorNome = contatos.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos ct = new AgendaContatos();
		
		ct.adicionarContato("ArthDroid1", 1111111);
		ct.adicionarContato("ArthDro", 333333);
		ct.adicionarContato("Droid!1", 2222222);
		ct.adicionarContato("ArthDroid1", 1111111);

		ct.exibirContatos();
		
		ct.pesquisarPorNome("ArthDroid1");
		

	}

	
	
}
