package test;

import java.util.HashMap;
/*
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

解题思路：
两数之和等于target,即tagrget-元素1=元素2,
双层循环，两两比较，效率低超时，使用HashMap(字典)方式，键值对存储，
containsKey方法查找如果存在target-当前元素能成立的元素。保存两个元素的下标并返回。
*/
public class sum2 {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] res =new int[2];
		HashMap<Integer, Integer> m = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(m.containsKey(target-nums[i])) {
				res[0]=m.get(target-nums[i]);
				res[1]=i;
				break;
			}
			m.put(nums[i], i);
		}
        for(int n:res) {
        	System.out.println(n);
        }
	}
}
