package Day_2;

public class Conditional_Op {

	public static void main(String[] args) {
		int num = 59;
		String ans = num>=20 && num<=80? "Given number is in range.":"Given number is out of range.";
		System.out.println(ans);
		
		String ans2 = num>=20?num<=80?"Given number is in range.":"Given number is out of range.":"Given number is out of range.";;
		System.out.println(ans2);
	}

}
