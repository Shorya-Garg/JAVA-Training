package Day_8;

public class employee {

	String name;
	String dept;
	String city;
	int salary;
	int age;
	
	public employee(String name , int salary) {
		this.name=name;
		this.salary= salary;
	}
	
	employee(String name, int salary, String city){
		this(name,salary);
		this.city=city;
	}
	
	void get() {
		if(name!=null) 
			System.out.println("Name      : "+name);
		if(dept!=null) 
			System.out.println("Department: "+dept);
		if(city!=null) 
			System.out.println("City      : "+city);
		if(salary!=0) 
			System.out.println("Salary    : "+salary);
		if(age!=0) 
			System.out.println("Salary    : "+age);
			
		}
	}
	
	

