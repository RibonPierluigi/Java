public class Test {
	public static void main(String[] args)
	{
		Persona P1 = new Persona (25,"Mario De Angelis","M","Pilota");
		Persona P2 = new Persona (27,"Franco Proietti","M","Disoccupato");
		Persona P3 = new Persona (26,"Spartaco Proietti","M","Grossista");
		System.out.print(P1.chiSei());
		System.out.print(P2.chiSei());
		System.out.print(P3.chiSei());
	}

}
