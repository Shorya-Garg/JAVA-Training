package Day_2;

public class Increment2 {

	public static void main(String[] args) {
		int a=30;
		int b=++a+a;
		int c=--a;
		c++;
		a=b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
