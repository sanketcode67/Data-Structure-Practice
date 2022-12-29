package Java_Programs.Recursion.Array;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};

        PrintArrayReverse(arr,0);
    }

    static void PrintArrayReverse(int[] arr,int index)
    {
        //base condition
        if(index == arr.length) return;

        //faith
        PrintArrayReverse(arr,index+1);
        //done by myself
        System.out.print(arr[index]+" ");
    }
}

