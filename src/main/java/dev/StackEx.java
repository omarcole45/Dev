package dev;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		//final Stack stack; // This is a just variable is declared but not initialized.
		
		Stack stack = new Stack();//This is initializing a variable because its actually assigned a value
		
		stack.push("john");
		stack.push("jacky");
		stack.push("mary");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println("peek of stack is: " + stack.peek());
		
		System.out.println("size of stack is: " + stack.size());

	}
		
	}


