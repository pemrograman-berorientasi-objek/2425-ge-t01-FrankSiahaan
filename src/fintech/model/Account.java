package fintech.model;

/**
 * @author 12S23012 Genesis Tombak Dapot Tua Panjaitan
 * @author 12S23016 Frank Niroy Siahaan
 */
public class Account {

    // class definition
    private final String owner;
    private final String account_name;
    private final double balance;

    public Account(String _owner, String _account_name, double _balance) {
        this.owner = _owner;
        this.account_name = _account_name;
        this.balance = _balance;
    }

    @Override
    public String toString() {
        return this.account_name + "|" + this.owner + "|" + this.balance;
    }
}