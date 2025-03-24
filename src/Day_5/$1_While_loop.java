package Day_5;

public class $1_While_loop {

	public static void main(String[] args) {
		int num = 5430;
		int ans = 0;
		
		while (num>0) {
			ans= ans*10 + num%10;
			num/=10;
		}
		System.out.println(ans);
	}

}
