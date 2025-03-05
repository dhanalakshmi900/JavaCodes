//creation of immutable strings using String class.
//Strings are created inside the String pool...which is present inside of the Heap.
import java.util.*;
public class StringCreation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=new String("Dhana");//created inside the NonConstant Pool
        String s2="Lakshmi";//Created Inside the Constant Pool
        char[] ch={'J','A','V','A'};
        String s3=new String(ch);//Created inside of the NCP
        System.out.println(s1+" "+s2+" "+"Learning"+" "+s3);

    }
}
