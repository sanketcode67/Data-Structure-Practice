package Java_Programs.Recursion.Basic;

public class PrintZigZag {
    public static void main(String[] args) {
        printZigZag(3);
    }
    static void printZigZag(int n){

        if(n==0) return;

        System.out.print(n+" ");//pre area
        printZigZag(n-1);

        System.out.print(n+" ");//In area
        printZigZag(n-1);

        System.out.print(n+" ");//Post area
    }

}
