public class Appartamento extends Immobile
{
	//ATTRIBUTI
	protected int piano;
	protected boolean ascensore;
	protected int numTerrazzi;
	//COSTRUTTORE
	public Appartamento(int numero_stanze, double superficie, String indirizzo, String città, int piano, boolean ascensore, int numTerrazzi) {
		super(numero_stanze, superficie, indirizzo, città);
		this.piano = piano;
		this.ascensore = ascensore;
		this.numTerrazzi = numTerrazzi;
	}
	public Appartamento(Appartamento App) {
		super(App.numero_stanze, App.superficie, App.indirizzo, App.città);
		this.piano = App.piano;
		this.ascensore = App.ascensore;
		this.numTerrazzi = App.numTerrazzi;
	}
	//GETTER
	public int getPiano()
	{
		return piano;
	}
	public boolean isAscensore()
	{
		return ascensore;
	}
	public int getNumTerrazzi()
	{
		return numTerrazzi;
	}
	//TOSTRING
	@Override
	public String toString()
	{
		return "Appartamento [piano=" + piano + ", ascensore=" + ascensore + ", numTerrazzi=" + numTerrazzi + ", "+super.toString()+"]";
	}
	//EQUALS
	public boolean compara (Appartamento App)
	{
		if (super.compara(App) && this.piano == App.piano && this.ascensore == App.ascensore && this.numTerrazzi == App.numTerrazzi)
			return true;
		else
			return false;
	}
}
