
import java.util.Scanner;
class Pattern8{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=i;
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}
//
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
