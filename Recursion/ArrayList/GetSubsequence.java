package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

public class GetSubsequence {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> res = getSubsequence(str);

        System.out.println(res);
    }
    static ArrayList<String> getSubsequence(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> rres = new ArrayList<>();
            rres.add("");
            return rres;
        }

        char ch = str.charAt(0);
        //roq==> rest of question
        String roq = str.substring(1);

        ArrayList<String> rres = getSubsequence(roq);

        ArrayList<String> res = new ArrayList<>();
        //character add with "no" option
        for (String s:rres) {
            res.add("_"+s);
        }
        //character add with "yes" option
        for (String s:rres) {
            res.add(ch+s);
        }
        return res;
    }
}
