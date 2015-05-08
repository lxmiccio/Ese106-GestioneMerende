package gestionemerende;

import java.util.Vector;

public class Ordine
{
	private String codice;
	private Classe classe;
	private Vector<ElementoOrdine> elementiOrdine;
	
	public Ordine(String codice)
	{
		if(codice == null)
			throw new IllegalArgumentException("Codice cannot be null");
		if(codice.length() <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		this.codice = codice;
		this.elementiOrdine = new Vector<ElementoOrdine>();
	}

	public void addArticolo(Articolo articolo, int quantit�)
	{
		if(articolo == null)
			throw new IllegalArgumentException("a cannot be null");
		if(quantit� <= 0)
			throw new IllegalArgumentException("quantit� must be positive");
		ElementoOrdine elementoOrdine = new ElementoOrdine(articolo, this, quantit�);
		ElementoOrdine elementoOrdinePresente = null;
		for(ElementoOrdine e : this.elementiOrdine)
			if(e.getArticolo().equals(elementoOrdine))
				elementoOrdinePresente = e;
		if(elementoOrdinePresente == null)
		{
			elementiOrdine.addElement(elementoOrdine);
			elementoOrdine.getArticolo().addElementoOrdine(elementoOrdine);
		}
		else
			elementoOrdinePresente.increaseQuantitaBy(quantit�);
	}

	public Classe getClasse()
	{
		return this.classe;
	}

	public String getCodice()
	{
		return this.codice;
	}

	public double getCostoTotale()
	{
		double costoTotale = 0;
		for(ElementoOrdine elementoOrdine : this.elementiOrdine)
			costoTotale += elementoOrdine.getArticolo().getCostoUnitario()*elementoOrdine.getQuantit�();
		return costoTotale;
	}

	public Vector<ElementoOrdine> getElementiOrdine()
	{
		return this.elementiOrdine;
	}

	public int getNumeroArticoli()
	{
		int numeroArticoli = 0;
		for(ElementoOrdine elementoOrdine : this.elementiOrdine)
			numeroArticoli += elementoOrdine.getQuantit�();
		return numeroArticoli;
	}

	public void setClasse(Classe classe)
	{
		if(classe == null)
			throw new IllegalArgumentException("Classe cannot be null");
		this.classe = classe;
	}
}