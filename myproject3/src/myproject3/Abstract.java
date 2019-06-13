package myproject3;
abstract class book{
String title;
abstract void settitle(String s);
String gettitle() {
return title;
}
}
class label extends book
{
public	void settitle(String s) {
	title=s;
	
	}
}
public class Abstract
{
	public static void main(String[ ] arg) {
		String s="A tale of two cities";
		book l=new label();
		l.settitle(s);
	System.out.println(l.gettitle());
	}
}