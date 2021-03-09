package Practice;

public class Villege 
{	
	
	//String[] name= {"vishal ","kiran","sushil","rohit","sandip"} ;
	static String[] val = {"I","dont","want","to","go","for","School"};
	static String con="";
	/*void display() 
	{		
		for( int i=0;i<name.length;i++) 
		{
			System.out.println("name of student is = "+name[i]);
		}		
	}*/
		
	public static void main(String[] args) 
	{
		Villege v1= new Villege();
		//v1.display();*/
		/*for( int i=0;i<v1.name.length;i++) 
		{
			System.out.println("Using For Loop name is = "+v1.name[i]);
		}	
		int j=0;
		do {
			System.out.println("Using Do While Loop name is: "+v1.name[j]);
			j++;
		}while(j<v1.name.length);
		int k=0;
		while(k<v1.name.length)
		{
			System.out.println("Using while Loop Name is :"+v1.name[j]);
			k++;
		}*/
		
		for(int l=0;l<v1.val.length;l++) 
		{
			//v1.con =v1.val[l]+v1.val[l+1];
			con=con+v1.val[l];
										
		}System.out.print("Contact of String :"+con);
	}
}
