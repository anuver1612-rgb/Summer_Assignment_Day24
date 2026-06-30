import java.util.*;
class q93
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1=sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String str2=sc.nextLine();
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
        {
            System.out.println(str2+" IS NOT A ROTATION OF "+str1);
            System.exit(0);
        }
        String temp=str1+str1;
        boolean result=temp.contains(str2);
        if(result==true)
            System.out.println(str2+" IS A ROTATION OF "+str1);
        else
            System.out.println(str2+" IS NOT A ROTATION OF "+str1);
    }
}