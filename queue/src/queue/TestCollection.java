package queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class TestCollection {
	public static void main(String[] args) {
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(12);
		queue.add(123);
		
		System.out.println("head"+queue.element());
		System.out.println("head"+queue.peek());
		
		Iterator<Integer>itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing");
		Iterator<Integer>itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
