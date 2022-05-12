class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(525, "checking");
        account1.deposit(1021, "savings");
        account1.withdraw(100, "checking");
        System.out.println("account1 " + account1.getCheckingAndSaving());

        BankAccount account2 = new BankAccount();
        account2.deposit(462, "checking");
        account2.deposit(252, "savings");
        account2.withdraw(400, "checking");
        System.out.println("account2 " + account2.getCheckingAndSaving());
    }
}
