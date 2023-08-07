package New;

public class F1

{
	public static void main(String[] args)
	
	{
		F1 b=new F1();
		b.a1();
		
    int c=  b.ab();
    System.out.println(c);
    b.a1();
    b.cc();
	}

	
	void a1() 
	
	{
	String a="mangalapuram Attingal";
	System.out.println(a.charAt(4));
	System.out.println(a.charAt(6));
	System.out.println(a.length());
	}
	
	int ab()
			
			{
		
		int a=54;
		int b=67;
		return a+b;
	}
	void cc() 
	{
		int a=85;
		int b=65;
		System.out.println(a+b);
	}
}
