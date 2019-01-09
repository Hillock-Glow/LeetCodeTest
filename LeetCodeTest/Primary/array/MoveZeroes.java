package array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

	示例:
	
	输入: [0,1,0,3,12]
	输出: [1,3,12,0,0]
	
	说明:
	
	    1.必须在原数组上操作，不能拷贝额外的数组。
	    2.尽量减少操作次数。


 * */

public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int mark = 0;     
		int t = 0;		 
		/**
		 * 交换过程：
		 * 1 1 0 0 2 4 3
		 * 1 1 2 0 0 4 3
		 * 1 1 2 4 0 0 3
		 * 1 1 2 4 3 0 0
		 * 遍历数组,当遇到不为 0 的数时，与前面的 0 对调（若没有 0 则跳过）
		 */
        for ( int i=0; i<nums.length; i++)
        {
        	if ( nums[i] != 0 )
        	{
        		//mark 的位置与 i 的位置一致时跳过
        		if ( mark != i)
        		{
        			t = nums[mark];       //对调
            		nums[mark] = nums[i];
            		nums[i] = t;
        		}
        		mark++;
        	}
        }
    }
	
	public static void main(String[] args) {
		MoveZeroes move = new MoveZeroes();
		int[] nums = {1,1,0,0,2,4,3};
		move.moveZeroes(nums);
		for (int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]+"  ");
		}
	}
}
