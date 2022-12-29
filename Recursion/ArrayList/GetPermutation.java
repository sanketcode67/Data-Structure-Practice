package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetPermutation {
    public static void main(String[] args) {
        ArrayList<String> result=getPermutation("aaa");
        System.out.println(result);



    }

    private static ArrayList<String> getPermutation(String str) {

        if (str.length()==0)
        {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mres = new ArrayList<>();

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            String roq = str.substring(0,i)+str.substring(i+1);

//            StringBuilder sb = new StringBuilder(str);
//            sb.deleteCharAt(i);

            ArrayList<String> rres=getPermutation(roq);
            for(String s:rres)
            {
                mres.add(ch+s);
            }
        }
        return mres;
    }
}
