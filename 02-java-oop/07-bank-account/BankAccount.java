public class BankAccount {
    // object attributes
    public double checkingBalance;
    public double savingsBalance;

    // class attributes
    private static int accountsCreated;
    private static int numPatrons;
    private static double totalBankMoney;
    private static String invalidAccount = "Please enter a valid account name";
    private static String overdrawnMessage = "You do not have enough money in your account to complete this transaction.";
    
    // constructors
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        accountsCreated+=2;
        numPatrons++;
        totalBankMoney+=checkingBalance + savingsBalance;
    }

    // getters
    public double getBalance(String accountName){

        if(accountName.equals("checking")){
            return checkingBalance;
        } else if (accountName.equals("savings")) {
            return savingsBalance;
        } else { 
            System.out.println(invalidAccount);
            return 0;
        }
    }

    public double seeEntireBalance(){
        return this.checkingBalance+this.savingsBalance;
    }

    // setters
    public void makeDeposit(String accountName, double depositTotal) {
        if(accountName.equals("checking")){
            checkingBalance+=depositTotal;
        } else if (accountName.equals("savings")) {
            savingsBalance+=depositTotal;
        } else {
            System.out.println(invalidAccount);
        }
    }

    public void makeWithdrawl(String accountName, double withdrawlTotal){
        if(accountName.equals("checking")){
            if(withdrawlTotal>this.checkingBalance){
                System.out.println(overdrawnMessage);
            } else {
                checkingBalance-=withdrawlTotal;
            }  
            
        } else if (accountName.equals("savings")) {
            if(withdrawlTotal>this.savingsBalance){
                System.out.println(overdrawnMessage);
            } else {
                savingsBalance-=withdrawlTotal;
            }     
        } else {
            System.out.println(invalidAccount);
        }
    } 
}


