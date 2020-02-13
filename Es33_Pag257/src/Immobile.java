public class Immobile
{
	//ATTRIBUTI
	protected int numero_stanze;
	protected double superficie;
	protected String indirizzo;
	protected String città;
	protected Immobile Patrimonio_Imm[];
	//COSTRUTTORE
	public Immobile(int numero_stanze, double superficie, String indirizzo, String città)
	{
		this.numero_stanze = numero_stanze;
		this.superficie = superficie;
		this.indirizzo = indirizzo;
		this.città = città;
	}
	public Immobile(Immobile Copia)
	{
		this.numero_stanze = Copia.numero_stanze;
		this.superficie = Copia.superficie;
		this.indirizzo = Copia.indirizzo;
		this.città = Copia.città;
	}
	public Immobile (int dim)
	{
		Patrimonio_Imm = new Immobile [dim];
	}
	//GETTER
	public int getNumero_stanze()
	{
		return numero_stanze;
	}
	public double getSuperficie()
	{
		return superficie;
	}
	public String getIndirizzo()
	{
		return indirizzo;
	}
	public String getCittà()
	{
		return città;
	}
	//TOSTRING
	@Override
	public String toString()
	{
		return "numero_stanze=" + numero_stanze + ", superficie=" + superficie + ", indirizzo=" + indirizzo + ", città=" + città;
	}
	//EQUALS
	public boolean compara (Immobile Im)
	{
		if (this.numero_stanze == Im.numero_stanze && this.superficie == Im.superficie && this.indirizzo.equals(Im.indirizzo) && this.città.equals(Im.città))
			return true;
		else
			return false;
	}
	public boolean inserisciImmobile (Immobile nuovo)
	{
		for(int i=0;i<Patrimonio_Imm.length;i++)
		{
			if(Patrimonio_Imm[i]==null)
			{
				if(nuovo instanceof Villa)
				{
				Patrimonio_Imm[i]=new Villa ((Villa)nuovo);
				return true;
				}
				else
				{
					if ((nuovo instanceof Appartamento))
					{
						Patrimonio_Imm[i]=new Appartamento ((Appartamento)nuovo);
						return true;
					}
					else
					{
						Patrimonio_Imm[i]=new Abitazione ((Abitazione)nuovo);
						return true;
					}
				}
			}
		}
		return false;
	}
	public String trovaVilla ()
	{
		String stringa = "Le ville presenti sono: \n";
		for(int i=0;i<Patrimonio_Imm.length;i++)	
		{
			if(Patrimonio_Imm[i] != null && Patrimonio_Imm[i] instanceof Villa)
				stringa+=Patrimonio_Imm[i].toString()+"\n";
		}
		return stringa;
	}
	public String trovaAppartamento ()
	{
		String stringa = "Gli appartamenti presenti sono: \n";
		for(int i=0;i<Patrimonio_Imm.length;i++)	
		{
			if(Patrimonio_Imm[i] != null && Patrimonio_Imm[i] instanceof Appartamento)
				stringa+=Patrimonio_Imm[i].toString()+"\n";
		}
		return stringa;
	}
	public String infoImmobili ()
	{
		String stringa = "Gli immobili presenti sono: \n";
		for(int i=0;i<Patrimonio_Imm.length;i++)	
		{
			if(Patrimonio_Imm[i] != null)
				stringa+=Patrimonio_Imm[i].toString()+"\n";
		}
		return stringa;	
	}
	public String trovaAbitazione ()
	{
		String stringa = "Le abitazioni presenti sono: \n";
		for(int i=0;i<Patrimonio_Imm.length;i++)	
		{
			if(Patrimonio_Imm[i] != null && Patrimonio_Imm[i] instanceof Abitazione)
				stringa+=Patrimonio_Imm[i].toString()+"\n";
		}
		return stringa;
	}
	public String ricercaImmobiliCittà (String città)
	{
		String info= "Gli immobili presenti nel sistema con città "+ città+" sono:\n";
		for (int i=0;i<Patrimonio_Imm.length;i++)
			if(Patrimonio_Imm[i]!=null && Patrimonio_Imm[i].città.equals(città))
				info+=Patrimonio_Imm[i].toString()+"\n";
		return info;
	}
	public String ricercaVillePiscina ()
	{
		String info= "Le ville presenti nel sistema con piscina sono:\n";
		for (int i=0;i<Patrimonio_Imm.length;i++)
			if(Patrimonio_Imm[i]!=null && Patrimonio_Imm[i] instanceof Villa && ((Villa)Patrimonio_Imm[i]).piscina==true)
				info+=Patrimonio_Imm[i].toString()+"\n";
		return info;
	}
	public String ricercaAppartamentoAscensore ()
	{
		String info= "Gli appartamenti presenti nel sistema con ascensore sono:\n";
		for (int i=0;i<Patrimonio_Imm.length;i++)
			if(Patrimonio_Imm[i]!=null && Patrimonio_Imm[i] instanceof Appartamento && ((Appartamento)Patrimonio_Imm[i]).ascensore==true)
				info+=Patrimonio_Imm[i].toString()+"\n";
		return info;
	}
}
