package dev;

public class SwitchS {

	public static void main(String[] args) {
	
		student("jak");
	}
	
	public static void student(String s){
		switch (s) {
		case "jack":
			System.out.println("hi");
			break;
		case "mike":
			System.out.println("bye");
			break;
		case "jan" :
			System.out.println("hello there");
			break;
		default:
			System.out.println("not found");
		}
}
	
}
