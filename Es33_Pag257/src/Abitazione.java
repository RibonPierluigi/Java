public class Abitazione extends Immobile
{
	//COSTRUTTORE
	public Abitazione(Abitazione Abi)
	{
		super(Abi.numero_stanze, Abi.superficie, Abi.indirizzo, Abi.citt�);
	}
	public Abitazione (int numero_stanze, double superficie, String indirizzo, String citt�)
	{
		super(numero_stanze, superficie, indirizzo, citt�);
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
