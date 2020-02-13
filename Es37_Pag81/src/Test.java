public class Test
{
	public static void main(String[] args)
	{
		Veicolo V1 = new Veicolo ("AB123CD","Fiat","Ammetano",1200,2019,7,"fsgr434gd3fsdfs4");
		Veicolo V2 = new Veicolo ("EF123GH","Opel","Astra",1600,2015,5,"fsggd5443fsdfs4");
		Veicolo V3 = new Veicolo ("IL123MN","Toyota","Aygo",1000,2009,4,"fsgr43fsdfs4");
		Veicolo V4 = new Veicolo (V1);
		Veicolo R = V2;
		System.out.println(V1);
		System.out.println(R.toString());
		System.out.println(V3.toString());
		System.out.println(V4.toString());
		V1.setPrezzoCilindrata(12);
		System.out.println("Il costo di V1 è: "+V1.calcolaCosto());
		System.out.println("Il costo di V2 è: "+V2.calcolaCosto());
		System.out.println("Il costo di V3 è: "+V3.calcolaCosto());
	}
}
