package CharacterString;

public class FirstUniqChar {

	/**
	 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
		
		案例:
		
		s = "leetcode"
		返回 0.
		
		s = "loveleetcode",
		返回 2.

	 */
	
	private boolean[] table = new boolean[26];
	
	/**
	 * 思路：首先用双循环找出字符串中重复的字符.
	 * 将重复的字符放到字符表里，下标对应字母顺序，重复为true，不重复为false.
	 * 最后根据字符表找出第一个不重复的字符位置，若没有不重复字符返回-1
	 */
	public int firstUniqChar(String s) {
		int index = -1;   //若没有不重复字符返回-1
        for( int i=0; i<s.length(); i++ )    //此循环条件能让 第1个 和 最后1个 字符不是重复字符时，不等于-1
        {
        	if ( repeatChar(s.charAt(i)) )   //此下标的字符已出现过，则跳过此循环
        		continue;
        	for ( int j=i+1; j<s.length(); j++ )
        	{
        		if ( s.substring(i, i+1).equals(s.substring(j, j+1)))  //比较 i ， j 位置上的字符
        		{
        			charTable(s.charAt(i));     //出现重复，在字符表上标记
        			break;
        		}
        	}
        	// i 与 j比较后,字符表还是false，则表明此下标的字符不重复
        	if ( !repeatChar(s.charAt(i)) )
        	{
        		index = i;
        		break;
        	}
        }
        return index;
	}
	
	//字符表，
	public void charTable(char c) {
		table[(int)c-97] = true;    //a的整形值为 97
	}
	
	//判断此字符是否重复
	public boolean repeatChar(char c) {
		return table[(int)c-97];
	}
	
	public static void main(String[] args) {
		FirstUniqChar f = new FirstUniqChar();
		String s = "z";
		System.out.println(f.firstUniqChar(s));
	}
}
