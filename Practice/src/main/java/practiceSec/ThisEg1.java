package practiceSec;

public class ThisEg1
{	
	public void display(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		
	}
	public void display()
	{
		System.out.println("Method Overloading");
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThisEg1 obj=new ThisEg1();
				obj.display();
	}

}
