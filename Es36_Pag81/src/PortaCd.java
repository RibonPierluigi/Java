public class PortaCd
{
	//ATTRIBUTI
	private CD raccoglitore[];
	//COSTRUTTORE
	public PortaCd (int dim)
	{
		raccoglitore = new CD[dim];
	}
	public CD getCD (int pos)
	{
		return raccoglitore[pos];
	}
	public boolean setCD (CD disco, int pos)
	{
		if(pos<raccoglitore.length && pos>=0)
			if (raccoglitore[pos]==null)
			{
				raccoglitore[pos] = new CD(disco);
				return true;
			}
		return false;
	}
	public boolean killCD (int pos)
	{
		if (pos >= 0 && pos < raccoglitore.length)
			if (raccoglitore[pos]!=null) {
				raccoglitore[pos]=null;
				return true;}
			return false;
	}
	public int getN ()
	{
		int conta=0;
		for (int i=0;i<raccoglitore.length;i++)
			if (raccoglitore[i]!=null)
				conta++;
		return conta;
	}
	public int cercaCdperTitolo (String den)
	{
		for (int i=0;i<raccoglitore.length;i++)
			if (raccoglitore[i]!=null && raccoglitore[i].getTitolo().equals(den))
				return i;
		return -1;
	}
	@Override
	public String toString()
	{
		String info="";
		for(int i=0;i<raccoglitore.length;i++)
			if(raccoglitore[i]!=null)
				info=info+raccoglitore[i].toString()+"\n";
		return info;
		//return "PortaCd [Raccoglitore=" + Arrays.toString(raccoglitore) + "]";
	}
	public int confrontaCollezione (PortaCd Rp)
	{
		int numero=0;
		for (int i=0;i<raccoglitore.length;i++)
			for (int j=0;j<Rp.raccoglitore.length;j++)
				if (raccoglitore[i]!=null && Rp.raccoglitore[j]!=null && raccoglitore[i].getTitolo().equals(Rp.raccoglitore[j].getTitolo()))
					numero++;
		return numero;
	}
}
