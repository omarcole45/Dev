package dev;

public class TryCatchUsage {
	
	//one try can be followed by multiple catch blocks
		//catch should be followed by try block.
	//finally will execute wheter the script pass or fail. finally block will still be executed 
	
	private static String blueEyes;
	String greenEyes;
	
	public void legs() {
		System.out.println("This is the leg");
	}
	public void arms() {
		System.out.println("this is arms");
	}
	
	public void eyes() {
		System.out.println("this is the eyes");
//		blueEyes.equals("ram");
//		greenEyes.equals("low");
		
		try {
			System.out.println("this is try block");
		}
		catch (Exception e) {
			System.out.println("Unavailble at this time");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
