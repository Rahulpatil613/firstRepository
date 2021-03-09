package Practice;

public final class Test2{
	
	
	int rno=10;
        static  Test2 t= new Test2();
	
	public static void main(String[] args)
	{
		 System.out.println("hii main");		
			t.rno=20;
	System.out.println(t.rno);
			
			t.m1();
	}
	
	
final	void m1()
	{
		System.out.println("in m1");
		System.out.println(rno);
	}
	

}