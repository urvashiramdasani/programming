class Storage {
    int num;
    int getValue() {
        return num;
    }
    void setValue(int i) {
        num = i;
    }
}
class Printer extends Thread {
    Storage s = new Storage();
    Printer(Storage st) {
        s = st;
    }
    public void run() {
        try {
            synchronized(s){
                while(s.getValue()<10) {
                    System.out.println("Printer prints : "+s.getValue());
                    s.notify();
                    s.wait();
                }
            }
        }
        catch(InterruptedException ie) {
            System.out.println("Caught : "+ie);
        }
    }
}
class Counter extends Thread {
    Storage s = new Storage();
    Counter(Storage st) {
        s = st;
    }
    public void run() {
        try {
            synchronized(s) {
                for(int i=0;i<10;i++) {
                    System.out.println("Counter set..."+i);
                    s.setValue(i);
                    s.notify();
                    s.wait();
                }
            }
        }
        catch(InterruptedException ie) {
            System.out.println("Caught : "+ie);
        }
    }
}
class TestSCP {
    public static void main(String args []) {
        Storage s = new Storage();
        Thread c = new Thread(new Counter(s));
        Thread p = new Thread(new Printer(s));
        c.start();
        p.start();
    }
}