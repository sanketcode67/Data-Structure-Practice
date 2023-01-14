package Java_Programs.Backtracking;

public class Recursion {
    public static void main(String[] args) {
//        printQueeenMove();
        printKnightMove();
    }

    static void printQueeenMove()
    {
        //dummy matrix to figure out the radius concept
        int n=3;
        int m=3;


        int[] rdir = {-1,-1,0,1,1,1,0,-1};
        int[] cdir = {0,1,1,1,0,-1,-1,-1};


        //i am in this row coloum


        int r = 1;

        int c = 0;

        int radius = Math.max(n,m);

        for (int rad = 1; rad<=radius;rad++)
        {
            for (int dir=0;dir< rdir.length;dir++)
            {
                int rr = r + rad * rdir[dir];
                int cc = c + rad * cdir[dir];

                if(rr<m && rr>=0 && cc<n && cc>=0)
                System.out.println("Radius : "+ rad + " Dir : "+ dir +":-> row :"+ rr+":-> column :"+ cc);
            }
        }



    }

    static void printKnightMove()
    {
        //board size 5 X 5
        int n = 5;
        int m= 5;

        //I am at the position
        int r = 0;
        int c = 0;


        int[] rdir={-2,-1,1,2,2,1,-1,-2};
        int[] cdir={1,2,2,1,-1,-2,-2,-1};

        for (int dir=0;dir<rdir.length;dir++)
        {
            int rr = r + rdir[dir];
            int cc = c + cdir[dir];

            if(rr<n && cc<m && rr>=0 && cc>=0)
            System.out.println("dir : "+ dir +" :->" +"row : "+rr +", col : "+ cc);
        }

    }


}
