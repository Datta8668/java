
import java.util.Scanner;

class ATM{
    
    float Balance;
    int PIN = 1234;

    public void checkpoint(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            checkpoint();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1.Check A/C Balance:");
        System.out.println("Withdraw Money:");
        System.out.println("Deposite Money:");
        System.out.println("EXIT");


        Scanner sc = new Scanner (System.in);
        int opt = sc.nextInt(); 

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            WithdrawMoney();
        }
        else if(opt == 3){
            depositeMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid Choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance:"+ Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner (System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
           Balance = Balance - amount;
           System.out.println("Money Withdraw Successful");
        }
        menu();  
    }
    public void depositeMoney(){
        System.out.println("Enter Amount to Deposite: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class ATMMachine{
    public static void main (String [] args){


        ATM obj = new ATM();
        obj.checkpoint();
        


    }
}
