public class PC_Palmare extends PC_Portatili
{
	//ATTRIBUTI
	protected boolean schedaDenteBlu;
	protected String espansione;
	//COSTRUTTORE
	public PC_Palmare(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, double peso, double altezza, double larghezza, double profondità, double dimensione, boolean schedaRete, boolean schedaDenteBlu, String espansione)
	{
		super(processore, RAM, memoria, marca, modello, sistema_operativo, peso, altezza, larghezza, profondità, dimensione, schedaRete);
		this.schedaDenteBlu=schedaDenteBlu;
		this.espansione=espansione;
	}
	public PC_Palmare(PC_Palmare Copia)
	{
		super(Copia);
		this.schedaDenteBlu=Copia.schedaDenteBlu;
		this.espansione=Copia.espansione;
	}
}
