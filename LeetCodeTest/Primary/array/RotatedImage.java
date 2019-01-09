package array;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。

	将图像顺时针旋转 90 度。
	
	说明：
	
	你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
	
	示例 1:
	
	给定 matrix = 
	[
	  [1,2,3],
	  [4,5,6],
	  [7,8,9]
	],
	
	原地旋转输入矩阵，使其变为:
	[
	  [7,4,1],
	  [8,5,2],
	  [9,6,3]
	]

 */

public class RotatedImage {

	public void rotate(int[][] matrix) {
		int len = matrix.length-1;
		
		if ( matrix.length < 2 )
		{
			return;
		}
		
		for ( int i=0; i<(len+1)/2; i++ )
			for ( int j=i; j<len-i; j++ )
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[len-j][i];
				matrix[len-j][i] = matrix[len-i][len-j];
				matrix[len-i][len-j] = matrix[j][len-i];
				matrix[j][len-i] = temp;
			}
	}
	
	public static void main(String[] args) {
//		int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] image = {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
		RotatedImage test = new RotatedImage();
		test.rotate(image);
		for ( int i=0; i<image.length; i++ )
			for( int j=0; j<image[0].length; j++ )
			{
				System.out.print(image[i][j]+"\t");
				if ( j == image[0].length-1 )
				{
					System.out.println();
				}
			}
	}
}
