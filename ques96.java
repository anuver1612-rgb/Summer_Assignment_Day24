import java.util.*;
class q96
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j,c,len;
        len=str.length();
        String newstr="";
        for(i=0;i<len;i++)
        {
            c=0;
            for(j=i;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            if(c>1)
            {
                if(str.charAt(i)!=' ')
                newstr=newstr+str.charAt(i);
                str=str.replace(str.charAt(i),' ');
            }
            else
            {
                if(str.charAt(i)!=' ')
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}