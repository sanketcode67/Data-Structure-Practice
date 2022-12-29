package Java_Programs.Recursion.Basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n)
    {
        if(n==0) return 1;

        int result= n * fact(n-1);
        return result;
    }
}
