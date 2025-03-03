import java.util.Scanner;
class StringPalindrome{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    System.out.println(isPalindrome(s1));
    System.out.println(isPalindrome(s2));
    }
    public static boolean isPalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}