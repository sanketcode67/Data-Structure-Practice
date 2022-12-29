package Java_Programs.Recursion.Array;

public class MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10,20,-4,50,33};
        System.out.println(MaxOfAnArray(arr,0));
        System.out.println(MinOfAnArray(arr,0));

    }

    //Max of an array
    static int MaxOfAnArray(int[] arr,int index)
    {
        //base case
        if(index==arr.length-1) return arr[index];

        //faith
        int max = MaxOfAnArray(arr,index+1);

        //My Work
        return Math.max(arr[index],max);
    }

    //Min of an array
    static int MinOfAnArray(int[] arr,int index)
    {
        //base case
        if(index == arr.length-1) return arr[index];

        //faith
        int min = MinOfAnArray(arr,index+1);

        //My Work
        return Math.min(arr[index],min);
    }

}
