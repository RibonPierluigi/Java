public class Stack
{
	private int mem[];
	private int p,n;
	public Stack (int N)
	{
		mem = new int [N];
		p=0;
		n=0;
	}
	public void push (int x)
	{
		try
		{
		mem[p]=x;
		p++;
		n++;
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("The Array is full");
		}
	}
	public int pop()
	{
		try
		{
		int x;
		x=mem[p-1];
		p--;
		n--;
		return x;
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("The array is empty");
			return 666;
		}
	}
	public int size()
	{
		return n;
	}
}
