import java.util.Scanner;
class Calci{
public int add(int a,int b)
{
return a+b;
} 
public int sub(int a,int b)
{
 return a-b;
}
public int mul(int a,int b)
{
 return a*b;
}
public int div(int a,int b)
{
 return a/b;
}		
}
 class Calculator1{
public static void main(String args[])
{
Calci c1=new Calci();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter Choice:");
int c=sc.nextInt();
switch(c){
case 1:
System.out.println("add:"+c1.add(a,b));break;
case 2:
System.out.println("sub:"+c1.sub(a,b));break;

case 3:
System.out.println("mul:"+c1.mul(a,b));break;

case 4:
System.out.println("div:"+c1.div(a,b));break;

default:
System.out.println("Enter Valid choice");break;


}
}
}