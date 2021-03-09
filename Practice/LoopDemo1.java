package Practice;

public class LoopDemo1 {
	
	static int[] roll= {11,12,13,14,15};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*final int a =10;
		final int b =20;*/
		/*for(int i =0;a>b;i++)
		{
			System.out.println("Inside the loop");//Unreachable Code error when var kept final a=10 and b=20 means condition False always
		}
		System.out.println("Outside the Loop"); //Unreachable Code error when var kept final a=10 and b=20 means condition True Always
		for(int i =0;false;i++)
		{
			System.out.println("Inside the loop");//Unreachable Code error when condition False always
		}
		System.out.println("Outside the Loop"); //Unreachable Code error when condition True Always
		
		*/
		
		System.err.println("Showing Error in Java");// Need to show Error in java in RED COLOR
		
		for(int x:roll)//For Each Loops
		{
			System.out.println(x);
		}

	}

}
