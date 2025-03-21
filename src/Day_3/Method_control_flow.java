package Day_3;

public class Method_control_flow {

	public static void main(String[] args) {
		System.out.println("Main Start");
		m1();
		System.out.println("Main End");

	}
	
	public static void m1() {
		System.out.println("M1 Start");
		m2();
		System.out.println("M1 End");

	}

	public static void m2() {
		System.out.println("M2 Start");
		m3();
		System.out.println("M2 End");

	}
	
	public static void m3() {
		System.out.println("M3 Start");
		System.out.println("M3 End");

	}
}
