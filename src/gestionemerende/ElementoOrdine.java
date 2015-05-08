package gestionemerende;

public class ElementoOrdine
{
	private Articolo articolo;
	private int quantità;
	private Ordine ordine;
	
	public ElementoOrdine(Articolo articolo, Ordine ordine, int quantità)
	{
		if(articolo == null)
			throw new IllegalArgumentException("Articolo cannot be null");
		if(quantità <= 0)
			throw new IllegalArgumentException("Quantità must be positive");
		if(ordine == null)
			throw new IllegalArgumentException("Ordine cannot be null");
		this.quantità = quantità;
		this.articolo = articolo;
		this.ordine = ordine;
	}

	public Articolo getArticolo()
	{
		return articolo;
	}
	
	public Ordine getOrdine()
	{
		return ordine;
	}
	
	public int getQuantità()
	{
		return quantità;
	}
	
	public void increaseQuantitaBy(int incremento)
	{
		
		if (incremento <= 0)
			throw new IllegalArgumentException("incremento must be positive");
		this.quantità += incremento;
	}

	@Override public String toString()
	{
		return "Elemento [Articolo=" + articolo + ", Quantità=" + quantità + ", Ordine=" + ordine + "]";
	}
}