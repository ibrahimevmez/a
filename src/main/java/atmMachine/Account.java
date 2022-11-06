package atmMachine;

public class Account {
    private String userName;
    private String password;
    private int balance;

    public Account(String userName, String password, int balance){
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public int getBalance(){
        return balance;
    }

    public void setUserName(String userName){
            this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int deposit){
        balance += deposit;
    }
    public void withdraw(int withdraw){
        if (balance < withdraw){
            System.out.println("Insufficient Balance");
        }else balance -= withdraw;
    }


}
