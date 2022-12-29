package Java_Programs.Recursion.Basic;

public class PrintIncreasingDecreasing {

    public static void main(String[] args) {
        pid(5,1);
    }
    static void pid(int n, int i)
    {
        if(i==n){
            System.out.print(i+" ");
            return;
        }

        System.out.print(i+" ");
        pid(n,i+1);
        System.out.print(i+" ");
    }
}
