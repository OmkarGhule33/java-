package Javalb;
import java.util.*;
class area{
	static double cal(int a,int b) {
		return (a*b)/2;
	}
	static double cal1(int a,int b) {
		return a*b;
	}
}
public class overloading {

	public static void main(String[] args) {
		System.out.println("enter base and height resp");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println(area.cal(a,b));

	}

}
