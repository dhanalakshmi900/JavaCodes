//StringComaparision Can be done in 4 ways
//== ------Compares by references
//equals()-----Compares by value
//CompareTo()---Compares Character by character return 3 int values those are 0,+ve,-ve.
//equalsIgnoreCase()--Compares based on value by ignoring the cases.
public class StringComparision{
    public static void main(String args[])
    {
        String s1="Java";
        String s2="JAVA";
        //== ------Compares by references
        if(s1==s2)
        {
            System.out.println("ref are Equal");
        }
        else{
            System.out.println("ref are unequal");
        }
        //equals()-----Compares by value
        if(s1.equals(s2))
        {
            System.out.println("Values are Equal");
        }
        else{
            System.out.println("values are unequal");
        }
        //CompareTo()---Compares Character by character return 3 int values those are 0,+ve,-ve.
        int res=s1.compareTo(s2);
        if(res==0)
        {
            System.out.println("equal");
        }
        else if(res<0)//s1<s2 if res is negative
        {
            System.out.println("smaller");
        }
        else//s1>s2 if res is positive
        {
            System.out.println("larger");
        }
        //equalsIgnoreCase()--Compares based on value by ignoring the cases.
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Values are Equal");
        }
        else{
            System.out.println("values are unequal");
        }

    }
}