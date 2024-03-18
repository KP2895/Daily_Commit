package CoreJava_DailyCommit;

public class Staticclass {

	
	
	static int a=20;
	String str="ash";
	
	int c=20;
	
	void displayouter() {
		
		int c=60;
		System.out.println(c);
		System.out.println("Inside outer class mehtod");
	}
	
	public static class inner {
		
		static String  str1="tej";
		void showinner() {
			
			System.out.println("Inside inner class method");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Staticclass.inner inclass=new Staticclass.inner();
		System.out.println(inclass.str1);
		inclass.showinner();
		
		

		
		
	}

}
