public class Villa extends Immobile
{
	//ATTRIBUTI
	protected int numero_piani;
	protected double superficie_giardino;
	protected boolean piscina;
	//COSTRUTTORE
	public Villa(int numero_stanze, double superficie, String indirizzo, String città, int numero_piani, double superficie_giardino, boolean piscina)
	{
		super(numero_stanze, superficie, indirizzo, città);
		this.numero_piani = numero_piani;
		this.superficie_giardino = superficie_giardino;
		this.piscina = piscina;
	}
	public Villa(Villa Vil)
	{
		super(Vil.numero_stanze, Vil.superficie, Vil.indirizzo, Vil.città);
		this.numero_piani = Vil.numero_piani;
		this.superficie_giardino = Vil.superficie_giardino;
		this.piscina = Vil.piscina;
	}
	//GETTER
	public int getNumero_piani()
	{
		return numero_piani;
	}
	public double getSuperficie_piscina()
	{
		return superficie_giardino;
	}
	public boolean isPiscina()
	{
		return piscina;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Villa [numero_piani=" + numero_piani + ", superficie_piscina=" + superficie_giardino + ", piscina="+ piscina + ", "+super.toString()+"]";
	}
	//EQUALS
	public boolean compara (Villa Vill)
	{
		if (super.compara(Vill) && this.numero_piani == Vill.numero_piani && this.piscina == Vill.piscina && this.superficie_giardino == Vill.superficie_giardino)
			return true;
		else
			return false;
	}
}
