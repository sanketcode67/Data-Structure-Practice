package Java_Programs.Backtracking;

public class TargetSubsetSum {
    public static void main(String[] args) {
        int[] arr ={2,1,3,0};
        printTargetSumSubset(arr,0,0,8,"");
    }
    public static void printTargetSumSubset(int[] arr,int index,int ssf,int target,String asf)
    {
        //base case
        if(arr.length==index)
        {
            if(ssf==target)
                System.out.println(asf+".");
            return;
        }

        int val = arr[index];

        if(ssf+val<=target)
        {
            //yes call
            printTargetSumSubset(arr,index+1,ssf+val,target,asf+val+",");
        }
        //no call
        printTargetSumSubset(arr,index+1,ssf,target,asf);

    }

}
