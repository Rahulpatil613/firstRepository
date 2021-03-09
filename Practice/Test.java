package Practice;

public class Test {
	
	public static void main(String[] args) {
		
		Test t1= new Test();
		
	int m=	t1.m1(10);
	int l=	t1.m2(20);
		
		t1.m3(m,l);
		
	}
	 int m1(int a)
	 { 
		int  res= a+10;
		 return res;
		 
	 }
	
	int m2 (int x) {
		
	
		int res= x+20;
		return res;
	} 
	void m3(int p, int q)
	 {
		 System.out.println(p+q);
		 
	 }

}
