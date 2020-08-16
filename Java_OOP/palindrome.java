import java.util.*;

class palindrome {
    public static void main(String args []) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        int max_length=0,index;
        System.out.println("Enter a String : ");
        str = sc.next();
        String temp1 = new String(str);
        String temp = "";
        String final_str = "";
        for(int i=temp1.length()-1;i>=0;i--) {
            temp = temp+temp1.charAt(i);
        }
        //System.out.println(temp);
        for(int i=0;i<str.length();i++) {
            for(int j=i;j<str.length();j++) {
                String s1 = str.substring(i,j+1);
                String s2 = temp.substring(i,j+1);
                if(s1.equals(s2)) {
                    if(s1.length()>max_length) {
                        max_length = s1.length();
                        final_str = s1;
                    }
                }
            }
        }
        if(final_str.equals("")) System.out.println("No palindrome string found!");
        else System.out.println("Longest Palindrome Substring is "+final_str);
        sc.close();
    }
}