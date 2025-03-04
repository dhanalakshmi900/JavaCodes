import java.util.*;
class Pattern10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                if(j<count)
                System.out.print(j+" ");
                else
                System.out.print(count--+" ");
            }
            System.out.println();
        }
    }
}
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1