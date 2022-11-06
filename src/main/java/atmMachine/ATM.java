package atmMachine;

import java.util.Scanner;

public class ATM {
    public void run(Account account) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our bank....");

        System.out.println("****************************");
        System.out.println("User Login");
        System.out.println("****************************");
        int login_limit = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Welcome...");
                break;


            } else {
                System.out.println("Login Failed...");
                login_limit -= 1;
                System.out.println("Entry Right : " + login_limit);
            }
            if (login_limit == 0) {
                System.out.println("Too many failed login attempts...");

                return;

            }


        }

        System.out.println("*********************************");
        String islemler = "1. View Balance\n"
                + "2. Deposit\n"
                + "3. Withdraw money\n"
                + "Press q to exit";
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true) {
            System.out.println("Select the action you want to do : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                break;

            } else if (islem.equals("1")) {
                System.out.println("Your Balance : " + account.getBalance());
            } else if (islem.equals("2")) {

                System.out.print("The amount you want to deposit : ");
                int deposit = scanner.nextInt();
                scanner.nextLine();
                account.deposit(deposit);
                System.out.println("Your New Balance : " + account.getBalance());

            } else if (islem.equals("3")) {

                System.out.print("The amount you want to withdraw : ");
                int withdraw = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(withdraw);
                System.out.println("Your New Balance : " + account.getBalance());

            } else {

                System.out.println("Invalid Transaction....");
            }
        }
    }
}
