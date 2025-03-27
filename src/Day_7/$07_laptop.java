package Day_7;

public class $07_laptop {

	String name;
	String pro;
	String gpu;
	int price;
	
	$07_laptop(String name, String pro, String gpu, int price){
		this.name=name;
		this.pro=pro;
		this.gpu=gpu;
		this.price=price;
	}
	
    $07_laptop(String name, String pro, String gpu){
    	this.name=name;
		this.pro=pro;
		this.gpu=gpu;
	   }
    
    $07_laptop(String name, String pro){
    	this.name=name;
		this.pro=pro;
    }
    
    $07_laptop(String name){
    	this.name=name;
    }
    $07_laptop(){
    	System.out.println("Hiiiiiiiiiii");
    }
    
    void getData() {  //method to print data of an object.
    	if(this.name!=null)
    	System.out.println("Name     : "+this.name);
    	if(this.pro!=null)
    	System.out.println("Processor: "+this.pro);
    	if(this.gpu!=null)
    	System.out.println("Graphic  : "+this.gpu);
    	if(this.price!=0)
    	System.out.println("Price    : "+this.price);
    }
 	   
}
