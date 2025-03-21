package Day_2;

public class Logical_AND_logic {

	public static void main(String[] args) {
		int x=10 , y= 20 ,a=5 ,b=15 ;
        boolean ans = ++x < 0 && y<x;
        System.out.println(x);// x=11
        
        boolean ans2 = b<a && ++a>0;
        System.out.println(a);// a=5 , a will not update because in Logical AND if firstcondition is false it does not run/check the second condition.
	}

}
