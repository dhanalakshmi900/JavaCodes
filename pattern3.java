import java.util.*;
class Pattern3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a=(i*j);
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
01 02 03 04 05
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25