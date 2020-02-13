public class Abitazione extends Immobile
{
	//COSTRUTTORE
	public Abitazione(Abitazione Abi)
	{
		super(Abi.numero_stanze, Abi.superficie, Abi.indirizzo, Abi.città);
	}
	public Abitazione (int numero_stanze, double superficie, String indirizzo, String città)
	{
		super(numero_stanze, superficie, indirizzo, città);
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Abitazione ["+super.toString()+"]";
	}
	//EQUALS
	public boolean equals (Abitazione Abi)
	{
		return super.compara(Abi);
	}
}
