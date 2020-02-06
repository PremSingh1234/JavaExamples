package com.qa.ForEachLoops;
import java.util.ArrayList;
public class ForEachLoop {
	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 8;
		nums[1] = 2;
		nums[2] = 15;
		
		for(int num : nums) {
			System.out.println(num);
		}
	}

}


