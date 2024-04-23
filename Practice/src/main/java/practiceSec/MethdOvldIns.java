package practiceSec;

public class MethdOvldIns 
{
	public void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	public void add(float a,int b)
	{
		float c=a*b;
		System.out.println("value is "+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethdOvldIns obj=new MethdOvldIns();
		obj.add(10,5);
		obj.add(10.5f,5);
	}

}
