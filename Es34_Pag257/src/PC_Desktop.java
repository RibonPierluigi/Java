public class PC_Desktop extends PC_Fissi
{
	//ATTRIBUTI
	protected String schedaVideo;
	protected String schedaAudio;
	//COSTRUTTORE
	public PC_Desktop(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, String dim_case, String schedaVideo, String schedaAudio)
	{
		super(processore, RAM, memoria, marca, modello, sistema_operativo, dim_case);
		this.schedaVideo=schedaVideo;
		this.schedaAudio=schedaAudio;
	}
	public PC_Desktop(PC_Desktop Copia)
	{
		super(Copia);
		this.schedaVideo=Copia.schedaVideo;
		this.schedaAudio=Copia.schedaAudio;
	}
	@Override
	public String toString() {
		return "PC_Desktop [schedaVideo=" + schedaVideo + ", schedaAudio=" + schedaAudio + ", "+super.toString()+"]";
	}
	
}
