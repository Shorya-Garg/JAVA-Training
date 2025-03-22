package Day_4;

import java.util.Scanner;

public class Else_If_Ladder {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		int num3 = ip.nextInt();
		
		if(num1%2==0 && num2%2==0 && num3%2==0) {
			System.out.println(num1*num2*num3);
			
		}
		
		else if(num1%2==0 && num2%2==0) {
				System.out.println(num1+num2); 
				
			}
		else if(num2%2==0 && num3%2==0) {
				System.out.println(num2+num3);
				
			}
			else if(num1%2==0 && num3%2==0) {
				System.out.println(num1+num3);
				
			}
			else if(num1%2==0) {
					System.out.println(num1);
					}
			else if(num2%2==0) {
					System.out.println(num2);
					}
			else if(num3%2==0) {
					System.out.println(num3);
					}
				
			else
					System.out.println(0);

	}

}
