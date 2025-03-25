package Day_6;

import java.util.Scanner;

public class $1_array_DynamicInput {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int size = sr.nextInt();
		int []arr= new int[size];
		for(int i = 0; i<size; i++) {
			arr[i]= sr.nextInt();
		}
	}

}
