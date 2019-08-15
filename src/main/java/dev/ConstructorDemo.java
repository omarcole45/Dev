package dev;

public class ConstructorDemo {

	public static void main(String[] args) {
		//ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd = new ConstructorDemo(3, 9);

	}
	
	public ConstructorDemo(int a, int b){
		int numb = a + b + 2;
		System.out.println(numb);

		}
	public ConstructorDemo() {
		System.out.println("Constructor without parameters");
	}

}
