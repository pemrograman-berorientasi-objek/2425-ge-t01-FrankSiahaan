package fintech.model;


/**
 * @author 12S23012 Genesis Tombak Dapot Tua Panjaitan
 * @author 12S23016 Frank Niroy Siahaan
 */
public class Transaction {

    // class definition
    private final int id;
    private final String account_name;
    private final Double amount;
    private final String date;
    private final String noted;
    private final Double balance;
    
    public Transaction(int _id, String _account_name, Double _amount, String _date, String _noted, Double _balance) {
        this.id = _id;
        this.account_name = _account_name;
        this.amount = _amount;
        this.date = _date;
        this.noted =  _noted;
        this.balance = _balance;
    }

    public String tostring() {
        return this.id+1 + "|" + this.account_name + "|" + this.amount + "|" + this.date + "|" + this.noted + "|" + this.balance;
    }

}