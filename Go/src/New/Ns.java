package New;

public class Ns 

{
	public static void main(String[] args) 
	
	{
		Ns b=new Ns();
		b.ab();
        int a=	b.bd();
        System.out.println(a);
        b.mm();
        b.km();
		
	}
	void ab() 
	
	{
		String a="Technopark";
		System.out.println(a.charAt(5));
		System.out.println(a.length());
	}

	int bd() 
	
	{
		int a=55;
		int b=45;
		return a+b;
		
		
	}
	void mm() 
	{
		String a= "   Thiruvanathapuram";
		String a1= "   Thiruvanathapuram     ";
		System.out.println(a);
		char b ='W';
		System.out.println(b);
		int c=54;
		int d=66;
		System.out.println(c+d);
		int aa=59;
		int bb=66;
		System.out.println(aa+bb);
		int cc=22;
		int dd=11;
		System.out.println(cc-dd);
		int f=85;
		int g=45;
		System.out.println(f*g);	
		System.out.println(a1.trim());
		System.out.println(a1.concat(a1));
		System.out.println(a1.split(a));
	}
	void km() 
	{
		int a=89;
		int b=45;
		System.out.println(89*45);
	}
	
}

