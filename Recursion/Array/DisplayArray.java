package Java_Programs.Recursion.Array;

public class DisplayArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};

        PrintArray(arr,0);

    }

    static void PrintArray(int[] arr,int index)
    {
        //base case
        if(index== arr.length) return;

        //done by myself
        System.out.print(arr[index]+" ");

        //faith
        PrintArray(arr,index+1);

    }


}
