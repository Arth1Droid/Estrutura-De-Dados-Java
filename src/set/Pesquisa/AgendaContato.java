package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	private Set<Contato> contatos;
	
	public AgendaContato() {
		this.contatos = new HashSet<>();
	}
	
	public void adicionarContatos(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	public Set<Contato> pesquisarPorNumero(int numero){
		Set<Contato> contatosPorNumero = new HashSet<>();
		
		for (Contato contato : contatos) {
			if(contato.getNumero() == numero ) {
				contatosPorNumero.add(contato);
			}
		}
		return contatosPorNumero;
	}
	
	public Contato atualizarContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for (Contato contato : contatos) {
			if(contato.getNome().equals(nome)) {
				contato.setNome(nome);
				contato.setNumero(numero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContato ag = new AgendaContato();
		
		ag.adicionarContatos("A", 819999999);
		ag.adicionarContatos("A", 819999999);
		ag.adicionarContatos("b", 819879999);
		ag.adicionarContatos("c", 819993399);
		
		ag.exibirContatos();
		ag.atualizarContato("b", 819923949);
	}
	
}
