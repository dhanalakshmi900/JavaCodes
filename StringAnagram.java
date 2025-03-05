import java.util.*;
class Anagram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1,String s2)
    {
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            Arrays.sort(str1);
            Arrays.sort(str2);
           for(int i=0;i<str1.length;i++)
           {
            if(str1[i]!=str2[i])
            {
                return false;
            }
           }
        }
        return true;
    }

}