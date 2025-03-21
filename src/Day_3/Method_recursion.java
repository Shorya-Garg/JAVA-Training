package Day_3;

public class Method_recursion {
	
	static int num = 0;
	public static void main(String[] args) {
		System.out.println("Main Start");
		m1();
		System.out.println("Main end");
	}

	public static void m1() {
		num++;
		m2();
	}
	
	public static void m2() {
		System.out.println(num);
		m1();
	}
}
