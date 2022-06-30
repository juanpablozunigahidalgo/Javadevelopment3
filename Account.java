
/*
   This class is used to store account details
 */
public class Account {
    //**Class Account**
    //
    //Create the following properties. properties should be private:
    //
    //    -accountNo  : int
    //    -balance    : double
    //    -status     : String
    //    -counter    : int static

    private int accountNo;
    private double balance;
    private String status;
    private static int counter=101;
    //Standard constructor.
    public Account(){
    }
    //Parametrized constructor.
    public Account(double balancee, String statuss) {
        accountNo=generateAccount();
        balance=balancee;
        status=statuss;

    }

    public boolean depositAmount(double amount) {
        boolean decision;
        if (status=="active"){
            decision = true;
            balance+=amount;
        } else {
            decision =false;
        }
        return decision;
    }

    public String getAccountDetails() {
        return "Account No "+accountNo+"\n Status :"+status+"\n Balance "+balance;
    }
    //here getters for all variables
    public static int getCounter() {
        return counter;
    }

    public int getAccountNo() {
        return accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public String getStatus() {
        return status;
    }

    // Here Setters for counter and status.
    public static void setCounter(int counter) {
    }
    public void setStatus(String status) {
        this.status = status;
    }
   public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    int generateAccount() {
        return counter++;
    }


}