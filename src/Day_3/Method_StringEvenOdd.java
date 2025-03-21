package Day_3;

public class Method_StringEvenOdd {

	public static void main(String[] args) {
		String ans = m1(7);
		System.out.println(ans);
	}
	
	public static String m1(int num) {
		String ans = num%2==0?"Even":"Odd";
		return ans;
	}
}
