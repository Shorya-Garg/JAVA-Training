package Day_6;
import java.util.Scanner;
public class q25 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		for(int i=size-1; i>=0 ; i-=2)
		{
			if(i%2!=0)
				i--;
					
			System.out.println(arr[i]);
		}
	}

}
