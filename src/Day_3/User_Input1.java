package Day_3;
import java.util.Scanner; //import scanner class
public class User_Input1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in); // create object of Scanner calss (ip)
		
		System.out.print("Enter an integer input : ");
		int inp= ip.nextInt();
		System.out.println(inp);
		
		System.out.print("Enter an boolean input : ");
		boolean inp1= ip.nextBoolean();
		System.out.println(inp1);
		
		System.out.print("Enter an Double input : ");
		double inp2= ip.nextDouble();
		System.out.println(inp2);
		
		ip.nextLine(); //to remove carrage.
		System.out.print("Enter an String input : ");
		String inp3= ip.nextLine();
		System.out.println(inp3);
		
		
	}

}
