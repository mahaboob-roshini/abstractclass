package myproject3;
 class Circle {
	public void display2() {
		double r=5;
		double a=((4*22*r*r)/7);
		System.out.println("area of circle"+a);
	}
}
class rectangle extends Circle
{
	public void area2() {
		int l=10,b=20;
		int a=l*b;
		System.out.println("area of rectangle"+a);
	}
}
class square extends rectangle
{
	public void display() {
		int h=5;
		int y=h*h;
		System.out.println("area of square"+y);
	}
}
class sphere extends square
{
	public void area1() {
		double r=5;
		double a=((4*22*r*r)/7);
		System.out.println("area of sphere"+a);
	}
}
class Areas 
{
	public static void main(String[ ]args)
	{
		sphere s1=new sphere();
		s1.area2();
		s1.display();
		s1.area1();
		s1.display2();
	}
}