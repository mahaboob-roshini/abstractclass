package myproject3;
interface  Advancedar {
	
		 abstract int divisior_sum(int n);
}
class mycaculator implements Advancedar
{
	int r,sum=0;
	 public int divisior_sum(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			sum=sum+i;
			System.out.println(i+ "is");
	
		}
	}return sum;
}
}
public class Interfaceex
{
	public static void main(String[ ] arg) {
		mycaculator c=new mycaculator();
		int sum=c.divisior_sum(6);
		System.out.println("sum is"+sum);
	}
}