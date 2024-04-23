package practiceSec;

public class ThisEg
{
	public  void add(int a,int b)
	{
		
		
		int c=a+b;
		System.out.println(c);
	}
	public  void add()
	{
		this.add(10,5);
		System.out.println("Example");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThisEg obj=new ThisEg();
		obj.add();
				
	}

}
