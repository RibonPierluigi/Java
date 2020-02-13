public class ImpiegatoStraordinario extends Impiegato
{
	//ATTRIBUTI
	protected int num_ore;
	protected static double retri_ora = 5.24;
	//COSTRUTTORE
	public ImpiegatoStraordinario(String nominativo, String sesso, String data_nascita, double stipendio, int livello, int num_ore, double retri_ora)
	{
		super(nominativo, sesso, data_nascita, stipendio, livello);
		this.num_ore=num_ore;
		ImpiegatoStraordinario.retri_ora=retri_ora;
	}
	public ImpiegatoStraordinario(String nominativo, String sesso, String data_nascita, double stipendio, int livello, int num_ore)
	{
		super(nominativo, sesso, data_nascita, stipendio, livello);
		this.num_ore=num_ore;
	}
	public ImpiegatoStraordinario(ImpiegatoStraordinario Copia)
	{
		super(Copia);
		this.num_ore=Copia.num_ore;
	}
	//METODI
	@Override
	public String toString()
	{
		return "ImpiegatoStraordinario [num_ore=" + num_ore + ", retri_ora=" + retri_ora + ", nominativo=" + nominativo + ", sesso=" + sesso + ", data_nascita=" + data_nascita + ", stipendio=" + stipendio + ", codice=" + codice + ", livello=" + livello + "]";
	}
}
