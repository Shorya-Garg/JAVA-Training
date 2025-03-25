package Day_6;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		int ans = max_OddIndex(arr,size);
		System.out.println(ans);
	}
	
	public static int max_OddIndex(int [] arr, int s) {
		int max = arr[0];
		for (int i=1; i<s; i+=2) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
