import java.util.*;

class LowSalException extends Exception {
    public String toString() {
        return "Low Salary than 500...!!!";
    }
}

class Emp {
    int empId;
    String empName;
    String designation;
    double basic;
    double hra;
    Emp(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        if(this.basic<500) {
            try {
                throw new LowSalException();
            }
            catch (LowSalException lse) {
                System.out.println("Caught : "+lse);
            }
        }
    }
    void printDET() {
        System.out.println("Loading Employee Details...");
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Designation : "+designation);
        System.out.println("Employee Basic : "+basic);
        System.out.println("Employee HRA : "+hra);
    }
    void calculateHRA() {
        if(designation.equalsIgnoreCase("Manager")) {
            hra = 0.1*basic;
        }
        else if(designation.equalsIgnoreCase("Officer")) {
            hra = 1.2*basic;
        }
        else if(designation.equalsIgnoreCase("Clerk")) {
            hra = 0.5*basic;
        }
        else System.out.println("Designation Not Found...!!!");
    }
}
class TestEmp {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int empId;
        String empName = new String();
        String designation = new String();
        double basic;
        System.out.println("Enter ID : ");
        empId = sc.nextInt();
        System.out.println("Enter Name : ");
        empName = sc.next();
        System.out.println("Enter Designation : ");
        designation = sc.next();
        System.out.println("Enter Basic : ");
        basic = sc.nextDouble();
        Emp e = new Emp(empId, empName, designation, basic);
        e.calculateHRA();
        e.printDET();
    }
}