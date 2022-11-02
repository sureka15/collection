package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(15);
		nums.add(1);
		Integer[] a = new Integer[nums.size()];
		nums.toArray(a);
	
		for (Integer i : a) {
			sum = sum + i;
			
		}
		System.out.println(sum); 
		

	}

}
