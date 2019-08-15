package dev;

public class ConstructorDemoToString {
int numb;
	public static void main(String[] args) {
		//ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemoToString cd = new ConstructorDemoToString(3, 9);
		System.out.println(cd);

	}
	
	public ConstructorDemoToString(int a, int b){
		numb = a + b + 2;
		//System.out.println(numb);

		}
	public ConstructorDemoToString() {
		System.out.println("Constructor without parameters");
	}
	public String toString() {//Java automatically invokes the toString method of the constructor. Turning any object to a string.
		return "Number " + this.numb;//This just points to the global object of the class and returns its new value.
	}

}
