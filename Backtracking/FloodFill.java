package Java_Programs.Backtracking;

public class FloodFill {
    public static void main(String[] args) {
        int[][] board = {
                {0,1,0,0,0,0},
                {0,1,0,1,1,0},
                {0,1,0,1,1,0},
                {0,0,0,0,0,0},
                {1,1,0,1,1,0},
                {1,1,0,0,0,0}
        };


        floodFill(board,0,0,"");
    }
    public static void floodFill( int[][] board,int sr,int sc,String asf)
    {


        int n = board.length;
        int m = board[0].length;

//      base case
        if(sr==n-1 && sc==m-1)
        {
            System.out.println(asf);
            return;
        }

        //mark the visited box
        board[sr][sc]=1;


        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        char[] charArr = {'t','l','d','r'};

        for (int d=0;d< dir.length;d++)
        {
            int rr = sr + dir[d][0];
            int cc = sc + dir[d][1];
            char direction = charArr[d];

            if(rr<n && rr>=0 && cc<m && cc>=0 && board[rr][cc]!=1)
            {
                floodFill(board,rr,cc,asf+direction);
            }
        }

        //unmark the visited box
        board[sr][sc]=0;
    }

}
