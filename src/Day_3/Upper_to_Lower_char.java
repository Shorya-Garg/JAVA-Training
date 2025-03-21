package Day_3;

public class Upper_to_Lower_char {
	public static void main(String[] args) {
		toLowerCase('f');
	}

	public static void toLowerCase(char ch) {
		System.out.println(ch>='a' && ch<='z'? ch:(char)(ch+32));
		
	}
}
