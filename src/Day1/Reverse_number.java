package Day1;

public class Reverse_number {

	public static void main(String[] args) {
		int x=321;
		
		int a=x%10;
		x=x/10;
		
		int b=x%10;
		x=x/10;
        
		int res = a*100 + b*10 + x;
        
		System.out.println(res);

	}

}
