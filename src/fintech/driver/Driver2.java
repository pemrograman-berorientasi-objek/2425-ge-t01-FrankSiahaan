package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;
/**
 * @author 12S23012 Genesis Tombak Dapot Tua Panjaitan
 * @author 12S23016 Frank Niroy Siahaan
 */
public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        String owner = input.nextLine();
        String account_name = input.nextLine();
        Double balance = 0.0;

        Account new1 = new Account(owner,account_name,balance);
        System.out.println(new1.toString());

        command = input.nextLine();
        account_name = input.nextLine();
        Double amount = input.nextDouble();
        input.nextLine();
        String date = input.nextLine();
        String noted = input.nextLine();
        
        int id = 1;
        balance = balance + amount;

        Transaction new2 = new Transaction(id, account_name, amount, date, noted, balance);
        System.out.println(new2.tostring());
        input.close();
    }
}