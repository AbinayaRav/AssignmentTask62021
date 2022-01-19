import java.util.Scanner;

public class ARQuestion5 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*********************************************** Welcome to the savings transactions ***********************************************************");
        int caseNo;
        boolean flag = true;
        while (true) {
            System.out.println("What do you wish to perform ?: \n 1. Add amount to your savings box. \n 2. View Number of Transactions \n 3. Exit");
            caseNo = scan.nextInt();
            Addamount addamt;
            switch (caseNo) {
                case 1: {
                    System.out.println("Please enter the amount to be added to your Saving box: ");
                    double addAmountValue = scan.nextDouble();
                    if (addAmountValue > 0)
                        addamt = new Addamount(addAmountValue);
                    else
                        addamt = new Addamount();
                    count++;
                    System.out.println("The amount currently available in your savings box is : " + addamt.getAmount());
                    break;
                }
                case 2: {
                    System.out.println("The number of transactions made so far is : " + count);
                    break;
                }
                case 3: {
                    System.out.println("Do you wish to exit? (Y?N) ");
                    if (Character.toUpperCase(scan.next().charAt(0)) == 'Y') {
                        System.out.println("***********THANK YOU************");
                        flag = false;
                        break;
                    }
                  break;
                }
            }
            if (flag == false)
                break;
        }
    }
}

class Addamount {
    private double amount = 50;

    public Addamount() {
    }

    public Addamount(double amount) {
        this.amount += amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
