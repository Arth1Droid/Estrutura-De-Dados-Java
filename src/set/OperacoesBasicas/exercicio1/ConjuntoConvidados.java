package set.OperacoesBasicas.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidados;
	
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String name, int codigoConvite) {
		convidados.add(new Convidado(name, codigoConvite));
	}
	
	public void removerConvidado(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = convidado;
				break;
			}
			convidados.remove(convidadoParaRemover);	
		}

	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidados);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados cj = new ConjuntoConvidados();
		
		
		cj.adicionarConvidado("Convidado 1", 1);
		cj.adicionarConvidado("Convidado 2", 2);
		cj.adicionarConvidado("Convidado 3", 3);
		cj.adicionarConvidado("Convidado 4", 4);
		cj.adicionarConvidado("ArthDroid1", 5);
		
		cj.exibirConvidados();
		System.out.println(cj.contarConvidados());
		
		cj.removerConvidado(5);
		cj.exibirConvidados();
		System.out.println(cj.contarConvidados());
		

	}
}
