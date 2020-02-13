import java.util.InputMismatchException;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		/*Villa v1 = new Villa (10, 182.5, "Via G. Carbone 27","Camposampiero", 3, 200, true);
		Villa v2 = new Villa (15, 180.5, "Via G. Diamante 27","Toronto", 3, 200, true);
		Appartamento A1 = new Appartamento (15, 182.5, "Via G. Grafite 27","Milano", 2, true, 1);*/
		//System.out.println("Risultato comparazione: "+v1.compara(v2));
		//System.out.println("Indirizzo: "+v1.getIndirizzo());
		//System.out.println(v1.toString());
		Immobile Im1 = new Immobile (15);
		/*System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(v1));
		System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(v2));
		System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(A1));
		System.out.println(Im1.trovaVilla());
		System.out.println(Im1.trovaAppartamento());
		System.out.println(Im1.infoImmobili());
		System.out.println(Im1.ricercaImmobiliCittà("Milano"));
		System.out.println(Im1.ricercaVillePiscina());*/
		Scanner tastiera = new Scanner (System.in);
		//int scelta=tastiera.nextInt();
		//double val_double=tastiera.nextDouble();
		//String val_string=tastiera.next();//without space;
		//val_string=tastiera.nextLine();
		int scelta=0;
		while(scelta!=6)
		{
		System.out.println("Digita:\n1 - Inserisci un nuovo oggetto\n2 - Visualizza tutti gli immobili\n3 - Visualizzare le ville\n4 - Visualizzare gli appartamenti\n5 - Visualizzare le abitazioni\n6 - Termina il programma");
		System.out.print("Digita la scelta: ");
		try
		{
		scelta = tastiera.nextInt();
		}
		catch (InputMismatchException e)
		{
			scelta = 7;
			tastiera.nextLine();
		}
		switch (scelta)
		{
			case 1:
				System.out.println("Digita: \na - Inserisci una nuova villa\nb - Inserisci una nuovo appartamento\nc - Inserisci una nuova abitazione\n");
				System.out.print("Digita la scelta: ");
				String tipo = tastiera.next();
				switch (tipo)
				{
				case "a":
					try
					{
						System.out.println("Digita il numero di stanze: ");
						int num_stanze=tastiera.nextInt();
						System.out.println("Digita la superficie: ");
						double superficie=tastiera.nextDouble();
						System.out.println("Digita l'indirizzo: ");
						tastiera.nextLine();
						String indirizzo=tastiera.nextLine();
						System.out.println("Digita la città: ");
						String città=tastiera.nextLine();
						System.out.println("Digita il numero di piani: ");
						int num_piani=tastiera.nextInt();
						System.out.println("Digita la superficie del giardino: ");
						double sup_giardino=tastiera.nextDouble();
						System.out.println("Digita se è presenta di una piscina (true/false): ");
						Boolean piscina=tastiera.nextBoolean();
						System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(new Villa(num_stanze,superficie,indirizzo,città,num_piani,sup_giardino,piscina)));
						break;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Errore");
						tastiera.nextLine();
						break;
					}
				case "b":
					try
					{
						System.out.println("Digita il numero di stanze: ");
						int stanze=tastiera.nextInt();
						System.out.println("Digita la superficie: ");
						double sup=tastiera.nextDouble();
						System.out.println("Digita l'indirizzo: ");
						tastiera.nextLine();
						String indo=tastiera.nextLine();
						System.out.println("Digita la città: ");
						String cit=tastiera.nextLine();
						System.out.println("Digita il piano: ");
						int piano=tastiera.nextInt();
						System.out.println("Digita se è presente l'ascensore: ");
						boolean ascensore=tastiera.nextBoolean();
						System.out.println("Digita il numero di terrazzi: ");
						int terrazzi=tastiera.nextInt();
						System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(new Appartamento(stanze,sup,indo,cit,piano,ascensore,terrazzi)));
						break;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Errore");
						tastiera.nextLine();
						break;
					}
				case "c":
					try
					{
						System.out.println("Digita il numero di stanze: ");
						int stanz=tastiera.nextInt();
						System.out.println("Digita la superficie: ");
						double su=tastiera.nextDouble();
						System.out.println("Digita l'indirizzo: ");
						tastiera.nextLine();
						String ind=tastiera.nextLine();
						System.out.println("Digita la città: ");
						String ci=tastiera.nextLine();
						System.out.println("Risultato inserimento: "+Im1.inserisciImmobile(new Abitazione(stanz,su,ind,ci)));
						break;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Errore");
						tastiera.nextLine();
						break;
					}
					default:
						System.out.println("Scelta errata!");
						break;
				}
				break;
			case 2:
				System.out.println(Im1.infoImmobili());
				break;
			case 3:
				System.out.println(Im1.trovaVilla());
				break;
			case 4:
				System.out.println(Im1.trovaAppartamento());
				break;
			case 5:
				System.out.println(Im1.trovaAbitazione());
				break;
			case 6:
				System.out.println("Arrivederci e grazie per aver scelto la SceltaAirNational Line");
				break;
			default:
				System.out.println("Errore! Scelta non valida!");
				break;
			}
		}
		tastiera.close();
	}
}