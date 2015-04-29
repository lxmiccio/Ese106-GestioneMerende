package gestionemerende;

import java.util.Vector;

public class Ordine
{
	private String codice;
	private Classe classe;
	private Vector<Articolo> articoli;
	
	public Ordine(String codice)
	{

		if(codice == null)
			throw new IllegalArgumentException("Codice cannot be null");
		if(codice.length() <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		this.codice = codice;
		this.articoli = new Vector<Articolo>();
	}

	public String getCodice()
	{
		return this.codice;
	}

	public Classe getClasse()
	{
		return this.classe;
	}
	
	public void setClasse(Classe classe)
	{
		if(classe == null)
			throw new IllegalArgumentException("Classe cannot be null");
		this.classe = classe;
	}

	public Vector<Articolo> getArticoli()
	{
		return this.articoli;
	}
	
	public void addArticolo(Articolo articolo)
	{
		if(articolo == null)
			throw new IllegalArgumentException("a cannot be null");
		this.articoli.addElement(articolo);
	}
	
	public int getNumeroArticoli()
	{
		return this.articoli.size();
	}
	
	public double getCostoTotale()
	{
		double costoTotale = 0;
		for(Articolo a : this.articoli)
			costoTotale += a.getCostoUnitario();
		return costoTotale;
	}

	@Override public String toString()
	{
		return "Ordine [codice=" + codice + ", classe=" + classe + ", Numero Articoli=" + articoli.size() + "]";
	}
}