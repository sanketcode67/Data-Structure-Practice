package Java_Programs.Recursion.Basic;

public class PrintDecreasing {

    public static void main(String[] args) {
        //expectation
        PrintDecreasing(10);
    }

    static void PrintDecreasing(int n)
    {
        //base case
        if(n==0) return;

        //done by myself
        System.out.print(n +" ");


        //faith
        PrintDecreasing(n-1);
    }
}
