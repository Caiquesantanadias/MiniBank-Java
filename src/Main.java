public class Main {

    public static void main (String[] args) {

        Account bobsAccount = new Account();
        bobsAccount.withdrawFunds(100.5);

        bobsAccount.depositFunds(50);
        bobsAccount.withdrawFunds(10);
    }
}
