public class Test
{
	public static double[] soluzioneEquazione (int a, int b, int c)
	{
		//try
		//{
			double x[];
			x = new double [2];
			x[0]=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			x[1]=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			return x;
		//}
		//finally
		//catch (ArithmetichException a)
		//{
		//	System.out.println("Error 404");
		//}
	}
	public static void main(String[] args)
	{	
		double ris[] = Test.soluzioneEquazione(0,0,0);
		System.out.println(ris[0]+" "+ris[1]);
	}
}
