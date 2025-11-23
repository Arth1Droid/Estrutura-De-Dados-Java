package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate date, String nome, String atracao) {
		eventosMap.put(date,new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventos = new TreeMap<>(eventosMap);
		System.out.println(eventos);
	}
	
	public void exibirProximoEvento() {
		LocalDate dataAtual =LocalDate.now();
		Map<LocalDate, Evento> eventos = new TreeMap<>(eventosMap);
		Evento proximoEvento = null;
		LocalDate proximaData = null;

		
		for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximoEvento = entry.getValue();
				proximaData = entry.getKey();
				System.out.println("O proximo evento " + proximoEvento + "é na data: " + proximaData);
				break;
			}			
		}		
	}
	
	
	public static void main(String[] args) {
		AgendaEventos ev = new AgendaEventos();
	} 
}
