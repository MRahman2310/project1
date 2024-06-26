package collegeoops;

import java.util.Scanner;

public class ATMMachine {
    public static class ATM{
        float balance;
        int PIN=5674;
        public  void checkpin()
        {
            System.out.println("Enter Your PIN");
            Scanner sc= new Scanner(System.in);
            int enteredpin=sc.nextInt();

            if(enteredpin==PIN)

            {
                menu();
            }
            else{
                System.out.println("Invalid PIN Please Entered a valid PIN");
                checkpin();
            }

        }
     public void    menu(){
         System.out.println("Enter your Choice:");
         System.out.println("1. check A/C Balence:");
         System.out.println("2. Withdraw Money:");
         System.out.println("3. Deposit Money");
         System.out.println("4. Exit");
         Scanner sc= new Scanner(System.in);
         int choice=sc.nextInt();
         if(choice==1)
         {
             checkbalence();
         }
        else if(choice==2)
         {
             withdrawmoney();
         }
        else if(choice==3)
         {
             depositmoney();
         }
        else if(choice==4)
         {
             return;
         }
        else{
            System.out.println("Invalid Choice Please Entered a valid Choice");
            menu();
         }
     }
     public void checkbalence()
     {
         System.out.println("Balence:"+ balance);
         menu();
     }
     public void withdrawmoney()
     {
         System.out.println("Enter Amount to Withdraw");
         Scanner sc= new Scanner(System.in);
         float amount=sc.nextFloat();
         if(amount>balance){
             System.out.println("Isuffissient Amount");

         }
         else {
             balance=balance-amount;
             System.out.println("Money Withdrawn Successffully:");
         }
         menu();
     }
      public void depositmoney()
      {
          System.out.println("Enter Amount to Deposit");
          Scanner sc= new Scanner(System.in);
          float depositamount=sc.nextFloat();
          balance=balance+depositamount;
          System.out.println("Money Deposited Successfully:");
          menu();

      }

    }
    public static void main(String[] args) {
    ATM atm=new ATM();
    atm.checkpin();
    }
}
