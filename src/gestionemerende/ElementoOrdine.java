package gestionemerende;

public class ElementoOrdine
{
	private Articolo articolo;
	private int quantit�;
	private Ordine ordine;
	
	public ElementoOrdine(Articolo articolo, Ordine ordine, int quantit�)
	{
		if(articolo == null)
			throw new IllegalArgumentException("Articolo cannot be null");
		if(quantit� <= 0)
			throw new IllegalArgumentException("Quantit� must be positive");
		if(ordine == null)
			throw new IllegalArgumentException("Ordine cannot be null");
		this.quantit� = quantit�;
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
	
	public int getQuantit�()
	{
		return quantit�;
	}
	
	public void increaseQuantitaBy(int incremento)
	{
		
		if (incremento <= 0)
			throw new IllegalArgumentException("incremento must be positive");
		this.quantit� += incremento;
	}

	@Override public String toString()
	{
		return "Elemento [Articolo=" + articolo + ", Quantit�=" + quantit� + ", Ordine=" + ordine + "]";
	}
}