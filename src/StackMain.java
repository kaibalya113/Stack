
class Stack{
	// solving using array
	int stack[] = new int[5];
	int top = 0;
	public void push(int data) {
		
		stack[top] = data;
		top++;
	}
	void display() {
		for(int no : stack) {
			System.out.println(no+" ");
		}
	}
	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		
		return data;
	}
	int peek() { // it will show top value of the stack
		int data;
		data = stack[top-1];
		return data;
	}
	int getSize() { // From here we wll get size of the stack
		return top;
	}
	boolean isEmpty() {
		return top <= 0;
	}
}
public class StackMain {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("deleted value is: "+stack.pop());
		System.out.println("peek: "+stack.peek());
		System.out.println("size of the stack: "+stack.getSize());
		System.out.println("Is stack Empty: "+stack.isEmpty());
		stack.display();
	}
}
