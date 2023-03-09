package OO.Giro;

public class App {
    public static void main(String[] args) {

        BaseAccount BA = new BaseAccount();
        BA.withdraw(109);
        BA.withdraw(100);
        BA.getBalance();
        BA.deposit(999);

        CheckingsAccount CHA = new CheckingsAccount(100);
        CHA.deposit(100);
        CHA.withdraw(1000);

        CreditAccount CRA = new CreditAccount();

        SavingsAccount SA = new SavingsAccount();


    }
}
