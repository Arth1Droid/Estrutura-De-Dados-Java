package set.OperacoesBasicas.exercicio1;

import java.util.Objects;

public class Convidado {
	private String name;
	private int codigoConvite;
	
	public Convidado(String name, int codigoConvite) {
		this.name = name;
		this.codigoConvite = codigoConvite;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}



	public String getName() {
		return name;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
	

}
