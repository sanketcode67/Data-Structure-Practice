package Java_Programs.Recursion.ArrayList;

public class PrintPermutation {
    public static void main(String[] args) {
        printPermutation("abc","");

    }

    static void printPermutation(String str,String asf) //asf===> answer so far
    {   if(str.length()==0)
        {
            System.out.println(asf);

            return;
        }

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String roq = str.substring(0,i)+str.substring(i+1);

            printPermutation(roq,asf+ch);
        }
    }



}
