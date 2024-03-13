package CoreJava_DailyCommit;

public class Variables {

	//Variable =>block of memory to store value
	//literals =>Value which we assign to variables
	
	int a=10; //global valriables
	static int b=20;
	
	
	static void show() {
		
		String s1="Kiran"; //local varibale
		System.out.println("Inside static method");
		System.out.println(s1);
		
	}
	void declare() {
		
		
		String str="NewString";
		System.out.println("Local variable:" +str);  //local varibales
	}
	public static void main(String[] args) {
		
		System.out.println("In Main method");
		
		Variables v1=new Variables();
		v1.declare();
		show();
		System.out.println("calling static variable:" +b);
		System.out.println("calling static varibale:"+Variables.b);
		
		System.out.println("calling instance variable :"+v1.a);
		

	}

}
