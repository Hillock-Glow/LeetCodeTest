package array;

import java.util.Arrays;

/**
 * 
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

	说明：
	
	你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
	
	示例 1:
	
	输入: [2,2,1]
	输出: 1
	
	示例 2:
	
	输入: [4,1,2,1,2]
	输出: 4	
 *
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		for(int i=1;i<nums.length; i++){
			//由于某个元素只出现一次以外，其余每个元素均出现两次，可以在 "位" 层面上做运算
            nums[0] ^= nums[i];   //异或运算	        
        }
	    return nums[0];
    }
	
	public int singleNumber2(int[] nums) {
        if (nums.length == 1) 
        {
            return nums[0];
        }
        Arrays.sort(nums);   //对数组进行排序
        
        for (int i = 0; i < nums.length; i++)
        {
        	// i与 i+1 或 i-1相同则返回 nums[i]
            if (i != 0 && i != nums.length - 1) 
            {
                if ((nums[i] != nums[i + 1]) && ((nums[i] != nums[i - 1])))
                {
                    return nums[i];
                }
            } 
            
            // i=0 与 i+1相同则返回 nums[i]
            else if (i == 0 && (nums[i] != nums[i + 1])) 
            {
                return nums[i];
            }
            
            // i=nums.length-1与 i-1相同则返回 nums[i]
            if (i == nums.length - 1 && (nums[i] != nums[i - 1])) 
            {
                return nums[i];
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		SingleNumber s = new SingleNumber();
		int[] nums = {1,5,4,3,4,2,5,1,3,2,10};
		System.out.println(s.singleNumber(nums));
	}

}
