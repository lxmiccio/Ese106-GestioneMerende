package gestionemerende;

import java.util.Vector;

public class Istituto
{
	private String nome;
	private Vector<Classe> classi;
	
	public Istituto(String nome)
	{
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
		this.classi = new Vector<Classe>();
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
	}

	public Vector<Classe> getClassi()
	{
		return this.classi;
	}
	
	public void addClasse(Classe classe)
	{
		if(classe == null)
			throw new IllegalArgumentException("Classe cannot be null");
		this.classi.addElement(classe);
	}

	@Override public String toString()
	{
		return "Istituto [nome=" + this.nome + ", Numero Classi=" + this.classi.size() + "]";
	}
}