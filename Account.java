import java.util.Scanner;

class Info extends ATM{
    long AccNo = 63701010001722L;
    int PIN = 9999;

    public void checkIn(){
        System.out.print("Enter Your Account Number :");
        Scanner in = new Scanner(System.in);
        long acc = in.nextLong();

        if(acc == AccNo){
            validate();
        }else{
            System.out.println("WRONG INPUT ");
            System.out.println();
            checkIn();
        }
    }
    private void validate(){
        System.out.print("Enter Login PIN :");
        Scanner in = new Scanner(System.in);
        int pin = in.nextInt();

        if(PIN == pin){
            System.out.println("----------------SUCCESSFULLY ENTERD INTO ACCOUNT---------- ");
            System.out.println();
            checkPin();
        }else{
            System.out.println("Plase Enter Valid PIN :");
            validate();
        }

    }
}
public class Account {
    public static void main(String[] args) {
        Info a = new Info();
        a.checkIn();
    }
}
