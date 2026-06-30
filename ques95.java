import java.util.*;
class q95
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j;
        int len=str.length();
        int max_len=0;
        int word_len;
        String word="";
        String w="";
        for(i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            for(j=0;ch!=' ';j++)
            {
                word=word+ch;
            }
            word_len = word.length();
            if(word_len > max_len)
            {
                max_len = word_len;
                w=word;
            }
        }
        System.out.println("LONGEST WORD : "+w);
        System.out.println("LENGTH = "+max_len);
    }
}