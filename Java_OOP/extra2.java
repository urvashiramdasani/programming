import java.util.Scanner;

class extra2
{
    public static void main(String args [])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of String array : ");
        n=sc.nextInt();
        if(n>10 || n<=1)
        {
            System.out.println("Invalid Entry!");
            System.exit(0);
        }
        String str[]=new String [n];
        System.out.println("Enter the Strings in array : ");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
            // sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            String s1=" ";
            if((i+1)%2!=0)
            {
                for(int j=0;j<str[i].length();j++)
                {
                    char ch=str[i].charAt(j);
                    if(ch==' ')
                        s1=s1+" ";
                    ch+=2;
                    s1=s1+ch;
                }
            }
            else
            {
                String s2[]=str[i].split(" ");
                for(int k=s2.length-1;k>=0;k--)
                {
                    s1=s1+s2[k]+" ";
                }
            }
            str[i]=s1;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}