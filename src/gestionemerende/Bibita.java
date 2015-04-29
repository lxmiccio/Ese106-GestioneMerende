package gestionemerende;

public class Bibita extends Articolo
{
	private double quantit�;

	public Bibita(String codice, String descrizione, double costoUnitario, double apportoCalorico, double quantit�)
	{
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(quantit� <= 0)
			throw new IllegalArgumentException("Quantit� must be positive");
		this.quantit� = quantit�;
	}

	public double getQuantit�()
	{
		return this.quantit�;
	}

	@Override public String toString()
	{
		return "Bibita [quantit�=" + this.quantit� + "]";
	}
}