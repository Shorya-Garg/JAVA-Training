package Day_4;

public class Enhanced_Switch {
	public static void main(String[] args) {
		int num=2;
		String str = switch (num) {
		case 1 -> "odd";
		case 2 -> {
			System.out.println("Hii");
			yield "even"; // yield is used when the case statement is of multiple line.
		}
		default -> "default";
		};
		System.out.println(str);
	}

}
