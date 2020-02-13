public class Docente extends Dipendente
{
	//ATTRIBUTI
	private static int contatore=1;
	protected int ore;
	//COSTRUTTORE
	public Docente(String nominativo, String sesso, String data_nascita, double stipendio, int ore)
	{
		super(nominativo, sesso, data_nascita, stipendio);
		this.ore = ore;
		this.codice = contatore ++;
	}
	public Docente(Docente Copia)
	{
		super(Copia);
		this.ore = Copia.ore;
		this.codice = Copia.codice;
	}
	//GETTER && SETTER
	public static int getContatore()
	{
		return contatore;
	}
	public static void setContatore(int contatore)
	{
		Docente.contatore = contatore;
	}
	//METODI
	@Override
	public String toString()
	{
		return "Docente [nominativo=" + nominativo + ", sesso=" + sesso + ", data_nascita=" + data_nascita + ", ore=" + ore + ", stipendio=" + stipendio + ", codice=" + codice + "]";
	}
}
