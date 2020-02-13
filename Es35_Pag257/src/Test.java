import java.util.*;
public class Test
{
	public static void main(String[] args)
	{
		Impiegato im = new Impiegato ("Mario de Angelis","M","25/01/1985",2500,2);
		im.stipendio=0;
		System.out.println(im.toString());
		Docente d1 = new Docente("Carlo Squartato","M","20/02/1970",2000,3);
		System.out.println(d1.toString());
		GestioneDipendentiScuola GDP = new GestioneDipendentiScuola (15);
		System.out.println("Risultato: "+GDP.inserisciDipendente(d1));
		System.out.println("Risultato: "+GDP.inserisciDipendente(im));
		System.out.println(GDP.trovaImpiegatoStraordinario());
		System.out.println(GDP.trovaDocenteUnder18());
		Scanner tastiera = new Scanner (System.in);
		boolean Errore;
		do
		{
			Errore=false;
			System.out.println("Inserisci le informazioni comuni");
			System.out.println("Inserisci il nominativo: ");
			String nominativo=tastiera.nextLine();
			System.out.println("Inserisci il sesso: ");
			String sesso=tastiera.next();
			tastiera.nextLine();
			System.out.println("Inserisci la data di nascita: ");
			String data=tastiera.nextLine();
			int tipo=5;
			boolean err;
			double stipendio=0;
			do
			{
			err=false;
			System.out.println("Inserisci lo stipendio: ");
			try
			{
			stipendio=tastiera.nextDouble();
			}
			catch(InputMismatchException e)
			{
				err=true;
				tastiera.nextLine();
			}
			}
			while(err);
			do
			{
			try
			{
			err=false;
			System.out.println("Inserisci il tipo di lavoro:\n1-Docente\n2-Impiegato\n3-Impiegato Straordinario");
			tipo=tastiera.nextInt();
			}
			catch(InputMismatchException e)
			{
				err=true;
				tastiera.nextLine();
			}
			}
			while(err);
			switch (tipo)
			{
				case 1:
					try
					{
					System.out.println("Inserisci le ore di lavoro: ");
					int ore=tastiera.nextInt();
					GDP.inserisciDipendente(new Docente(nominativo,sesso,data,stipendio,ore));
					}
					catch(InputMismatchException e)
					{
						tastiera.nextLine();
						System.out.println("Errore nell'inserimento dati. Inizio procedura di inizializzazione");
						Errore=true;
					}
					break;
				case 2:
					try
					{
					System.out.println("Inserisci il livello di potere: ");
					int livello=tastiera.nextInt();
					GDP.inserisciDipendente(new Impiegato(nominativo,sesso,data,stipendio,livello));
					}
					catch(InputMismatchException e)
					{
						tastiera.nextLine();
						System.out.println("Errore nell'inserimento dati. Inizio procedura di inizializzazione");
						Errore=true;
					}
					break;
				case 3:
					try
					{
					System.out.println("Inserisci il livello di potere: ");
					int livello=tastiera.nextInt();
					System.out.println("Inserisci le ore di lavoro: ");
					int num_ore=tastiera.nextInt();
					System.out.println("Vuoi modificare la retribuzione oraria:\n1-No\n2-Sì");
					int scelta=tastiera.nextInt();
					switch(scelta)
						{
						case 1:
							GDP.inserisciDipendente(new ImpiegatoStraordinario(nominativo,sesso,data,stipendio,livello,num_ore));
							break;
						case 2:
							System.out.println("Inserisci la nuova retribuzione: ");
							double retri_ora=tastiera.nextDouble();
							GDP.inserisciDipendente(new ImpiegatoStraordinario(nominativo,sesso,data,stipendio,livello,num_ore,retri_ora));
							break;
						default:
							System.out.println("Lo vedo come un no");
							GDP.inserisciDipendente(new ImpiegatoStraordinario(nominativo,sesso,data,stipendio,livello,num_ore));
							break;
						}
					}
					catch(InputMismatchException e)
					{
						tastiera.nextLine();
						System.out.println("Errore nell'inserimento dati. Inizio procedura di inizializzazione");
						Errore=true;
					}
					break;
				default:
					System.out.println("Errore nell'inserimento. Inizio procedura di inizializzazione");
					Errore=true;
					tastiera.nextLine();
					break;
			}
		}
		while(Errore);
		System.out.println("Operazione avvenuta con successo");
		tastiera.close();
	}
}
