public class PC_Server extends PC_Fissi
{
	//ATTRIBUTI
	protected int num_processori;
	protected boolean RAID;
	//COSTRUTTORE
	public PC_Server(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, String dim_case, int num_processori, boolean RAID)
	{
		super(processore, RAM, memoria, marca, modello, sistema_operativo, dim_case);
		this.num_processori=num_processori;
		this.RAID=RAID;
	}
	public PC_Server(PC_Server Copia)
	{
		super(Copia);
		this.num_processori=Copia.num_processori;
		this.RAID=Copia.RAID;
	}
	@Override
	public String toString() {
		return "PC_Server [num_processori=" + num_processori + ", RAID=" + RAID + ", "+super.toString()+"]";
	}
}
