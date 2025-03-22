package Day_4;

import java.util.Scanner;

public class Input_From_File {

	public static void main(String[] args) {
		Scanner sc = new Scanner("45:11:12");
		sc.useDelimiter(":");
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
	}

}
