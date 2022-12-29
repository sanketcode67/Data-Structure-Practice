package Java_Programs.Recursion.Basic;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        pdi(5);
    }


    static void pdi(int n)
    {
        //base case
        if (n==0) return;

        //done by myself
        System.out.print(n+" ");
        //faith
        pdi(n-1);
        //done by myself
        System.out.print(n+" ");
    }
}
