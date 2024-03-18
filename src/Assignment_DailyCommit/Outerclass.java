package Assignment_DailyCommit;

public class Outerclass {
	
	int a=10;
	static int b=20;
	void O1()
	
	{
		
		System.out.println("In outer class");
	}
	static class Inner{

		int c=20;

		void I1()
		
	{
		
		System.out.println("In inner class");
	}
	
	}

	public static void main(String[] args) {
	
		Outerclass.Inner inner=new Outerclass.Inner();
		System.out.println(inner.c);
		inner.I1();
		
		Outerclass outer=new Outerclass();
		System.out.println(outer.a);
		System.out.println(outer.b);
		outer.O1();
		
		

	}

}
