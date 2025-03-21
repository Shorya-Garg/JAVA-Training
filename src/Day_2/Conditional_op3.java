package Day_2;

public class Conditional_op3 {

	public static void main(String[] args) {
		char ch='a';
		String ans = ch>=65 && ch<=90? "Upper Case": "Lower Case";
		System.out.println(ans);
		
		String ans2 = ch-65<26?"Upper Case": "Lower Case";
		System.out.println(ans2);
	}

}
