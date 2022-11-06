package atmMachine;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner input = new Scanner(System.in);
        System.out.println("Entry Your Username");
        String user_Name = input.next();
        System.out.println("Entry Your Password");
        String password = input.next();

        if (account.getUserName().equals(user_Name) && account.getPassword().equals(password)){
            return true;
        }else {return false;}







    }


}
