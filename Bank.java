package Day10;

public class Bank {
public static void main(String[] args) {
	Credit c=new Credit();
	c.Cr(34000);
	c.Dr(12349);
	Detils i=new Detils();
	i.Info("Ravi", 30, "Ap-Satara TAL-korgaon ");
	
}
}
class Credit extends Debit{
	public void Cr(int amount) {
		int amt=120000;
		int credit=amt+amount;
		System.out.println("Total Amount in bank="+amt);
		System.out.println("Total Credit Amount="+credit);
	}
	
}
class Debit{
	public void Dr(int val) {
		int amt=120000;
		int debit=amt-val;
		System.out.println("total Debit amount="+debit);
	}
	
}
class Detils {
	public void Info(String name,int age,String Address) {
		System.out.println("Name Of Account Holder = "+name);
		System.out.println("Age ="+ age);
		System.out.println("Address ="+Address);
	}
}