package com.qa.ForEachLoops;
import java.util.ArrayList;
public class ForEachLoops2 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(8);
		nums.add(2);
		nums.add(15);
		
		for(Integer num : nums) {
			System.out.println(num);
		}

    }
}
