public class Persona
{
	//ATTRIBUTI
	private int et�;
	private String nome;
	private String sesso;
	private String professione;
	//METODI SETTER
	public void setEt� (int et�)
	{
		if(et�>=0)
			this.et�=et�;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setSesso(String sesso)
	{
		this.sesso = sesso;
	}
	public void setProfessione(String professione)
	{
		this.professione = professione;
	}
	//METODI GETTER
	
	public String getNome()
	{
		return nome;
	}
	public int getEt�()
	{
		return et�;
	}
	public String getSesso()
	{
		return sesso;
	}
	public String getProfessione()
	{
		return professione;
	}
	//METODI
	/*public void chiSei ()
	{
		System.out.println("Sona una persona di nome: "+nome);
		System.out.println("Sesso: "+sesso);
		System.out.println("Et�: "+et�);
		System.out.println("Professione: "+professione);
	}*/
	public String chiSei ()
	{
		return "Sono una persona di nome: "+nome+", Et�: "+et�+", Sesso: "+sesso+", Professione: "+professione;
	}
	//COSTRUTTORE
	Persona (int et�, String nome, String sesso, String professione)
	{
		this.et�=et�;
		this.nome=nome;
		this.sesso=sesso;
		this.professione=professione;
	}
}
