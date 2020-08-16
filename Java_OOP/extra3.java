class X extends Thread {
    public void run() {
        for(int i=0;i<50;i++) {
            System.out.println(i);
        }
    }
}
class extra3 {
    public static void main(String args []) {
        Thread t = new Thread(new X());
        t.start();
    }
}