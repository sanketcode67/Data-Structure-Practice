package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetMazePath {
    public static void main(String[] args) {
        ArrayList<String> result=getMazePath(0,0,2,2);
        System.out.println(result);
    }
    static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc)
    {
        //base case
        if(sr==dr && sc==dc)

        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sc>dc || sr>dr)
        {
            return new ArrayList<>();//return a Empty ArrayList
        }

        //my final result ArrayList
        ArrayList<String> mres = new ArrayList<>();
//        if(sc+1<=dc)
//        {
            ArrayList<String> rres1= getMazePath(sr,sc+1,dr,dc);
            for(String s:rres1)
            {
                mres.add("H"+s);
            }
//        }
//        if(sr+1<=dr)
//        {
            ArrayList<String> rres2 = getMazePath(sr+1,sc,dr,dc);
            for(String s:rres2)
            {
                mres.add("V"+s);
            }
//        }
        return mres;
    }

}
