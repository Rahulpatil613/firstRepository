package Practice;

public class Test1 {
	
	
	
	public static void main(String[] args) {
		System.out.println("main");
		
		int[] a =  {1,2,3,};
		
		int l= a.length;
		
		int x = sumofarray(a);
		int y = averageofarray(x,l);
		
		System.out.println("sum of array is = "+x  +" " + "average of array="+y);
		//System.out.println("average of array is = "+y);
		
	}	
		
	static int  sumofarray(int a []){
		int sum= 0;
		
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			
				
		}
			
			
		return sum;
		
	}
		
	

	
	
 static int	averageofarray(int x, int l)
{
	
	int avg;
	 avg = x/l;
	return avg;
}	 

}






