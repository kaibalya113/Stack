
class Nodes{
	char data;
	Nodes next;
}
class Stacks{
	Nodes front;
	Nodes insert(char data) {
		Nodes node = new Nodes();
		node.data = data;
		node.next =null;
		return node;
	}
	void push(char data) {
		if(front == null) {
			front = insert(data);
			return;
		}
		Nodes d = insert(data);
		d.next = front;
		front = d;
	}
	void show() {
		Nodes node = front;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
public class StackString {
	public static void main(String[] args) {
		Stacks ss = new Stacks();
		String text = "My name is kaibalya";
		for(int i = 0; i< text.length(); i++) {
			char data = text.charAt(i);
			ss.push(data);
		}
		ss.show();
	}
}
