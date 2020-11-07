
/*
	IMPLEMENTING QUEUE USING LINKED LIST
*/

class Queue{

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
	Node last;
	Node ptr;

	void enQueue(int data){
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

	void deQueue(){
		if(head == last){
			head = null;
			last = null;
			System.gc();
			System.out.print("Dequeue");
		}
		else{
			head = head.next;
			head.back = null;
		}
	}

	void isEmpty(){
		if(head == null){
			System.out.println("Queue Empty");
		}
		else{
			System.out.println("Queue not Empty");
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

public class QueueUsingLinkedList{

	public static void main(String[] args) {
		Queue fifo = new Queue();

		fifo.isEmpty();

		fifo.enQueue(1);
		fifo.enQueue(2);
		fifo.enQueue(3);
		fifo.display();

		System.out.println();

		fifo.isEmpty();

		fifo.deQueue();
		fifo.deQueue();
		fifo.deQueue();
		fifo.display();

		System.out.println();

		fifo.isEmpty();

		fifo.enQueue(99);
		fifo.display();



	}
}
