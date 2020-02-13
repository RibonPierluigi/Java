public class Persona
{
	//ATTRIBUTI
	private int età;
	private String nome;
	private String sesso;
	private String professione;
	//METODI SETTER
	public void setEtà (int età)
	{
		if(età>=0)
			this.età=età;
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
	public int getEtà()
	{
		return età;
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
		System.out.println("Età: "+età);
		System.out.println("Professione: "+professione);
	}*/
	public String chiSei ()
	{
		return "Sono una persona di nome: "+nome+", Età: "+età+", Sesso: "+sesso+", Professione: "+professione;
	}
	//COSTRUTTORE
	Persona (int età, String nome, String sesso, String professione)
	{
		this.età=età;
		this.nome=nome;
		this.sesso=sesso;
		this.professione=professione;
	}
}
