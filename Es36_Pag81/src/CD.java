public class CD
{
	//ATTRIBUTI
	private String titolo;
	private String autore;
	private int numeroBrani;
	private int durata;
	//COSTRUTTORE
	public CD (String titolo, String autore, int numeroBrani, int durata)
	{
		this.titolo=titolo;
		this.autore=autore;
		this.numeroBrani=numeroBrani;
		this.durata=durata;
	}
	public CD (CD copia)
	{
		this.titolo=copia.titolo;
		this.autore=copia.autore;
		this.numeroBrani=copia.numeroBrani;
		this.durata=copia.durata;
	}
	//SETTER && GETTER
	
	public String getTitolo()
	{
		return titolo;
	}
	public void setTitolo(String titolo)
	{
		this.titolo = titolo;
	}
	public String getAutore()
	{
		return autore;
	}
	public void setAutore(String autore)
	{
		this.autore = autore;
	}
	public int getNumeroBrani()
	{
		return numeroBrani;
	}
	public void setNumeroBrani(int numeroBrani)
	{
		this.numeroBrani = numeroBrani;
	}
	public int getDurata()
	{
		return durata;
	}
	public void setDurata(int durata)
	{
		this.durata = durata;
	}
	
	@Override
	public String toString()
	{
		return "CD [titolo=" + titolo + ", autore=" + autore + ", numeroBrani=" + numeroBrani + ", durata=" + durata
				+ "]";
	}
	//METODI
	public String compareDurata (CD CD2)
	{
		if (this.durata==CD2.getDurata())
			return "Durata uguale";
		else
		{
			if (this.durata>CD2.getDurata())
				return "Il primo cd ha una durata maggiore";
			else
				return "Il secondo cd ha una durata maggiore";
		}
	}
}
