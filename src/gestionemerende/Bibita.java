package gestionemerende;

public class Bibita extends Articolo
{
	private double quantità;

	public Bibita(String codice, String descrizione, double costoUnitario, double apportoCalorico, double quantità)
	{
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(quantità <= 0)
			throw new IllegalArgumentException("Quantità must be positive");
		this.quantità = quantità;
	}

	public double getQuantità()
	{
		return this.quantità;
	}

	@Override public String toString()
	{
		return "Bibita [quantità=" + this.quantità + "]";
	}
}