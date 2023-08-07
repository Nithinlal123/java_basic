package New;

public class Db 

{
	public static void main(String[] args)
	
	{
		Db a=new Db();
		a.a1();
		a.a2();
	int v=	a.b1();
	System.out.println(v);
	a.a2();
	a.a3();
	a.a4();
	a.a5();
		
	}
	
	void a1() 
	
	{
		int a= 75;
		int b=65;
		System.out.println(a+b);
	}
	
	void a2() 
	{
		String a="nithin lal";
		System.out.println(a);
		
	}
	void a3() 
	{
		char a='C';
		System.out.println(a);
	}
	void a4() 
	{
		boolean a=true;
		System.out.println(a);
	}
	void a5() 
	{
		String a="UnitedstatesofAmerica";
		System.out.println(a.charAt(6));
		System.out.println(a.length());
		
	}
	int b1() 
	
	{
		int a=55;
		int b=96;
		return a+b;
	}

}
