class Node{
	int data;
	Node next;
}

class StackLinked{
	Node front;
	public Node insert(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
		
	}
	void push(int data) {
		if(front == null) {
			front = insert(data);
			return;
		}else {
			Node n = insert(data);
			n.next = front;
			front = n;
			
		}
	}
	int getSize() {
		Node node = front;
		int size = 0;
		while(node.next!= null) {
			node = node.next;
			size+=1;
		}
		return size;
		
	}
	void show() {
		Node node = front;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	int pop() {
		if(front == null) {
			System.out.println("stack is empty");
			return 0;
		}
		int data = front.data;
		front = front.next;
		return data;
	}
	// get the top elemet
	int top() {
		if(front == null) {
			System.out.println("stack is empty");
			return 0;
		}
		return front.data;
		
	}
	
}

public class StackLinkedList {
	public static void main(String[] args) {
		// Implement stack using linkedlist
		StackLinked stackLL = new StackLinked();
		stackLL.push(1);
		stackLL.push(2);
		stackLL.push(3);
		stackLL.push(4);
		stackLL.push(5);
		System.out.println("Data deleted: "+stackLL.pop());
		System.out.println("Top: "+stackLL.top());
		stackLL.show();
		System.out.println("Stack siZE: "+stackLL.getSize());
	}

}
