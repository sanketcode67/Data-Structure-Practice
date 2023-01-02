package Java_Programs.Recursion.ArrayList;

public class PrintEncoding {
    public static void main(String[] args) {
        printEncoding("226","");
    }
    static void printEncoding(String str,String asf)//asf==>answer so far
    {
        //base case

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        int n1 = str.charAt(0)-'0';

        if(n1==0)
        {
            return;
        }

        char ch1 = (char)(n1+ 'a'-1);
        String roq1 = str.substring(1);
        printEncoding(roq1,asf+ch1);

        if(str.length()>1)
        {
            int n2 = str.charAt(1)-'0';
            n2 = n1*10 + n2;
            if(n2<=26)
            {
                char ch2 = (char) (n2+'a'-1);
                String roq2 = str.substring(2);
                printEncoding(roq2,asf+ch2);
            }

        }

// MY APPROACH --->done by myself this problem
//        for (int i=0;i<2 && i<str.length();i++)
//        {
//            String mq= str.substring(0,i+1);
//            int mqint=Integer.parseInt(mq);
////            System.out.println(mqint);
//            String roq=str.substring(i+1);
//            if(mqint+96>=97 && mqint+96<=122)
//            {
//                char ch = (char) (mqint+96);
//                printEncoding(roq,asf+ch);
//            }
//
//        }
    }
}
