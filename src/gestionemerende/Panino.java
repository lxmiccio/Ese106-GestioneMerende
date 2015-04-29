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

	public boolean isVegetariano()
	{
		return this.vegetariano;
	}

	public boolean isCarneSuina()
	{
		return this.carneSuina;
	}

	@Override
	public String toString()
	{
		return "Panino [vegetariano=" + vegetariano + ", carneSuina=" + carneSuina + "]";
	}
}