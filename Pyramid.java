public class Pyramid{
public static void main(String args[])
{
int n=5;
for(int i=0;i<=n;i++)
{	char c='A';
	for(int k=i;k<=n;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=(2*i-1);j=j+2)
	{
		System.out.print(c++ +" ");
	}
	
	System.out.println();
}
}
}