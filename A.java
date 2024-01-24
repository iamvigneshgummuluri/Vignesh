import java.util.Scanner;

abstract class bankAccount {
    String AccountHolderName = "Vignesh";
    long AccountNumber = 275910000;
    long AccountBalance = 100000;

    public abstract  void deposit();

    public abstract  void withdraw();

    public abstract  void currentbalance();
}
class A  extends bankAccount {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        A a=new A();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Choose 1 to deposit");
            System.out.println("Choose 2 to withdraw");
            System.out.println("Choose 3 to check current balance");
            System.out.println("Choose 4 to Exit");
            int b = sc.nextInt();
            switch (b) {
                case 1:
                    //Deposit code
                    a.deposit();

                    break;
                case 2:
                    //Withdraw code
                    a.withdraw();

                    break;
                case 3:
                    a.currentbalance();

                    break;
                case 4:
                    //Exit(don't write anything)
                    System.exit(0);

                    break;
                default:
                    System.out.println("Enter appropriate option!!");
                    break;
            }
        }
    }

    public void deposit() {

        System.out.println("Enter the amount to deposit");
        long b = sc.nextLong();
        AccountBalance += b;

    }


    public void withdraw() {

        System.out.println("Enter amount to Withdraw");
        long c = sc.nextLong();
        if (c > AccountBalance)
            System.out.println("Insufficient Balance");
        else
            AccountBalance -= c;

    }


    public void currentbalance() {

        System.out.println(AccountBalance);

    }

}
