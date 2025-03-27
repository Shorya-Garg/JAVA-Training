package Day_7;

public class $09_User {
	
String name;
int password;
String bio;

$09_User(String name, int password){
	this.name= name;
	this.password= password;
}

$09_User(String name, int password, String bio){
	this.name= name;
	this.password= password;
	this.bio = bio;
}

void getdata() {
	if(name!=null)
		System.out.println("Name    : "+name);
	if(password!=0)
		System.out.println("Password: "+password);
	if(bio!=null)
		System.out.println("Bio     : "+bio);
	
}

}
