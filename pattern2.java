import java.util.*;
class Pattern2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a<=9)
                {
                    System.out.print(0);
                }
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}

//
01 02 03 04
05 06 07 08
09 10 11 12
13 14 15 16