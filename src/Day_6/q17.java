package Day_6;
import java.util.Scanner;
public class q17 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		double ans = max_FirstHalf(arr,size);
		System.out.println(ans);
	}
	
	public static double max_FirstHalf(int [] arr, int s) {
		int max = arr[0];
		for (int i=0; i<s/2; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			}
		return max;
	}

}
