package OO.Giro;

public class CreditAccount extends BaseAccount {

    public double BalanceRequest() {
        if (getBalance() > -1) {
            System.out.println("Der Kontostand beträgt" + getBalance());
            return super.getBalance();

        }
        else {
        return 0;
        }


    }


}

