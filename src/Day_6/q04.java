package Day_6;
import java.util.Scanner;
public class q04 {
	
	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sr.nextInt();
		System.out.println("Enter elements of array");
		int []arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sr.nextInt();
		}
		
		int res = second_max(arr);
		System.out.println(res);
	}

	public static int second_max(int [] arr) {
		int max =Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max2=max;
				max= arr[i];
			}
			
			else if(max>arr[i] && max2<arr[i]) {
				max2=arr[i];
			}
		}
		return max2;
	}
}
