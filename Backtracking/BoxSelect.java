package Java_Programs.Backtracking;

public class BoxSelect {
    public static void main(String[] args) {

//        selectBox(0,4,"",0);
        printWaysIn2D(2,2,0,0,0,"");
    }
    public static void selectBox(int cb,int total_box,String asf,int bsf)
    {
        if(cb==total_box)
        {

            if(bsf==3)
                System.out.println(asf);
            return;
        }


        //yes call
        selectBox(cb+1,total_box,asf+"B"+cb +" ",bsf+1);
        //no call
        selectBox(cb+1,total_box,asf,bsf);
    }


    //dimension of box=> n X m ,r->row,c->column, bsf->box so far, asf=>answer so far
    public static void printWaysIn2D(int n,int m,int r,int c,int bsf,String asf)
    {
        if(r==n)
        {
            System.out.println(asf);
            return;
        }

       if(c+1<m)
       {
           printWaysIn2D(n,m,r,c+1,bsf+1,asf+"("+r+"-"+c+") ");
           printWaysIn2D(n,m,r,c+1,bsf,asf);
       }
       else
       {
           printWaysIn2D(n,m,r+1,0,bsf+1,asf+"("+r+"-"+c+") ");
           printWaysIn2D(n,m,r+1,0,bsf,asf);
       }

    }


}
