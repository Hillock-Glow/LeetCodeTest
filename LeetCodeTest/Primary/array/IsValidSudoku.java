package array;

/**
 * 
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

    数字 1-9 在每一行只能出现一次。
    数字 1-9 在每一列只能出现一次。
    数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 */

public class IsValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		for ( int i=1; i<9; i++ )
		{
			boolean[] row = new boolean[10];  //行,数组的下标对应数独里的数字1~9，如果数独里的数字未出现为false，出现为true
			boolean[] col = new boolean[10];  //列
			boolean[] cube = new boolean[10];
			
			for ( int j=1; j<9; j++ )
			{
				//验证行。  i：行，j:列。  当格子不为空时进行判断
				if ( board[i][j] != '.' )
				{
					if ( row[board[i][j]] == false )
					{
						row[board[i][j]] = true;
					}
					else
					{
						return false;     //数字出现重复，返回false退出
					}
				}
				
				//验证列。  i:列，j:行。  当格子不为空时进行判断
				if ( board[j][i] != '.' )
				{
					if ( col[board[j][i]] == false )
					{
						col[board[j][i]] = true;
					}
					else
					{
						return false;     //数字出现重复，返回false退出
					}
				}
				
				int cubeX = 3 * (i/3) + j/3;
                int cubeY = 3 * (i%3) + j%3;
                if(board[cubeX][cubeY] != '.') 
                {
                    if(cube[board[cubeX][cubeY]] == false) 
                    {
                    	cube[board[cubeX][cubeY]] = true;
                    }
                    else 
                    {
                        return false;
                    }
                }
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		IsValidSudoku s = new IsValidSudoku();
		//数独部分空格内已填入了数字，空白格用 '.' 表示
		char[][] board1 = {
				{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
		};
		char[][] board2 = {
				{'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'} 
		};
		System.out.println(s.isValidSudoku(board1));
	}	

}
