import java.util.*;

class NegativeAmount extends Exception {
    public String toString() {
        return "Negative Amount Not Allowed!";
    }
}
class InsufficientFunds extends Exception {
    public String toString() {
        return "You have Insufficient Funds in your Account!";
    }
}
class LowBalanceException extends Exception {
    public String toString() {
        return "Lower Balance than the Minimum!";
    }
}

class BankAccount
{
    int accNo;
    String custName;
    String accType;
    float balance;
    BankAccount(int accno,String cust_name,String acctype,float in_balance) 
    {
        if(in_balance<0) {
            try{
                throw new NegativeAmount();
            }
            catch(NegativeAmount na) {
                System.out.println("Caught : "+na);
            }
        }
        if(acctype.equals("Savings") && in_balance<1000){
            try {
                throw new LowBalanceException();
            }
            catch(LowBalanceException lbe) {
                System.out.println("Caught : "+lbe);
            }
        } 
        else if(acctype.equals("Current") && in_balance<5000){
            try {
                throw new LowBalanceException();
            }
            catch(LowBalanceException lbe) {
                System.out.println("Caught : "+lbe);
            }
        } 
        accNo=accno;
        custName=cust_name;
        accType=acctype;
        balance=in_balance;
    }
    void deposit(float amt) throws NegativeAmount
    {
        if(amt<0) throw new NegativeAmount();
        balance+=amt;
    }
    void withdraw(float amt) throws InsufficientFunds,NegativeAmount
    {
        if(amt<0) throw new NegativeAmount();
        balance-=amt;
        if(accType.equals("Savings") && balance<1000) throw new InsufficientFunds();
        else if(accType.equals("Current") && balance<5000) throw new InsufficientFunds();
    }
    float getBalance() throws LowBalanceException,NegativeAmount
    {
        if(balance<0) throw new NegativeAmount();
        if(accType.equals("Savings") && balance<1000) throw new LowBalanceException();
        else if(accType.equals("Current") && balance<5000) throw new LowBalanceException();
        return balance;
    }
}
class TestBankAccount
{
    public static void main(String args []) {
        int accnum,ch;
        String name = new String();
        String acc = new String();
        float bal,amnt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details: ");
        System.out.println("Account Number: ");
        accnum=sc.nextInt();
        System.out.println("Customer Name: ");
        name=sc.next();
        System.out.println("Account Type: ");
        acc=sc.next();
        System.out.println("Balance: ");
        bal=sc.nextFloat();
        BankAccount ba = new BankAccount(accnum, name, acc, bal);
        do {
            System.out.println("1. Deposit \n2. Withdraw \n3. Check Balance \n4. Quit");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter Amount to Deposit : ");
                        amnt=sc.nextFloat();
                        try {
                            ba.deposit(amnt);
                        }
                        catch(NegativeAmount na) {
                            System.out.println("Caught : "+na);
                        }
                        break;
                case 2: System.out.println("Enter Amount to Withdraw: ");
                        amnt=sc.nextFloat();
                        try {
                            ba.withdraw(amnt);
                        }
                        catch(NegativeAmount na) {
                            System.out.println("Caught : "+na);
                        }
                        catch(InsufficientFunds If) {
                            System.out.println("Caught : "+If);
                        }
                        break;
                case 3: try {
                            bal=ba.getBalance();
                        }
                        catch(LowBalanceException lbe) {
                            System.out.println("Caught : "+lbe);
                        }
                        catch(NegativeAmount na) {
                            System.out.println("Caught : "+na);
                        }
                        System.out.println("Your Current Balance: "+bal);
                        break;
                case 4: ch=4;
                        break;
                default: System.out.println("Invalid Choice!");
                        break;
            }
        } while(ch!=4);
    }
}