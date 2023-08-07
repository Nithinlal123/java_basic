package New;

public class practies

{
	public static void main(String[] args)
	
	{
		practies v= new practies ();
	String a=	v.ab();
	System.out.println(a);
	char b=v.ba();
		System.out.println(b);
	int s=	v.cd();
	System.out.println(s);
	v.dc();
	v.eg();
	}

	String ab () 
	
	{
		String a= "nithin";
		return a;
	}
	char ba () 
	{
		
		char a='C';
		return a;
		
	}
	int cd() 
	{
		int a=45;
		int b=5;
		return a/b;
	}
	void dc ()
{
		int a=47;
		int b=54;
		System.out.println(a+b);
		}
	void eg ()
	{
		String a="Quest";
		System.out.println(a);
		
		
	}
	}
