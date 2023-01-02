package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetStairPathWithJumps {


    public static void main(String[] args) {

        int[] jumps= {1,0,2,1,4,0,2,3};
        System.out.println(getStairPathWithJumps(jumps,7));

    }
    static ArrayList<String> getStairPathWithJumps(int[] jumps,int n)
    {
        if(n==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");

            return bres;
        }

        //myresult ArrayList
        ArrayList<String> mres= new ArrayList<>();


        for (int jump=1;jump<=jumps[n] && n-jump>=0;jump++)
        {
            ArrayList<String> rres= getStairPathWithJumps(jumps,n-jump);
            for (String s:rres)
                mres.add(jump+s);
        }

        return mres;
    }
}
