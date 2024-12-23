package Day10;

public class Person {
public static void main(String[] args) {
	Student s=new Student();
	s.Info("Aray", 20);
	s.Marks(90, 30, 20);
}
}
class Student{
	public void Info(String name,int age) {
		System.out.println("Name="+name +"Age="+age);
	}
	public void Marks(int s1,int s2,int s3) {
		int avg;
		avg=s1+s2+s3/3;
		System.out.println("The Avarage of Student="+avg);
	}
}