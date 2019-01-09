package array;

/**
 *  给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
	
	你可以假设除了整数 0 之外，这个整数不会以零开头。
	
	示例 1:
	
	输入: [1,2,3]
	输出: [1,2,4]
	解释: 输入数组表示数字 123。
	
	示例 2:
	
	输入: [4,3,2,1]
	输出: [4,3,2,2]
	解释: 输入数组表示数字 4321。
 */

public class PlusOne {

	public int[] plusOne(int[] digits) {
		int[] nums = new int[digits.length+1];  
		for (int i=digits.length-1; i>=0; i--)   //从最后一位数开始+1，此循环很简单就不多说了
		{
			if ( digits[i] == 9 )    
			{
				digits[i] = 0;
			}
			else
			{
				digits[i]++;
				break;
			}
		}
		
		if ( digits[0] == 0 )      //如果数组是 9 或 999 的时候，加1就为 0 或 000.
		{
			nums[0] = 1;           //在另一个数组最前方的位置改为 1,结果就为10 或 1000，以空间换时间
			digits = nums;
		}
	    return digits;
    }
	
	public static void main(String[] args) {
		PlusOne p = new PlusOne();
		int[] digits = {4,8,3,9,9};
		digits = p.plusOne(digits);
		for (int i=0; i<digits.length; i++)
		{
			System.out.print(digits[i]);
		}
	}
}
