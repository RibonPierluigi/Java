public class Veicolo
{
	//ATTRIBUTI
	private String targa;
	private String marca;
	private String modello;
	private int cilindrata;
	private int anno_acquisto;
	private int numero_posti;
	private static int prezzo_cilindrata = 10;
	public String codice;
	//COSTRUTTORE
	public Veicolo(String modello, String marca, String targa, int cilindrata, int anno_acquisto, int numero_posti, String codice)
	{
		this.targa=targa;
		this.marca=marca;
		this.modello=modello;
		this.cilindrata=cilindrata;
		this.anno_acquisto=anno_acquisto;
		this.numero_posti=numero_posti;
		this.codice=codice;
	}
	public Veicolo(Veicolo Copia)
	{
		this.targa=Copia.targa;
		this.marca=Copia.marca;
		this.modello=Copia.modello;
		this.cilindrata=Copia.cilindrata;
		this.anno_acquisto=Copia.anno_acquisto;
		this.numero_posti=Copia.numero_posti;
	}
	//GETTER
	public String getTarga()
	{
		return targa;
	}
	public String getMarca()
	{
		return marca;
	}
	public String getModello()
	{
		return modello;
	}
	public int getCilindrata()
	{
		return cilindrata;
	}
	public int getAnno_acquisto()
	{
		return anno_acquisto;
	}
	public int getNumero_posti()
	{
		return numero_posti;
	}
	//TOSTRING
	@Override
	public String toString()
	{
		return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", anno_acquisto=" + anno_acquisto + ", numero_posti=" + numero_posti + "]";
	}
	//METODI
	public int calcolaCosto()
	{
		return prezzo_cilindrata*cilindrata;
	}
	public void setPrezzoCilindrata (int prezzo)
	{
		prezzo_cilindrata=prezzo;
	}
}
