package Day_6;
import java.util.Scanner;
import java.util.Arrays;
public class q01 {

	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int Size = sr.nextInt();
		System.out.println("Enter elements of Array");
		int []arr = new int [Size];
		for(int i=0; i<Size; i++) {
			arr[i]= sr.nextInt();
		}
		int res = add(arr,Size);
		System.out.println(res);
	}
	
	public static int add(int[] arr , int s) {
		int sum=0;
		for(int a : arr) {
			sum+=a;
		}
		return sum;
	}
}
