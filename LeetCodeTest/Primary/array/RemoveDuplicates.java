package array;
/**
 * 从排序数组中删除重复项

	给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
	
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	
	示例 1:
	
		给定数组 nums = [1,1,2], 
		
		函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
		
		你不需要考虑数组中超出新长度后面的元素。
 * */



public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
		int t = 0;
		int mark = -63534;
		int len = 0;
		
		for ( int i=0; i<nums.length-1; i++ )   //数组从小到大排序（冒泡、快速排序皆可）
			for(int j=i+1; j<nums.length; j++)
			{
				if( nums[i] > nums[j] )
				{
					t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		for (int i=0; i<nums.length; i++)    //核心,遍历数组
		{
			if ( mark != nums[i] )      //Mark标记nums数组出现过的数字，若不同则进入（此方法只能用于有序数组）
			{
				mark = nums[i];         //nums[i]已经出现了，Mark就记录下来
				nums[len] = nums[i];    //不同的数字，重新放入数组里
				len++;
			}
		}
		return len;
    }
	
	public static void main(String[] args) {
		RemoveDuplicates rem = new RemoveDuplicates();
		int[] a = {1,5,78,3,45,3,5,6,8,6,1}; 
		System.out.println(rem.removeDuplicates(a));

	}

}
