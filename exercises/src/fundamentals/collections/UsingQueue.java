package fundamentals.collections;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		//Offer and Add -> Add elements in the list
		//The difference is the behavior when the list is full
		//Add throws an exception and offer returns False and do not add element in the queue
		queue.add("Ana");
		queue.offer("Bia"); 
		queue.add("Carlos");
		queue.offer("Daniel");
		queue.add("Rafaela");
		queue.offer("Gui");

		//Peek and Element -> Obtain next element of the queue (without removing)
		//The difference is the behavior when the list is empty
		//Element throws an exception and peek returns Null
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.element());
		
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.contains("Rafaela"));
		
		//Poll and Remove-> Obtain next element of the queue (removing it)
		//The difference is the behavior when the list is empty
		//Remove throws an exception and poll returns Null
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		

	}

}
