package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        ArrayList<String> result = getMazePathWithJumps(0,0,1,1);
        System.out.println(result);
    }

    private static ArrayList<String> getMazePathWithJumps(int sr, int sc , int dr, int dc) {

        if(sr==dr && sc==dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }


        ArrayList<String> mres=new ArrayList<>();
        for (int jump=1;sc+jump<=dc;jump++)
        {
            ArrayList<String> rres1= getMazePathWithJumps(sr,sc+jump,dr,dc);
            for(String s:rres1)
                mres.add("H"+jump+s);
        }
        for (int jump=1;sr+jump<=dr;jump++)
        {
            ArrayList<String> rres1= getMazePathWithJumps(sr+jump,sc,dr,dc);
            for(String s:rres1)
                mres.add("V"+jump+s);
        }
        for (int jump=1;sr+jump<=dr && sc+jump<=dc;jump++)
        {
            ArrayList<String> rres1= getMazePathWithJumps(sr+jump,sc+jump,dr,dc);
            for(String s:rres1)
                mres.add("D"+jump+s);
        }

        return mres;
    }
}
