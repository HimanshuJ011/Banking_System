import java.util.Scanner;

class ATM{
    int PIN = 1000;
    float balance = 10000;

    public void checkPin(){
        System.out.print("Enter 4 Digits PIN :");
        Scanner in = new Scanner(System.in);
        int pin = in.nextInt();

        if(PIN == pin){
            System.out.println("-------------------WELCOME-----------------");
            menu();
        }
    }

    private void menu() {
        System.out.println();
        System.out.println("--------------------Enter Choices-------------------");
        System.out.println("1: Check Balance ");
        System.out.println("2: Withdraw Money ");
        System.out.println("3: Deposite Money ");
        System.out.println("4: EXIT  ");

        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();

        switch (opt){
            case 1 -> checkBalance();
            case 2 -> withdrawMoney();
            case 3 -> depositeMoney();
            case 4 -> {
                return;
            }
            default -> {
                System.out.println("Wrong Input");
                menu();
            }
        }
    }

    private void depositeMoney() {
        System.out.println("Enter Amount for Depositing");
        System.out.println();

        Scanner in = new Scanner(System.in);
        float amt = in.nextFloat();

        balance+=amt;
        System.out.println("Successfully Deposited");
        System.out.println();
        menu();
    }

    private void withdrawMoney() {
        System.out.println("Enter Amount for Withdraw :");
        System.out.println();

        Scanner in = new Scanner(System.in);
        float amt = in.nextFloat();

        if(amt>balance){
            System.out.println("Amount is Insufficient");
            System.out.println();

        }else{
            balance-=amt;
            System.out.println("Successfully Withdraw");
        }
        System.out.println();
        menu();
    }

    private void checkBalance() {
        System.out.print("Current Balance is " + balance);
        System.out.println();
        menu();
    }

}

public class ATM_MACHINE {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
