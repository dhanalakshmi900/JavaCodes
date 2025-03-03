import java.util.Scanner;
class FreqChar{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        System.out.println(Frequency(s,ch));
    }
    static int Frequency(String s,char ch)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
        return count;
    }
}