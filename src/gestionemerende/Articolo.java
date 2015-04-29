package gestionemerende;

public abstract class Articolo
{
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
		this.codice = codice;
		if(descrizione == null)
			throw new IllegalArgumentException("Descrizione cannot be null");
		if(descrizione.length() <= 0)
			throw new IllegalArgumentException("The length of Descrizione must be positive");
		this.descrizione = descrizione;
		if(costoUnitario <= 0)
			throw new IllegalArgumentException("CostoUnitario must be positive");
		this.costoUnitario = costoUnitario;
		if(apportoCalorico <= 0)
			throw new IllegalArgumentException("ApportoCalorico must be positive");
		this.apportoCalorico = apportoCalorico;
	}

	public String getCodice()
	{
		return this.codice;
	}

	public String getDescrizione()
	{
		return this.descrizione;
	}

	public double getCostoUnitario()
	{
		return this.costoUnitario;
	}

	public double getApportoCalorico()
	{
		return this.apportoCalorico;
	}

	@Override public String toString()
	{
		return "Articolo [codice=" + this.codice + ", descrizione=" + this.descrizione + ", costoUnitario=" + this.costoUnitario + ", apportoCalorico=" + this.apportoCalorico + "]";
	}
}