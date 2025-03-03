import java.util.Scanner;
class revSentence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine().trim();
        String[] words=sen.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            sb.append(reverse(words[i])+" ");
        }
        System.out.println(sb.toString());
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