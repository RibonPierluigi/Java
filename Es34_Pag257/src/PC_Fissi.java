public class PC_Fissi
{
	//ATTRIBUTI
	protected String processore;
	protected int RAM;
	protected int memoria;
	protected String marca;
	protected String modello;
	protected String sistema_operativo;
	protected String dim_case;
	//COSTRUTTORE
	public PC_Fissi(String processore, int RAM, int memoria, String marca, String modello, String sistema_operativo, String dim_case)
	{
		this.processore = processore;
		this.RAM = RAM;
		this.memoria = memoria;
		this.marca = marca;
		this.modello = modello;
		this.sistema_operativo = sistema_operativo;
		this.dim_case = dim_case;
	}
	public PC_Fissi(PC_Fissi Copia)
	{
		this.processore = Copia.processore;
		this.RAM = Copia.RAM;
		this.memoria = Copia.memoria;
		this.marca = Copia.marca;
		this.modello = Copia.modello;
		this.sistema_operativo = Copia.sistema_operativo;
		this.dim_case = Copia.dim_case;
	}
	@Override
	public String toString() {
		return "processore=" + processore + ", RAM=" + RAM + ", memoria=" + memoria + ", marca=" + marca
				+ ", modello=" + modello + ", sistema_operativo=" + sistema_operativo + ", dim_case=" + dim_case + "";
	}
	
}
