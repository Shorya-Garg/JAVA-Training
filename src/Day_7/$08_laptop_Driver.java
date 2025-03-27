package Day_7;

public class $08_laptop_Driver {

	public static void main(String[] args) {
		$07_laptop obj1 = new $07_laptop("Pavallion");
		$07_laptop obj2 = new $07_laptop("Pavallion","intel");
		$07_laptop obj3 = new $07_laptop("Pavallion","Ryzen","Ryzen AMD");
		$07_laptop obj4 = new $07_laptop("Pavallion","Ryzen","Ryzen AMD",55000);
		$07_laptop obj5 = new $07_laptop();
		
		
//		System.out.println(obj5.name);
		obj5.getData();
//		System.out.println(obj2);
//		System.out.println(obj3);
//		System.out.println(obj4);
	}
}
