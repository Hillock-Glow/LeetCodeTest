package array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

	示例 1:
	
	输入: [1,2,3,4,5,6,7] 和 k = 3
	输出: [5,6,7,1,2,3,4]
	解释:
	向右旋转 1 步: [7,1,2,3,4,5,6]
	向右旋转 2 步: [6,7,1,2,3,4,5]
	向右旋转 3 步: [5,6,7,1,2,3,4]
	
	示例 2:
	
	输入: [-1,-100,3,99] 和 k = 2
	输出: [3,99,-1,-100]
	解释: 
	向右旋转 1 步: [99,-1,-100,3]
	向右旋转 2 步: [3,99,-1,-100]	
 * */

public class RotatedArray {
//	public void rotate(int[] nums, int k) {
//		//k 必须小于 nums.length，否则会越界。如果相等则直接退出
//		k = k % nums.length;
//		if ( k == nums.length )
//		{
//			return;
//		}
//		
//		int[] temps = new int[k];
//        int len = temps.length-1;
//        //将需要旋转的元素存放在临时数组中
//        for ( int i=0; i<k; i++ )
//        {
//        	temps[i] = nums[nums.length-k+i];
//        }
//        
//        //开始向右移动数组
//        for ( int i=nums.length-1; i>=0; i--)
//        {
//        	//将 nums[] 索引小于（nums.length-k-1）的元素，移至最右边
//        	if ( i>=k )
//        	{
//        		nums[i] = nums[i-k];
//        	}
//        	// 将 temp[] 放到nums[]剩下的元素中
//        	else
//        	{
//        		nums[i] = temps[len--];
//        	}
//        }
//    }
	
	//LeetCode代码
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //求余，防止k大于n
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
         
     }
     
    //将nums[] 中的 strart~end的元素的值翻转
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] =  temp;
        }
    }	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		RotatedArray ra = new RotatedArray();
		ra.rotate(nums, 29);
		for ( int i=0; i<nums.length; i++ )
		{
			System.out.print(nums[i]+"  ");
		}
	}
}
