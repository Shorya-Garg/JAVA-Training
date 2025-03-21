package Day_3;

public class Method_Overloading1 {
public static void main(String[] args) {
	add(2,4);
	add(5,2,9);
}

public static void add(int a, int b) {
	System.out.println(a+b);
}

public static void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
}
