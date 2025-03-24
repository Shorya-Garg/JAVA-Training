package Day_5;

public class $2_While_loop {

	public static void main(String[] args) {
		int num1 =123;// op - 162534
		int num2 = 456;
		int ans=0;
		int ans2=0;
		while (num1>0) {
			ans = ans*10+num1%10;
			num1 /=10;
		}
		while(num2>0) {
			ans2 = ans2*10 + ans%10;
			ans/=10;
			ans2 = ans2*10 + num2%10;
			num2 /=10;
		}
		System.out.println(ans2);
	}

}
