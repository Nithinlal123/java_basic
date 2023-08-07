package New;

public class Allfun 

{
	public static void main(String[] args)
	
	{
		Allfun h=new Allfun ();
	int z=	h.ab();
		System.out.println(z);
	int k=	h.bd();
	System.out.println(k);
	
             h.abc();
            h.add();	
            h.sub();
	}

	int ab() 
	{
		int a=6;
		int b=7;
		
		return a+b;
		
	}
	
	int bd()
	
	{
		int m=6;
		int n=3;
		 
		return m-n;
		
		
	}
	void add()
	
	{
	
		String a= "Nithin";
		
System.out.println(a );
	}
	void abc () 
	
	{
		int aa=8;
		int bb=6;
	System.out.println(aa+bb);
				
	}
	void sub() 
	{
		char a='G';
		System.out.println(a);
				
	}
	
}

