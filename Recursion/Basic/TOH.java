package Java_Programs.Recursion.Basic;
//Tower of Hanoi
public class TOH {

    public static void main(String[] args) {

        TOH(3,'S','D','H');
    }

    static void TOH(int n,char src,char dst, char helper)
    {
        if(n==0) return;

        TOH(n-1,src,helper,dst);
        System.out.println("move disk "+ n + " from " + src+ " to "+ dst);
        TOH(n-1,helper,dst,src);

    }
}
