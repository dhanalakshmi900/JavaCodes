import java.util.Scanner;
class RemoveOccurance1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        System.out.println(RemoveOccurance(s,ch));
    }
    public static String RemoveOccurance(String s,char ch)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=ch)
            {
                res+=s.charAt(i);
            }
        }
        return res;
    }
}