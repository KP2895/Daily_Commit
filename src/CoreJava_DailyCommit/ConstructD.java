package CoreJava_DailyCommit;

public class ConstructD {

	//type of method which do not have any return type
	//Use of constructor is to intialise the object
	//types=>1.Paramentrised 2.Non-paramerised /no arg constructor
	//constructor can have access modifier =>public ,private
	//constrctor can not be static, final 3
	
	
	//1.No arg constructor =>
	
	
	String f1;
	int a;
	
	private ConstructD (){
		 a=20;
		f1="JP morgan";
		System.out.println("Inside nonparametrised constructor");
		System.out.println(a+" "+f1);
	}
	
	private ConstructD (int a, String f1){
		 this.a=a;
		this.f1=f1;
		System.out.println("Inside parametrised constructor");
		System.out.println(a+" "+f1);
	}
	
	public static void main(String[] args) {
		//constructor overloading
		
		ConstructD npc=new ConstructD();
		
		ConstructD ppc=new ConstructD(10,"HSBC");

	}

}
