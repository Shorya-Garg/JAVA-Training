package Day_4;
import java.util.Scanner;
public class If_Else2 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		int num3 = ip.nextInt();
		
		if(num1%2==0 && num2%2==0 && num3%2==0) {
			System.out.println(num1*num2*num3);
			return;
		}
		
			if(num1%2==0 && num2%2==0) {
				System.out.println(num1+num2); 
				return;
			}
			if(num2%2==0 && num3%2==0) {
				System.out.println(num2+num3);
				return;
			}
			if(num1%2==0 && num3%2==0) {
				System.out.println(num1+num3);
				return;
			}
				if(num1%2==0) {
					System.out.println(num1);
					return;}
				if(num2%2==0) {
					System.out.println(num2);
					return;}
				if(num3%2==0) {
					System.out.println(num3);
					return;}
				
				if(num1%2!=0&&num2%2!=0&&num3%2!=0)
					System.out.println(0);
	}

}
