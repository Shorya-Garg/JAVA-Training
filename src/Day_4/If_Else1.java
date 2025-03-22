package Day_4;
import java.util.Scanner;
public class If_Else1 {

	public static void m1(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Vowel");
		}
		
		else {
			System.out.println("Consonant");
		}
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		char ch= ip.next().charAt(0);
		m1(ch);
	}

}
