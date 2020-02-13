public class GestioneDipendentiScuola
{
	//ATTRIBUTI
	private Dipendente Dipendenti[];
	//COSTRUTTORE
	public GestioneDipendentiScuola (int dim)
	{
		Dipendenti = new Dipendente[dim];
	}
	//METODI
	public boolean inserisciDipendente (Dipendente D1)
	{
		for(int i=0;i<Dipendenti.length;i++)
			if(Dipendenti[i]==null)
			{
				if(D1 instanceof Docente)
					Dipendenti[i]= new Docente((Docente)D1);
				else
					if(D1 instanceof Impiegato)
						Dipendenti[i]= new Impiegato((Impiegato)D1);
					else
						Dipendenti[i]= new ImpiegatoStraordinario((ImpiegatoStraordinario)D1);
				return true;
			}
		return false;
	}
	public String trovaDipendenti ()
	{
		String stringa = "";
		int change=0;
		boolean Error;
		for(int i=0;i<Dipendenti.length;i++)	
		{
			try
			{
				Error=false;
				@SuppressWarnings("unused")
				String strin=Dipendenti[i].toString();
				change++;
			}
			catch (NullPointerException e)
			{
				Error=true;
			}
			if(change==1)
				stringa+="I dipendenti presenti sono:\n";
			if(Error==false)
			stringa+=Dipendenti[i].toString()+"\n";
		}
		if(change==0)
			stringa+="Non sono presenti nessun dipendente";
		return stringa;
	}
	public String trovaImpiegati ()
	{
		String stringa = "";
		int change=0;
		boolean Error;
		for(int i=0;i<Dipendenti.length;i++)	
		{
			try
			{
				Error=false;
				@SuppressWarnings("unused")
				String strin=Dipendenti[i].toString();
				if(Dipendenti[i] instanceof Impiegato)
					change++;
			}
			catch (NullPointerException e)
			{
				Error=true;
			}
			if(change==1)
				stringa+="I dipendenti presenti sono:\n";
			if(Error==false)
				if(Dipendenti[i] instanceof Impiegato)
			stringa+=Dipendenti[i].toString()+"\n";
		}
		if(change==0)
			stringa+="Non sono presenti nessun dipendente";
		return stringa;
	}
	public String trovaDocente ()
	{
		String stringa = "";
		int change=0;
		boolean Error;
		for(int i=0;i<Dipendenti.length;i++)	
		{
			try
			{
				Error=false;
				@SuppressWarnings("unused")
				String strin=Dipendenti[i].toString();
				if(Dipendenti[i] instanceof Docente)
					change++;
			}
			catch (NullPointerException e)
			{
				Error=true;
			}
			if(change==1)
				stringa+="I dipendenti presenti sono:\n";
			if(Error==false)
				if(Dipendenti[i] instanceof Docente)
			stringa+=Dipendenti[i].toString()+"\n";
		}
		if(change==0)
			stringa+="Non sono presenti nessun dipendente";
		return stringa;
	}
	public String trovaImpiegatoStraordinario ()
	{
		String stringa = "";
		int change=0;
		boolean Error;
		for(int i=0;i<Dipendenti.length;i++)	
		{
			try
			{
				Error=false;
				@SuppressWarnings("unused")
				String strin=Dipendenti[i].toString();
				if(Dipendenti[i] instanceof ImpiegatoStraordinario)
					change++;
			}
			catch (NullPointerException e)
			{
				Error=true;
			}
			if(change==1)
				stringa+="I dipendenti presenti sono:\n";
			if(Error==false)
				if(Dipendenti[i] instanceof ImpiegatoStraordinario)
			stringa+=Dipendenti[i].toString()+"\n";
		}
		if(change==0)
			stringa+="Non sono presenti nessun dipendente";
		return stringa;
	}
	public boolean eliminaDipendente(int cod)
	{
		for (int i=0;i<Dipendenti.length;i++)
		{
			try
			{
				if(Dipendenti[i].codice==cod)
				{
					Dipendenti[i]=null;
					return true;
				}
			}
			catch(NullPointerException e)
			{
				
			}
		}
		return false;
	}
	public String trovaDocenteUnder18 ()
	{
		String stringa = "";
		int change=0;
		boolean Error;
		for(int i=0;i<Dipendenti.length;i++)	
		{
			try
			{
				int strin=20;
				Error=false;
				if(Dipendenti[i] instanceof Docente)
					strin=((Docente)Dipendenti[i]).ore;
				if(strin<18)
					change++;
				else
					throw new Exception ("Non contare");
			}
			catch (NullPointerException e)
			{
				Error=true;
			} catch (Exception e) {
				Error=true;
			}
			if(change==1)
			{
				stringa+="I dipendenti presenti sono:\n";
				change++;
			}
			if(Error==false)
				if(Dipendenti[i] instanceof Docente)
			stringa+=Dipendenti[i].toString()+"\n";
		}
		if(change==0)
			stringa+="Non sono presenti nessun dipendente";
		return stringa;
	}
}
