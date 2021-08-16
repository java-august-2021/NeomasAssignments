public class BankAccountTest {
    public static void main(String[] args){
        BankAccount user1 = new BankAccount(2495, 9000);
        System.out.println(user1.getBalance("checking"));
        System.out.println(user1.getBalance("savings"));
        System.out.println(user1.seeEntireBalance());
        user1.makeDeposit("savings", 32.24);
        System.out.println(user1.getBalance("savings"));
        user1.makeWithdrawl("checking", 3000);
    }
}
