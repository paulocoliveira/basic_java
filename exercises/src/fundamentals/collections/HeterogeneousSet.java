package fundamentals.collections;

import java.util.HashSet;
import java.util.Set;

public class HeterogeneousSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1.2);
		set.add(true);
		set.add("Teste");
		set.add(1);
		set.add('x');
		
		System.out.println("Set size is: " + set.size());
		
		set.add("Teste");
		
		System.out.println("Set size is: " + set.size());
		
		System.out.println(set.remove("teste"));
		System.out.println(set.remove("Teste"));
		
		System.out.println("Set size is: " + set.size());
		
		System.out.println(set.contains("Teste"));
		System.out.println(set.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(set);
		System.out.println(nums);
		
		//union of two sets
		set.addAll(nums);
		
		System.out.println(set);
		System.out.println(nums);
		
		set.clear();
		
		System.out.println(set);
		

	}

}
