import java.util.Scanner;
class SubString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.next();
        System.out.println(isSubString(s,sub));
    }
    public static boolean isSubString(String s,String sub)
    {
        if(s.length()<sub.length())
        {
            return false;
        }
        else
        {
            int j=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==sub.charAt(j))
                {
                    j++;
                    if(j==sub.length())
                    {
                        return true;
                    }
                }
                else{
                    j=0;
                }
            }
        }
        return false;
    }
}