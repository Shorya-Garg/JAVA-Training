package Day_5;
import java.util.Scanner;
public class $7_for_loop {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int LL = sr.nextInt();
		int UL = sr.nextInt();
		for(int i=LL;i<=UL;i++) {
			IsPrime(i);
		}
	}
	
	public static void IsPrime(int num) {
		int i=1 , count=0;
		while(i<=num/2) {
			if (num % i==0) {
				count++;
			}
			i++;
		}
		if (count==1) {
			System.out.println(num);
		}
	}
}
