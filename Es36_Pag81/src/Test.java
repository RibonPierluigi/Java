public class Test
{
	public static void main(String[] args)
	{
		CD Cd1 = new CD("Hydrogen","No",25,360);
		CD Cd2 = new CD("Avenger","Marvel",10,70);
		CD Cd3 = new CD("November","Booh",30,200);
		CD Cd4 = new CD("Spooky Skeleton","SpookTober",1,30);
		PortaCd Pr1 = new PortaCd (10);
		PortaCd Pr2 = new PortaCd (10);
		System.out.println("Programma inserito: "+Pr1.setCD(Cd1,1));
		System.out.println("Programma inserito: "+Pr1.setCD(Cd2,2));
		System.out.println("Programma inserito: "+Pr1.setCD(Cd3,3));
		System.out.println("Esito eliminazione: "+Pr1.killCD(9));
		System.out.println("Programma inserito: "+Pr1.setCD(Cd4,4));
		System.out.println("Programma inserito: "+Pr2.setCD(Cd4,1));
		System.out.println("Programma inserito: "+Pr2.setCD(Cd3,2));
		System.out.println("Numero CD presenti: "+Pr1.getN());
		System.out.println("Programmi in comune: "+Pr1.confrontaCollezione(Pr2));
		System.out.println(Pr1.toString());
	}
}