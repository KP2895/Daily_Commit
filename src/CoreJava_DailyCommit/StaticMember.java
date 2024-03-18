package CoreJava_DailyCommit;

public class   StaticMember {

	
	//Static member =>variables ,methods, blocks also inner class(Nested class)
	
	
	static int a=20;
	static String str="Naresh";
	  int c=10;
	 
	static void show() {
		
		 int c=30;
		System.out.println(c);
		System.out.println("Inside static method");
	}
	
	
	static {
		
		System.out.println("Inside static block");
	}
	
		
	
	public static void main(String[] args) {
		//data mebr accesing =>
		System.out.println(a);
		System.out.println(str);
		
		System.out.println(StaticMember.a);
		System.out.println(StaticMember.str);
		
		show();
		StaticMember.show();
		//System.out.println(c);
		
		//static mbr load =>variables, methods ,block => static
		//static block execute  => stack area
		//main method start exection =>
	
		
		
	}

}
