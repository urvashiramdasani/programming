import java.io.*;
import java.util.*;

class BlankFieldException extends Exception {
    public String toString() {
        return "Cannot have Blank Field in this member...!!!";
    }
}

class Details implements java.io.Serializable {
    int roll;
    String name;
    int age;
    String Address;
    char choice;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your Roll No. : ");
            roll = sc.nextInt();
            System.out.println("Enter Your Name : ");
            sc.nextLine();
            name = sc.nextLine();
            name.trim();
            if(name.isEmpty()) throw new BlankFieldException();
            System.out.println("Enter Age : ");
            age = sc.nextInt();
            System.out.println("Enter your Address : ");
            sc.nextLine();
            Address = sc.nextLine();
            Address.trim();
            if(Address.isEmpty()) throw new BlankFieldException();
            System.out.println("You want to store this in file?");
            System.out.println("Enter Y to Enter and N to Exit : ");
            choice = sc.next().charAt(0);
        }
        catch(InputMismatchException ime) {
            System.out.println("Not a Digit...!!!");
        }
        catch(BlankFieldException bfe) {
            System.out.println("Caught : "+bfe);
        }
    }
    public static void main(String args[]) {
        Details d = new Details();
        d.getdata();
        if(d.choice=='y' || d.choice=='Y'){
            try {
                FileOutputStream fout = new FileOutputStream("C:/Users/Urvashi/Desktop/II Year/Programs/OOP/Stud_Data.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.writeObject(d);
                oos.close();
                fout.close();
            }
            catch(IOException e) {
                System.out.println("Caught : "+e);
            }
            Details d1 = null;
            try {
                FileInputStream fin = new FileInputStream("C:/Users/Urvashi/Desktop/II Year/Programs/OOP/Stud_Data.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
                d1 = (Details) ois.readObject();
                ois.close();
                fin.close();
                System.out.println("Roll No. : "+d1.roll);
                System.out.println("Name : "+d1.name);
                System.out.println("Age : "+d1.age);
                System.out.println("Address : "+d1.Address);
            }
            catch(IOException e) {
                System.out.println("Caught : "+e);
            }
            catch(ClassNotFoundException cfe) {
                System.out.println("Caught : "+cfe);
            }
        }
    }
}