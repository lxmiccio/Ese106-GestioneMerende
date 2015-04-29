package gestionemerende;

import java.util.Vector;

public class Classe
{
	private String nome;
	private Vector<Ordine> ordini;
	
	public Classe(String nome)
	{
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
		this.ordini = new Vector<Ordine>();
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
	}

	public Vector<Ordine> getOrdini()
	{
		return ordini;
	}
	
	private boolean isDisponibile(Ordine ordine)
	{
		boolean disponibile = true;
		for(Ordine o : this.ordini)
			if(ordine.getCodice().equals(o.getCodice()))
				disponibile = false;
		return disponibile;
	}
	
	public void addOrdine(Ordine ordine)
	{
		if(ordine == null)
			throw new IllegalArgumentException("Ordine cannot be null");
		if(!isDisponibile(ordine))
			throw new IllegalArgumentException("Ordine " + ordine.getCodice() + " already present");
		this.ordini.add(ordine);
		ordine.setClasse(this);
	}

	@Override public String toString()
	{
		return "Classe [nome=" + this.nome + ", Numero Ordini=" + this.ordini.size() + "]";
	}	
}