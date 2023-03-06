package OO.Giro;

public class CheckingsAccount extends BaseAccount {
    private int limit;

    public CheckingsAccount(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double amount){
        if (amount<limit){
            System.out.println("withdraw" + amount + "Euros");
            return super.withdraw(amount);
        }
        else {
            System.out.println("Das Limit wird überschritten! Keine Auszahlung möglich!");
            return 0;
        }
    }

}
