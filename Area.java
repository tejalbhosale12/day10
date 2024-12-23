package Day10;

public class Area {
public static void main(String[] args) {
	Circle c=new Circle();
	c.area(60);
	Triangle t= new Triangle();
	t.Area(70, 80);
	Reactangle r=new Reactangle();
	r.Area(90, 120);
	
}
}
class Circle{
	public void area(int r) {
		double pi=3.14;
		int ar= (int) (pi*r*r);
		System.out.println("Area of Circle="+ar);
	}
}
class Triangle{
	public void Area(int l,int b) {
		double pi=0.5;
		int cal=(int)(pi*l*b);
		System.out.println("Area of Triangle="+cal);
	}
}
class Reactangle{
	public void Area(int l,int b) {
		int area=l*b;
		System.out.println("Area of Rectangle="+area);
	}
}