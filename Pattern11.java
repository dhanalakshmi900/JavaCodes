import java.util.*;
class Pattern11{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+1+" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            if(i%2!=0)
            {
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
    }
}
//
1 1 1 1 1 2
3 2 2 2 2 2
3 3 3 3 3 4
5 4 4 4 4 4
5 5 5 5 5 6