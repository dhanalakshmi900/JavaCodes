import java.util.*;
class Pattern12{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(i-1 +" ");
                }
            }
            System.out.println();
        }
    }
}

//
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 4 4 1