package Java_Programs.Recursion.Array;

import java.util.Arrays;

public class AllIndices extends Object {
    public static void main(String[] args) {
        int[] arr={10,20,20,40,20,30,20,60,20,30,20,90};
        int[] result=allIndex(arr,0,20,0);
        System.out.println(Arrays.toString(result));

    }


    static int[] allIndex(int[] arr, int index, int data, int count)
    {
        if(index== arr.length){
            int[] result = new int[count];
            return result;
        }
        if(arr[index]==data)
            count++;

        //faith
        int[] result=allIndex(arr,index+1,data,count);
        if(arr[index]==data)
        {
            result[count-1]=index;
        }
        return result;

    }
}
