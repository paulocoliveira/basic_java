package fundamentals.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		User u1 = new User("Ana");
		list.add(u1);
		list.add(new User("Carlos"));
		list.add(new User("Lia"));
		list.add(new User("Bia"));
		list.add(new User("Manu"));
		list.add(new User("Manu"));
	
		System.out.println(list.get(3));
		
		System.out.println("Removed: " + list.remove(1).name);
		System.out.println(list.remove(new User("Manu")));
		System.out.println("Contains? " + list.contains(new User("Lia")));
		
		for(User user : list) {
			System.out.println(user);
		}
	}

}
