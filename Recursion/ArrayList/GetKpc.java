package Java_Programs.Recursion.ArrayList;

import java.util.ArrayList;

//Get keypad code
public class GetKpc {
    public static String[] codes={",;","abc", "def", "ghi", "jkl","mno","pqrs","tu","vwx","yz"};


    public static void main(String[] args) {

        System.out.println(getKpc("179"));


    }





    static ArrayList<String> getKpc(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        int index= str.charAt(0)-'0';
        String code = codes[index];

        char[] chars = code.toCharArray();
        String roq = str.substring(1);
        ArrayList<String> rres = getKpc(roq);

        ArrayList<String> res = new ArrayList<>();
        for (int i=0;i<code.length();i++)
        {
            char ch = code.charAt(i);
            for(String s:rres)
            {
                res.add(ch+s);
            }
        }
        return res;
    }
}
