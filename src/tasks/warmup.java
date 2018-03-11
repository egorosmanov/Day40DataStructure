package tasks;


import java.util.ArrayList;
import java.util.List;

public class warmup {
	
	public static void main(String[] args) {
		boolean result=Duplicate (new int []{1,24,23,4,7});
		System.out.println(result);
		
		
		
	}
	
	public static boolean Duplicate (int [] nums) {
		for (int i=0; i<nums.length; i++) {
			for (int j=i+1; j<nums.length; j++) {
				System.out.println(nums[i]+"-->"+nums[j]);
				if (nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
}
	
	public static boolean Duplicate (List <Integer> nums) {
		for (int i=0; i<nums.size(); i++) {
			for (int j=0; j<nums.size(); j++) {
				System.out.println(nums.get(i)+"-->"+nums.get(j));
				if (nums.get(i)==nums.get(j)) {
					return true;
			}
	}
}
		return false;
}
}
