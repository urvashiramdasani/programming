import java.util.*;
class p7d
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a paragraph (Maximum 10 lines): ");
        str=sc.nextLine();
        String s[]=str.split("[.!?]");
        int count[]=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            count[i]=1;
        }
        for(int i=0;i<s.length;i++)         //trim function leading and trailing
        {                                   //space exclude
            for(int j=0;j<s[i].length();j++) // s[i].trim().split(" ")
            {
                if(s[i].charAt(j)==' ') count[i]++;
            }
        }
        for(int i=0;i<s.length;i++)
        {
            if(count[i]!=1) count[i]--;
        }
        for(int i=0;i<s.length;i++)
        {
            int d=i;
            while(d>0 && count[d]<count[d-1])
            {
                int temp=count[d];
                count[d]=count[d-1];
                count[d-1]=temp;
                String str_temp=s[d];
                s[d]=s[d-1];
                s[d-1]=str_temp;
                d--;
            }
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+"="+count[i]);
        }
    }
}