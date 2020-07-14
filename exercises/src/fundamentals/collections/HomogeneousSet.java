package fundamentals.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HomogeneousSet {

	public static void main(String[] args) {

		SortedSet<String> passedList = new TreeSet<String>();
		
		passedList.add("Ana");
		passedList.add("Carlos");
		passedList.add("Luca");
		passedList.add("Pedro");
		
		for (String candidate : passedList) {
			System.out.println(candidate);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
	}

}
