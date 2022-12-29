package Java_Programs.Recursion.Basic;

public class PrintIncreasing {
    public static void main(String[] args) {
        //expectation
        PrintIncreasing(5);
    }
    static void PrintIncreasing(int n)
    {
        //base case
        if(n==0) return;

        //faith
       PrintIncreasing(n-1);

       //done by myself
        System.out.println(n);
    }

}
