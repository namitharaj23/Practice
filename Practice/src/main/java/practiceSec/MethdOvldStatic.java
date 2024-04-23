package practiceSec;

public class MethdOvldStatic 
{
	public static void name(int x,int y)
	{
		
		int z=x+y;
		System.out.println("Sum :  "+z);
	}
	public static void name(float a,float b)
	{
		
		float c=a*b;
		System.out.println("Mul  :  "+c);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethdOvldStatic.name(10,5);
		MethdOvldStatic.name(20.5f,10);
		
	}

}
