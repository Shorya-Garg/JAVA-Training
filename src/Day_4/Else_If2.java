package Day_4;
import java.util.Scanner;
public class Else_If2 {
	
	public static int m1(int a, int b) {
		if(a==0 || b==0) {
			return 3;
		}
		else if (a%b==0) {
			return 2;
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		int ans = m1(num1,num2);
		System.out.println(ans);
	}

}
