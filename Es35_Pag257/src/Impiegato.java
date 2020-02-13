public class Impiegato extends Dipendente
{
	//ATTRIBUTI
	private static int contatore=5000;
	protected int livello;
	//COSTRUTTORE
	public Impiegato(String nominativo, String sesso, String data_nascita, double stipendio, int livello) {
		super(nominativo, sesso, data_nascita, stipendio);
		this.livello = livello;
		this.codice = contatore++;
	}
	public Impiegato(Impiegato Copia) {
		super(Copia);
		this.livello = Copia.livello;
		this.codice = Copia.codice;
	}
	//GETTER && SETTER
	public static int getContatore()
	{
		return contatore;
	}
	public static void setContatore(int contatore)
	{
		Impiegato.contatore = contatore;
	}
	//METODI
	@Override
	public String toString() {
		return "Impiegato ["+super.toString() + ", livello=" + livello + "]";
	}
	
}
