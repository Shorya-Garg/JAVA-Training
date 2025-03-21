package Day_2;

public class Swap_without_tempVariable {

	public static void main(String[] args) {
		int a=13;
		int b=24;
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
