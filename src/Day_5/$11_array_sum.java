package Day_5;

import java.util.Scanner;

public class $11_array_sum {

	public static void main(String[] args) {

			int arr[] = new int[5];
			Scanner sr = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]= sr.nextInt();
			}
			int sum=0;
			for(int i=0;i<5;i++)
			{
				sum=sum+arr[i];
			}
	}

}
