package Day_6;
import java.util.Scanner;
import java.util.Arrays;
public class q29 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		System.out.println("Enter index1");
		int ind1 = sr.nextInt();
		System.out.println("Enter index2");
		int ind2 = sr.nextInt();
		if(ind1<arr.length&&ind2<arr.length) {
		swap(ind1,ind2,arr);
		System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("Enter valid indexes");
		}
	}
	
	public static void swap(int i1, int i2, int[] arr)
	{
		int temp = arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
		
	}
	
}