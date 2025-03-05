//StringConcatination in 2 ways
//Using + operator
//Using concat() method
public class StringConcatination{
    public static void main(String args[])
    {
        String s1="java";
        String s2="python";
        String s3=s1+s2;//String Created in Non Constant Pool
        String s4=s1.concat(s2);//Non Constant Pool
        String s5="java"+"Python";//Created in Constant Pool
        String s6="java"+"Python";
        if(s3==s4)
        {
            System.out.println("ref are equal");
        }
        else
        {
            System.out.println("ref are unequal");
        }
        if(s5==s6)
        {
            System.out.println("ref are equal");
        }
        else
        {
            System.out.println("ref are unequal");
        }

    }
}