import java.util.*;
import java.io.*;

class LengthExceedException extends Exception {
    public String toString() {
        return "Length Exceeded..";
    }
}
class InvalidStringException extends Exception {
    public String toString() {
        return "Last Character should be '.'";
    }
}

class sortString {
    public static void main(String args []) {   
        String str = new String();
        int flag;
        Scanner sc = new Scanner(System.in);
        do {
            flag = 0;
            try {
                System.out.println("Enter a String (max. 80 characters) : ");
                str = sc.nextLine();
                if(str.length()>80) throw new LengthExceedException();
                if(str.charAt(str.length()-1)!='.') throw new InvalidStringException();
                flag = 1;
            }
            catch(LengthExceedException lee) {
                System.out.println("Exception Caught : "+lee);
            } 
            catch(InvalidStringException ise) {
                System.out.println("Exception Caught : "+ise);
            }
        } while(flag!=1);
        String s[] = str.split(" ");
        s[s.length-1] = s[s.length-1].replace(".", " ");
        //System.out.println(s[s.length-1]);
        String output[] = new String [s.length];
        for(int i=0;i<s.length;i++) {
            s[i].trim();
            String s1 = s[i].substring(0,1).toUpperCase() + s[i].substring(1);
            output[i] = s1;
            //System.out.println(s1);
        }
        for(int i=0;i<output.length;i++) {
            for(int j=i+1;j<output.length;j++) {
                if(output[i].length()<output[j].length()) {
                    String temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
                else if(output[i].length()==output[j].length()) {
                    if(output[i].compareTo(output[j])>0) {
                        String temp = output[i];
                        output[i] = output[j];
                        output[j] = temp;
                    }
                }
            }
        }
        for(int i=0;i<output.length;i++) {
            System.out.println(output[i]);
        }
    }
}