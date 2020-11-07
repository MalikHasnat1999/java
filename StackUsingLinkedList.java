
/*
	IMPLEMENTING STACK USING LINKED LIST
*/

class Stack{

	class Node{
		int data;
		Node next;
		Node back;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;
	Node last;
	Node ptr;

	void push(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			last = new_node;
			new_node.back = null;
		}
		else{
			new_node.back = last;
			last.next = new_node;
			last = new_node;
		}	
	}

	void pop(){
			if(last == head){
				head = null;
				last = null;
				System.gc();
				System.out.print("Popped.");
			}
			else{
				last.back.next = null;
				last = last.back;
				System.gc();
			}
		}

	/*
		There is no isFull() method in 
		Stack Using Linkded list cause 
		Linked list is Dynamic.
	*/
	void isFull(){}

	boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}

	void display(){
		ptr = head;
		while(ptr != null){
			System.out.print(ptr.data+", ");
			ptr = ptr.next;
		}
	}
}

public class StackUsingLinkedList{

	public static void main(String[] args) {
		Stack lifo = new Stack();

		if(lifo.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.println("Stack is not Empty");

		lifo.push(1);
		lifo.push(2);
		lifo.push(3);
		lifo.push(4);
		lifo.push(5);
		lifo.display();

		System.out.println();

		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.display();

		System.out.println();

		if(lifo.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.println("Stack is not Empty");


		lifo.push(4);
		lifo.display();

		System.out.println();

		if(lifo.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.println("Stack is not Empty");

	}
}