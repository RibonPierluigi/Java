public class Test
{
	public static void main(String[] args)
	{
		Stack st1 = new Stack (1);
		System.out.println("Risultato: ");
		System.out.println(+st1.pop());
		st1.push(7);
		st1.push(7);
		System.out.println("Risultato: \n"+st1.pop());
	}
}
