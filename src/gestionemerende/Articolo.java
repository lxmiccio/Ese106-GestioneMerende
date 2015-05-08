package gestionemerende;

import java.util.Vector;

public abstract class Articolo
{
	private Vector<ElementoOrdine> elementiOrdine;
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	
	public Articolo(String codice, String descrizione, double costoUnitario, double apportoCalorico)
	{
		if(codice == null)
			throw new IllegalArgumentException("Codice cannot be null");
		if(codice.length() <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		if(descrizione == null)
			throw new IllegalArgumentException("Descrizione cannot be null");
		if(descrizione.length() <= 0)
			throw new IllegalArgumentException("The length of Descrizione must be positive");
		if(costoUnitario <= 0)
			throw new IllegalArgumentException("CostoUnitario must be positive");	
		if(apportoCalorico <= 0)
			throw new IllegalArgumentException("ApportoCalorico must be positive");
		this.codice = codice;
		this.descrizione = descrizione;
		this.costoUnitario = costoUnitario;
		this.apportoCalorico = apportoCalorico;
		this.elementiOrdine = new Vector<ElementoOrdine>();
	}

	public void addElementoOrdine(ElementoOrdine elementoOrdine)
	{
		if(elementoOrdine == null)
			throw new IllegalArgumentException("ElementoOrdine cannot be null");
		this.elementiOrdine.addElement(elementoOrdine);
	}
	
	public double getApportoCalorico()
	{
		return this.apportoCalorico;
	}

	public String getCodice()
	{
		return this.codice;
	}

	public double getCostoUnitario()
	{
		return this.costoUnitario;
	}

	public String getDescrizione()
	{
		return this.descrizione;
	}

	public int getTotaleOrdini()
	{
		int totale = 0;
		for(ElementoOrdine elementoOrdine : this.elementiOrdine)
			totale += elementoOrdine.getQuantità();
		return totale;
	}
	
	@Override public String toString()
	{
		return "Articolo [Codice=" + this.codice + ", Descrizione=" + this.descrizione + ", CostoUnitario=" + this.costoUnitario + ", Apporto Calorico=" + this.apportoCalorico + "]";
	}
}