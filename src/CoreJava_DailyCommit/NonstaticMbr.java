package CoreJava_DailyCommit;

public class NonstaticMbr {

	
	//nonstatic => varibales ,methods,blocks ,constructor
	
	int a=10;
	String s="kp";
	static int c=30;  //static means common for all
	
	void show() {
	
		int c=15;
		System.out.println(c);
		System.out.println("Inside non static method");
	}
	
	
	{
		System.out.println("Inside non static block");
	}	
	
	public static void main(String[] args) {
	
		NonstaticMbr mb=new NonstaticMbr();
		System.out.println(mb.a);
		mb.show();
		
		
		//loading => non static mbr varibale,mehtod block =>load 
		//non static block execute
		
		

	}

}
