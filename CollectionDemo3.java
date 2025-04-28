package collection.java;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionDemo3 {
	
	public static void main(String []args) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(4);
		queue.offer(5);
		queue.offer(1);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		PriorityQueue<UserProfile> userqueue = new PriorityQueue<>(
            Comparator.comparing((UserProfile u) -> u.age));
		userqueue.offer(new UserProfile(20));
		userqueue.offer(new UserProfile(30));
		userqueue.offer(new UserProfile(40));
		
		System.out.println(userqueue.poll().age);
	}
	
	static class UserProfile {
		private final Integer age;
		
		public UserProfile(Integer age) {
			this.age =age;
			}
		
		public Integer getAge() {
			return age;
		}
	}
	

}
