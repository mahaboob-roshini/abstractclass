package myproject3;
class  Critter {
 public void display() {
String a="yellow";
System.out.println("color is"  +a);
System.out.println("behaviour is  it feeds nector from insects" );
System.out.println("properties are");
System.out.println("lifecycle are");
System.out.println("first stage is egg");
System.out.println("second stage is catepillarlarva");
System.out.println("forth stage is adult");
 }

}
class fly extends  Critter
{
	public void display1() {
		System.out.println("the butterfly is beautiful");
		System.out.println("it is fly in air");
		System.out.println("it have different col");
		System.out.println("it have colorful wings");
	}
}

class Butterfly
{
	public static void main(String[ ]args) {
		fly f1=new fly();
		f1.display();
		f1.display1();
	}
}