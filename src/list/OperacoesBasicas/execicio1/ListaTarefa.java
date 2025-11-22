package list.OperacoesBasicas.execicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	List<Tarefa> tarefas;
	
	public ListaTarefa() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefas.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalDeTarefas() {
		return tarefas.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefas);
	}
	
	public static void main(String[] args) {
		
		ListaTarefa tarefa = new ListaTarefa();
		System.out.println("Numero total de elmentos na lista: " + tarefa.obterNumeroTotalDeTarefas());
		
		tarefa.adicionarTarefa("Tarefa 1");
		tarefa.adicionarTarefa("Tarefa 1");
		tarefa.adicionarTarefa("Tarefa 2");
		tarefa.adicionarTarefa("Tarefa 2");


		System.out.println("Numero total de elmentos na lista: " + tarefa.obterNumeroTotalDeTarefas());
		
		tarefa.removerTarefa("Tarefa 1");
		System.out.println("Numero total de elmentos na lista: " + tarefa.obterNumeroTotalDeTarefas());

		tarefa.obterDescricoesTarefas();
	}
}
