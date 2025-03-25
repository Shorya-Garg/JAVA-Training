package Day_5;
import java.util.Scanner;
public class $10_array {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sr = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]= sr.nextInt();
		}
		for(int i=0;i<5;i+=2)
		{
			System.out.println(arr[i]);
		}
	}

}
