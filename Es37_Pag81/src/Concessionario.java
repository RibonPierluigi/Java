public class Concessionario
{
	//ATTRIBUTI
	private Veicolo garage[];
	//COSTRUTTORE
	public Concessionario (int dim)
	{
		garage = new Veicolo[dim];
	}
	public Veicolo getVeicolo (int pos)
	{
		return garage[pos];
	}
	public boolean setVeicolo (Veicolo Auto, int pos)
	{
		if(pos<garage.length && pos>=0)
			if (garage[pos]==null)
			{
				garage[pos] = new Veicolo(Auto);
				return true;
			}
		return false;
	}
	public boolean killCD (int pos)
	{
		if (pos >= 0 && pos < garage.length)
			if (garage[pos]!=null) {
				garage[pos]=null;
				return true;}
			return false;
	}
	public int getN ()
	{
		int conta=0;
		for (int i=0;i<garage.length;i++)
			if (garage[i]!=null)
				conta++;
		return conta;
	}
	@Override
	public String toString()
	{
		String info="";
		for(int i=0;i<garage.length;i++)
			if(garage[i]!=null)
				info=info+garage[i].toString()+"\n";
		return info;
	}
	public void Marca ()
	{
		boolean banana=false;
		String Qualcosa [];
		Qualcosa = new String [2000];
		for (int i=0;i<garage.length;i++)
			for(int j=0;j<Qualcosa.length && banana==true;j++) {
				if(Qualcosa[j]!=null && garage[i]!=null)
				{
					Qualcosa[j]=garage[i].codice;
					Qualcosa[j+1]="1";
				}
				else {
				if(garage[i]!=null && garage[i].codice.equals(Qualcosa[j]))
				{
					Qualcosa[j+1]+="1";
					banana=true;
				}}
				j++;
			}
	}
}
	