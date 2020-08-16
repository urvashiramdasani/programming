import java.io.*;

class SearchString extends Thread{
    String str;
    int flag = 0;
    SearchString(String str) {
        this.str = str;
    }
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Urvashi/Desktop/II Year/Programs/OOP/test1.txt"));
            String line = br.readLine();
            while(line!=null) {
                String s[] = line.split(" ");
                for(int i=0;i<s.length;i++){
                    if(str.equals(s[i])) {
                        flag = 1;
                        break;
                    }
                }
                line = br.readLine();
            }
            if(flag==0) System.out.println("Not Found : "+str);
            if(flag==1) System.out.println("Found : "+str);
        }
        catch(IOException e) {
            System.out.println("Caught : "+e);
        }
    }
    public static void main(String args []) {
        Thread t1 = new Thread(new SearchString(args[0]));
        Thread t2 = new Thread(new SearchString(args[1]));
        Thread t3 = new Thread(new SearchString(args[2]));
        Thread t4 = new Thread(new SearchString(args[3]));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}