package Practice;

public class Employee {
	
		int E_id;
		String E_name;
		String E_add;
		int E_sal;
		int E_mo;
		
		
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("in main");
		 
		Employee e1=new Employee(10,"abc","pune1",12345,567890);
		Employee e2=new Employee(20,"pqr","pune2",1234,56789);
		Employee e3=new Employee(30,"xyz","pune3",123,5678);
		Employee e4=new Employee(40,"lmn","pune4",12,567);
		Employee e5=new Employee(50,"jkl","pune5",1,56);
		System.out.println(e1.E_name+ ""+e5.E_add);
		
	}





	public Employee(int e_id, String e_name, String e_add, int e_sal, int e_mo) {
		super();
		E_id = e_id;
		E_name = e_name;
		E_add = e_add;
		E_sal = e_sal;
		E_mo = e_mo;
		
	}

	
}
