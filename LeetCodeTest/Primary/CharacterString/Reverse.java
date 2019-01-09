package CharacterString;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。

	示例 1:
	
	输入: 123
	输出: 321
	
	 示例 2:
	
	输入: -123
	输出: -321
	
	示例 3:
	
	输入: 120
	输出: 21
	
	注意:
	
	假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。

 * */

public class Reverse {

	public int reverse(int x) {
        long num = 0;
        int temp = x;
        
		while ( temp != 0 )
        {
			//如果反转后的整数溢出，则返回 0
			if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && temp%10 > 7)) return 0;
            if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && temp%10 < -8)) return 0;
            
			num = num*10+temp%10;
        	temp = temp / 10;
        }
		return (int)num;
    }
	
	public static void main(String[] args) {
		Reverse r = new Reverse();
		int x= 214748364;
		System.out.println(r.reverse(x));
	}

}
