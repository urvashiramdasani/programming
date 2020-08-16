import java.io.*;

class demo extends Thread{
    String filename;
    demo(String filename) {
        this.filename = filename;
    }
    public void run() {
        BufferedReader br = null;
        try {
            //synchronized(filename){
                br = new BufferedReader(new FileReader(filename));
                String line = br.readLine();
                while(line!=null){
                System.out.println(line);
                //Thread.sleep(2000);
                line = br.readLine();
                }
            //}
        }
        catch(IOException e) {
            System.out.println("Caught : "+e);
        }
         //catch(InterruptedException ie) {
           //  System.out.println("Caught : "+ie);
         //}
        finally {
            try {
                if(br!=null) br.close();
            }
            catch(IOException e) {
                System.out.println("Error Closing Input File...");
            }
        }
    }
}

class p10e extends Thread {
    public static void main(String args []) {
        if(args.length!=2) {
            System.out.println("Usage : p10d filename1 filename2");
            return;
        }
        demo d1 = new demo(args[0]);
        demo d2 = new demo(args[1]);
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread.currentThread().getName();
        Thread.currentThread().setPriority(10);
         t1.setPriority(NORM_PRIORITY+2);
         t2.setPriority(NORM_PRIORITY-2);
        t1.start();
        t2.start();
    }
}