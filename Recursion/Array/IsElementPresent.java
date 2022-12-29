package Java_Programs.Recursion.Array;

public class IsElementPresent {
    public static void main(String[] args) {
        int[] arr = {10,40,30,40,50};
        System.out.println(isElementPresent(arr,0,40));
        System.out.println(firstIndexOfData(arr,0,40));
        System.out.println(lastIndexOfData(arr,0,40));

    }
    static boolean isElementPresent(int[] arr,int index,int data)
    {
        //base case
        if(index==arr.length) return false;

        //check myself first
        if(data==arr[index]) return true;

        //faith
        return isElementPresent(arr,index+1,data);
    }

    //A number representing first index of occurrence of x in array or -1 if not found at all
    static int firstIndexOfData(int[] arr,int index,int data)
    {
        //base case
        if(index==arr.length) return -1;

        //check myself first
        if(data==arr[index]) return index;

        //faith
        return firstIndexOfData(arr,index+1,data);
    }
    //A number representing last index of occurrence of x in array or -1 if not found at all
    static int lastIndexOfData(int[] arr,int index,int data)//{10,40,30,40,50}
    {


        if(index== arr.length) return -1;

        int li=lastIndexOfData(arr,index+1,data);
        if(li==-1 && arr[index]==data)
            li= index;
        return li;
    }

}
