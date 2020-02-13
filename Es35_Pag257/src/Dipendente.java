public class Dipendente
{
	protected String nominativo;
	protected String sesso;
	protected String data_nascita;
	protected double stipendio;
	protected int codice;
	//COSTRUTTORE
	public Dipendente(String nominativo, String sesso, String data_nascita, double stipendio) {
		this.nominativo = nominativo;
		this.sesso = sesso;
		this.data_nascita = data_nascita;
		this.stipendio = stipendio;
	}
	public Dipendente(Dipendente Copia) {
		this.nominativo = Copia.nominativo;
		this.sesso = Copia.sesso;
		this.data_nascita = Copia.data_nascita;
		this.stipendio = Copia.stipendio;
	}
	//METODI
	@Override
	public String toString()
	{
		return "nominativo=" + nominativo + ", sesso=" + sesso + ", data_nascita=" + data_nascita + ", stipendio=" + stipendio + ", codice=" + codice;
	}
	
}
