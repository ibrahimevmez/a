package atmMachine;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Account account = new Account("OsmanDgn","123456", 2000);

        atm.run(account);
        System.out.println("Exiting the Program...");



    }




}
