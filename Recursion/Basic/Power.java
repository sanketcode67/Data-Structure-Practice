package Java_Programs.Recursion.Basic;

public class Power {
    public static void main(String[] args) {

        //expectation
//        int result = power(2,10);
//        System.out.println(result);
        System.out.println(logarithmicPower(2, 5));
    }



    //function to calculate normal power
    static int power(int x,int n)
    {
        //base case
        if(n==0) return 1;

        //faith
        int pow = power(x,n-1);
        //done by myself
        int result = x * pow;
        return result;
    }



    //function to calculate logarithmic power
    static int logarithmicPower(int x,int n)
    {
        //base case
        if(n==0) return 1;
        //faith
        int halfPower = logarithmicPower(x,n/2);
        int result = halfPower * halfPower;

        //if power is odd then multiply result with x once
        if(n%2!=0)
            return result*2;
        //done by myself
        return result;
    }
}

