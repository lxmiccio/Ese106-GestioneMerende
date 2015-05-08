package gestionemerende;

public class Panino extends Articolo
{
	boolean vegetariano;
	boolean carneSuina;
	
	public Panino(String codice, String descrizione, double costoUnitario, double apportoCalorico, boolean vegetariano, boolean carneSuina)
	{
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(vegetariano && carneSuina)
			throw new IllegalArgumentException("You are confused...");
		this.vegetariano = vegetariano;
		this.carneSuina = carneSuina;
	}

	public boolean isCarneSuina()
	{
		return this.carneSuina;
	}

	public boolean isVegetariano()
	{
		return this.vegetariano;
	}
}