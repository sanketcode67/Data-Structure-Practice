package Java_Programs.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {

        char[][] board = new char[4][4];
        int size = board.length;
//        nqueen(board,0,0,0,"");


        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i < size;i++)
        {
            for (int j = 0; j < size;j++)
            {
               board[i][j]='.';
            }
        }
//        System.out.println(list);

        System.out.println(nqueenList(board,0,0,0,"",ans));

    }
    public static boolean isValidToPlaceQueen(char[][] board,int sr,int sc)
    {
        int[][] dir = {
                {-1,0},
                {-1,1},
//                {0,1},
//                {1,1},
//                {1,0},
//                {1,-1},
//                {0,-1},
                {-1,-1}
        };

        int radius = board.length;
        for (int rad=1;rad < radius; rad++)
        {
            for(int d=0;d< dir.length;d++)
            {
                int rr = sr + rad * dir[d][0];
                int cc = sc + rad * dir[d][1];

                if(rr<board.length && cc<board[0].length && rr>=0 && cc >=0)
                {
                    if(board[rr][cc]=='Q')
                        return false;
                }
            }
        }
        return true;
    }


    // qpsf==> queen placed so far
    //asf==> answer so far
    public static void nqueen(char[][] board, int sr,int sc,int qpsf,String asf)
    {
        //base case
        if(sr == board.length)
        {
            if(qpsf==board.length)
            {
                System.out.println(asf+".");
            }
            return;
        }



        if(sc+1< board[0].length) //next column is valid
        {   //yes call+ isvalid
            if(isValidToPlaceQueen(board,sr,sc) == true)
            {
                board[sr][sc]=1;
                nqueen(board,sr+1,0,qpsf+1,asf+""+sr+"-"+sc+", ");
                board[sr][sc]=0;
            }
            //no call
            nqueen(board,sr,sc+1,qpsf,asf);
        }
        else // next column is invalid
        {   //yes+isvalid
            if(isValidToPlaceQueen(board,sr,sc) == true)
            {
                board[sr][sc]=1;
                nqueen(board,sr+1,0,qpsf+1,asf+""+sr+"-"+sc+", ");
                board[sr][sc]=0;
            }
            //no call
                nqueen(board,sr+1,0,qpsf,asf);
        }
    }


    public static List<List<String>> nqueenList(char[][] board, int sr,int sc,int qpsf,String asf,List<List<String>> ans) {
        //base case
        if (sr == board.length) {
            if (qpsf == board.length) {
                List<String> strList = new ArrayList<>();
                for (int i = 0; i < board.length; i++) {
                    String string = new String(board[i]);
                    System.out.println(string);
                    strList.add(string);

                }
                ans.add(strList);
                System.out.println();
            }

//                System.out.println(asf+".");
            return null;
        }





        if(sc+1< board[0].length) //next column is valid
        {   //yes call+ isvalid
            if(isValidToPlaceQueen(board,sr,sc) == true)
            {
                board[sr][sc]='Q';
                nqueenList(board,sr+1,0,qpsf+1,asf+""+sr+"-"+sc+", ",ans);
                board[sr][sc]='.';
            }
            //no call
            nqueenList(board,sr,sc+1,qpsf,asf,ans);
        }
        else // next column is invalid
        {   //yes+isvalid
            if(isValidToPlaceQueen(board,sr,sc) == true)
            {
                board[sr][sc]='Q';
                nqueenList(board,sr+1,0,qpsf+1,asf+""+sr+"-"+sc+", ",ans);
                board[sr][sc]='.';
            }
            //no call
            nqueenList(board,sr+1,0,qpsf,asf,ans);
        }
        return ans;
    }







}

