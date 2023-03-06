package OO.Giro;

public class SavingsAccount extends BaseAccount {

    @Override
    public double withdraw(double amount) {
        if (getBalance() > amount) {
            double newBalance = getBalance() - amount;

            super.setBalance(newBalance);
            return newBalance;
        } else {
            System.out.println("Keine Auszahlung möglich!");
            return 0;
        }
    }
}
