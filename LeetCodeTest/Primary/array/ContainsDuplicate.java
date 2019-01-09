package array;

/**
 * 给定一个整数数组，判断是否存在重复元素。

	如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
	
	示例 1:
	
	输入: [1,2,3,1]
	输出: true
	
	示例 2:
	
	输入: [1,2,3,4]
	输出: false
	
	示例 3:
	
	输入: [1,1,1,3,3,4,3,2,4,2]
	输出: true
 */

import java.util.HashMap;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {  
		boolean repeat = false;    //判断重复值，重复返回true，不重复返回false
		HashMap<Integer,Integer> rep = new HashMap<Integer,Integer>();   //用集合的 key 判断重复值
		for ( int i=0; i<nums.length; i++ )
		{
			if ( !rep.containsKey(nums[i]) || rep.isEmpty() )  //集合的key不包含nums[i]或集合为空时，添加映射
			{
				rep.put(nums[i], 1);
			}
			else  //当出现重复数字时，标记并跳出循环
			{
				repeat = true;
				break;
			}
		}
		return repeat;
    }
	public static void main(String[] args) {
		ContainsDuplicate a = new ContainsDuplicate();
		int[] nums = {1,1,3,5,4,6,2,1};
		System.out.println(a.containsDuplicate(nums));
	}
}
