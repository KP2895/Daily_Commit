package Assignment_DailyCommit;

import java.util.ArrayList;

public class ShortingStringArray {

	public static void main(String[] args) {
	
		//names starts with letter K & count
		
		ArrayList <String> ls= new ArrayList();
		ls.add(0, "Kiran");
		ls.add(1, "Karan");
		ls.add(2, "Ashwin");
		ls.add(3, "Akash");
		ls.add(4, "Asha");
		
		
		int count=0;
		for (int i=0;i<ls.size();i++) {
			
			if (ls.get(i).startsWith("A")) {
				
				System.out.println(ls.get(i));
				count++;
			}
			
		}
		
		System.out.println("count with letter A: " +count);
		
		
		
		
		
	}

}
