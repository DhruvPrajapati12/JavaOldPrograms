package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(58);
		pq.add(75);
		pq.add(45);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}

}
