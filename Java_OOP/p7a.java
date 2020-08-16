import java.util.*;
class p7a
{
    public static void main(String args[])
    {
        String str="Nirma University";
        StringBuffer revstr=new StringBuffer(str);
        revstr.reverse();
        String str2=revstr.toString();
        System.out.println("Using inbuilt functions: ");
        System.out.println("Reversed string is "+str2);
        String newstr=str.replace("Ni","Ab");
        System.out.println("New String is "+newstr);
        boolean b1=str.contains("rma");
        boolean b2=str.contains("Uni");
        if(b1) System.out.println("rma is present");
        else System.out.println("rma is not present");
        if(b2) System.out.println("Uni is present");
        else System.out.println("Uni is not present");


        System.out.println("Using own method: ");
        String revstr2="";
        for(int i=str.length()-1;i>=0;i--)    
        {
            revstr2+=str.charAt(i);
        }
        System.out.println("Reversed string is "+revstr2);
        String ch1="A";
        String ch2="b";
        str=ch1+ch2+str.substring(2);   // substring(int i,int j)
        System.out.println("Modified String is "+str);  // provides string from ith character to (j-1)th character
        int flag1=0;
        for(int i=0;i<str.length()-1;i++)
        {
            int j=i+1;
            int k=i+2;
            if(str.charAt(i)=='r' && str.charAt(j)=='m' && str.charAt(k)=='a')
                flag1=1;
        }
        if(flag1==0) System.out.println("rma is not present");
        else System.out.println("rma is present");
        int flag2=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='U' && str.charAt(i+1)=='n' && str.charAt(i+2)=='i')
                flag2=1;
        }
        if(flag2==0) System.out.println("Uni is not present");
        else System.out.println("Uni is present");
    }
}