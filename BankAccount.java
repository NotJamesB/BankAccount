public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    public static int numberOfAccounts = 0;
    public static double totalAmountOfMoney = 0;
    // constructor
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts = numberOfAccounts + 1;
    }
    // main methods 
    public void deposit(double amount, String account ){
        if(account.equals("checking")){
        this.checkingBalance += amount ;
        System.out.println("You have successfully deposited " + amount + " Into your checking account!");
        }
        else if(account.equals("savings")){
        this.savingsBalance += amount ;
        System.out.println("You have successfully deposited " + amount + " Into your Savings account!");
        }
        this.totalAmountOfMoney += amount;
    }
    public void withdraw(double amount, String account ){
        if(account.equals("checking")){
        double total = this.checkingBalance -= amount;
        this.totalAmountOfMoney -= amount;
        System.out.println("You have successfully withdrawn " + amount);
            if(total < 0){
                this.checkingBalance += amount;
                this.totalAmountOfMoney += amount;
                System.out.println("Insufficent funds! You have been refunded " + amount);
            }
        }
        else if(account.equals("savings")){
        double savingsTotal = this.savingsBalance - amount;
        this.totalAmountOfMoney -= amount;
        System.out.println("You have successfully withdrawn " + amount);
            if(savingsTotal < 0){
                this.totalAmountOfMoney += amount;
                this.savingsBalance += amount;
                System.out.println("Insufficent Funds! You have been refunded " + amount);
            }
        }
    }
    // getters and setters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public String getCheckingAndSaving(){
        return "Your checking balance is: " + this.checkingBalance + " and you Savings balance is: " + this.savingsBalance;
    }
    public int getNumberOfAccounts(){
        return numberOfAccounts;
    }
}
