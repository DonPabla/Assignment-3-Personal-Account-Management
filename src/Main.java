public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Bakhapov Yryskeldi");
        account.deposit(9000);
        account.deposit(500);
        account.withdraw(1200);
        account.printTransactionHistory();
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}