package Day10;


public class GrossSlary {
public static void main(String[] args) {
	Employee n=new Employee();
	n.Gross(30000);
}

}
 
class Employee {
	
	public void Gross(int sal) {
		int gs;
		gs=sal*50/100;
		System.out.println("Gross Salary of Employee="+gs);
	}
}



