package Practice;

public class Arraycopy {
	
	
	public static void main(String[] args) {
		System.out.println("in main");
		
		int[] source = {1,2,3,4,5};
		int[] destination=new int [source.length];
		for(int i=0;i<source.length;i++)
		
		{
			destination[i]=source[i];
			
			
		}
		

		for(int i=0;i<destination.length;i++)
			
		{
System.out.println(destination[i]);			
			
		}
	}

	

}
