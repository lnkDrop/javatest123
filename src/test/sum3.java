package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 找出所有满足条件且不重复的三元组。
 * 解题思路：先对给定数组进行升序排序，三指针遍历查找，第一个指针指向第一个元素i，第二个指针(L)指向i+1，第三个指针(R)指向最后一个元素len-1
 * 当左指针<右指针&&这三个指针指向元素之和等于0时，提取这三个元素，存储在二维数组内。sum小于0时，值不够，L右移，小于0时，值超出，R左移
 * 注意重复时检测，i=i+1时，第一指针右移。L=L+1时，L++(下次循环L再++，则指向最后重复元素右边一个，写成while循环，这样可以判断多次重复),R=R-1,同理
*/
public class sum3 {
	 public static void main(String[] args) {
		int[]nums = {-1, 0, 1, 2, -1, -4};
		int len = nums.length-1;
		
		List<List<Integer>> list =new ArrayList();
		Arrays.sort(nums);
//		if(len<3||nums==null) {
//			return list;
//		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0||nums[len]<0) {
				break;
			}
			
			int L = i+1;
			int R = len;
			
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			while(L<R) {
				if(nums[i]+nums[L]+nums[R]==0) {
					list.add(Arrays.asList(nums[i],nums[L],nums[R]));
					while(nums[L]==nums[L+1]) {
						L++;
					}
					while(nums[R]==nums[R-1]) {
						R--;
					}
					L++;
					R--;
				}
				else if(nums[i]+nums[L]+nums[R]<0){
					L++;
				}
				else if(nums[i]+nums[L]+nums[R]>0){
					R--;
				}
			}
			
			
		}
		
		System.out.println(list);

	}
}
