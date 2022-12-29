package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetStairPath {
    public static void main(String[] args) {

         ArrayList<String> result =getStairPath(3);
        System.out.println(result);
    }


    //get stair path
    public static ArrayList<String> getStairPath(int n) {
        if (n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0)
        {
            ArrayList<String> emptyResult = new ArrayList<>();
            return emptyResult;
        }

        //final result ArrayList
        ArrayList<String> mres= new ArrayList<>();
        //for move 1 with step size 1
        ArrayList<String> rres1=getStairPath(n-1);
        for (String s: rres1) {
            mres.add("1"+s);
        }
        //for move 2 with step size 2
        ArrayList<String> rres2=getStairPath(n-2);
        for (String s: rres2) {
            mres.add("2"+s);
        }
        //for move 3 with step size 3
        ArrayList<String> rres3=getStairPath(n-3);
        for (String s: rres3) {
            mres.add("3"+s);
        }


        return mres;
    }
    
}
