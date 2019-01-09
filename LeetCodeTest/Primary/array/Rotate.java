package array;

public class Rotate {
	
	public void rotate(int[] nums, int k) {
        int t = 0;
        for ( int i=nums.length-1; i>0; i-- )
        {
        	if ( k>0 )
        	{
        		t = nums[i];
        		nums[i] = nums[k];
        		nums[k] = t;
        		k--;
        	}
        	else 
        	{
        		t = nums[i];
        		nums[i] = nums[0];
        		nums[0] = t;
        	}
        }
 
    }
	
	public static void main(String[] args) {
		Rotate r = new Rotate();
		int[] nums = {1,2,3,4,5,6,7,8};
		r.rotate(nums,3);
		for ( int i=0; i<nums.length; i++ )
		{
			System.out.print(nums[i]+"\t");
		}
	}

}
