import java.util.Scanner;
class revString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev;
    }
}