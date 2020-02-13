public class PC_Notebook extends PC_Portatili
{
	//ATTRIBUTI
	protected boolean webcam;
	//COSTRUTTORE
	public PC_Notebook(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, double peso, double altezza, double larghezza, double profondità, double dimensione, boolean schedaRete, boolean webcam)
	{
		super(processore, RAM, memoria, marca, modello, sistema_operativo, peso, altezza, larghezza, profondità, dimensione, schedaRete);
		this.webcam=webcam;
	}
	public PC_Notebook(PC_Notebook Copia)
	{
		super(Copia);
		this.webcam=Copia.webcam;
	}
	@Override
	public String toString() {
		return "PC_Notebook [webcam=" + webcam + ", "+super.toString()+"]";
	}
}
