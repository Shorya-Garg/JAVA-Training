package Day_3;

public class Type_Promotion {

	public static void main(String[] args) {
		m1(10);// pass integer

	}
	/* Type Promotion-> if method with same formal argument as of actual argument
	 * not present, it will go for method which have formal argument of higher
	 * size than datatype of actual size.*/
	public static void m1(double d) {//double have more size than int so it store int type
		System.out.println(d);
	}
	
	public static void m1(byte b) {// not run because byte have less size than int.
		System.out.println(b);
	}
	

}
