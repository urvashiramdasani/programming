class extra1
{
    public static void main(String args [])
    {
        String str="Urvashi Ramdasani";
        int count=0;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A')
            {
                count++;
            }
        }
        System.out.println("Length of String is "+l);
        if(count==0)
            System.out.println("Letter a is not present in your name.");
        else
        {
            System.out.println("Letter a present.");
            System.out.println("Number of occurences : "+count);
        }
    }
}