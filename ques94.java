import java.util.*;
class q94
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j,k=0,c,len;
        len=str.length();
        String newstr="";
        for(i=0;i<len;i++)
        {
            c=1;
            for(j=k+1;j<len;j++)
            {
                char ch=str.charAt(j);
                if(str.charAt(i)==ch)
                {
                    c++;
                    ch='\0';
                }
            }
            newstr=newstr+str.charAt(i)+c;
            k=c-1;
        }
        System.out.println(newstr);
    }
}