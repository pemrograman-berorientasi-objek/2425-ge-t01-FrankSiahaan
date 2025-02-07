package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;
/**
 * @author 12S23012 Genesis Tombak Dapot Tua Panjaitan
 * @author 12S23016 Frank Niroy Siahaan
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        String owner = input.nextLine();
        String account_name = input.nextLine();
        Double balance = 0.0;

        Account new1 = new Account(owner,account_name,balance);

        System.out.println(new1.toString());

        input.close();


    }
}