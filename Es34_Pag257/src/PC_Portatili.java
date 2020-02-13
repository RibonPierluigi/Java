public class PC_Portatili
{
	//ATTRIBUTI
	protected String processore;
	protected int RAM;
	protected int memoria;
	protected String marca;
	protected String modello;
	protected String sistema_operativo;
	protected double peso;
	protected double altezza;
	protected double larghezza;
	protected double profondità;
	protected double dimensione;
	protected boolean schedaRete;
	//COSTRUTTORE
	public PC_Portatili(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, double peso, double altezza, double larghezza, double profondità, double dimensione, boolean schedaRete)
	{
		this.processore = processore;
		this.RAM = RAM;
		this.memoria = memoria;
		this.marca = marca;
		this.modello = modello;
		this.sistema_operativo = sistema_operativo;
		this.peso = peso;
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondità = profondità;
		this.dimensione = dimensione;
		this.schedaRete = schedaRete;
	}
	public PC_Portatili(PC_Portatili Copia)
	{
		this.processore = Copia.processore;
		this.RAM = Copia.RAM;
		this.memoria = Copia.memoria;
		this.marca = Copia.marca;
		this.modello = Copia.modello;
		this.sistema_operativo = Copia.sistema_operativo;
		this.peso = Copia.peso;
		this.altezza = Copia.altezza;
		this.larghezza = Copia.larghezza;
		this.profondità = Copia.profondità;
		this.dimensione = Copia.dimensione;
		this.schedaRete = Copia.schedaRete;
	}
	@Override
	public String toString() {
		return "processore=" + processore + ", RAM=" + RAM + ", memoria=" + memoria + ", marca=" + marca
				+ ", modello=" + modello + ", sistema_operativo=" + sistema_operativo + ", peso=" + peso + ", altezza="
				+ altezza + ", larghezza=" + larghezza + ", profondità=" + profondità + ", dimensione=" + dimensione
				+ ", schedaRete=" + schedaRete + "";
	}
	
}
