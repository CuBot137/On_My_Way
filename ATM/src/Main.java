import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    Scanner sc;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Stuff u1 = new Stuff();
        Stuff u2 = new Stuff();
        Random rnd = new Random();

        int count = 5;
        u2.name = "Simon";
        u2.pin = 123456;
        int tem = 0;
        u2.bal = 15000;

        System.out.println("Welcome!");
        System.out.println("1.New User");
        System.out.println("2.Already Have an Account");
        //CAN I SLAP A LOOP UP HERE THAT WILL GO THE MIDDLE OF THE CODE WITHOUT MESSING UP THE REST OF THE CODE.
        int q1 = sc.nextInt();
        if (q1 == 1) {
            System.out.print("Welcome please enter your name: ");
            u1.name = sc.next();
            u1.pin = rnd.nextInt(999999);
            System.out.println("Your new account pin is " + u1.pin);

            boolean b = 3 > 2;
            while (b == true) {
                System.out.println("Welcome " + u1.name);
                System.out.println("1. Withdraw ");
                System.out.println("2. Deposit ");
                System.out.println("3. Check Balance ");
                System.out.println("4. Exit  ");
                int action = sc.nextInt();

                //  boolean d = 3>2;
                // while ( d == true) {
                if (action == 1) {

                    System.out.println("1. Would Like To Withdraw?  ");
                    System.out.println("2. Cancel Transaction");
                    int action2 = sc.nextInt();
                    if (action2 == 1) {
                        System.out.println("How Much Would You Like To Withdraw?");
                        int amt = sc.nextInt();
                        u1.bal = u1.bal - amt;
                        if (amt < u1.bal)
                            System.out.println("You have withdrawn " + amt + " your new balance is " + u1.bal);
                        else
                            System.out.println("You currently do not have enough money in the account please try again");


                    }//else if (action2 == 2)
                    //  d = 3<2;
                    else
                        System.out.println("Invalid input try again");

                }


                // boolean c=3>2;
                //w//hile(c==true) {
                if (action == 2) {
                    System.out.println("1. Would you like to deposit?");
                    System.out.println("2. Cancel");
                    int action3 = sc.nextInt();
                    if (action3 == 1) {
                        System.out.println("How much would you like to deposit: ");
                        int dp = sc.nextInt();
                        u1.dpAmt = u1.dpAmt + dp;
                        u1.bal = u1.bal + dp;
                        System.out.println("You have deposited " + dp + " your total balance is " + u1.bal);
                    }// else if(action3 == 2) {
                    //c = 5 < 1;
                }
                if (action == 3) {
                    System.out.println("1. Check balance");
                    System.out.println("2. Cancel ");
                    int action4 = sc.nextInt();
                    if (action4 == 1)
                        System.out.println("Your current balance is " + u1.bal);
                    else if (action4 == 2)
                        System.out.println("");
                    else
                        System.out.println("Invalid Input");


                }
                if (action == 4) {
                    b = 3 < 2;
                }
            }
        } else if (q1 == 2) {
            boolean b = 3>2;
            while (b == true) {
                //LOOK AT THE COMMENT AT THE TOP
                    System.out.println("Enter your pin :");
                    System.out.println("Press 2 to exit");
                    tem = sc.nextInt();

                    if (tem == 2){
                        System.out.println("Exiting terminal\nGoodbye");
                        exit(0);}
                    if (tem != u2.pin) {
                        System.out.print("Wrong please try again ");
                        count -= 1;
                        System.out.println("You have " + count + " attempts remaining");
                    }

                if (count == 0)
                    exit(0);
            }
             b = 3 > 2;
            while (b == true) {
                System.out.println("Welcome " + u2.name);
                System.out.println("1. Withdraw ");
                System.out.println("2. Deposit ");
                System.out.println("3. Check Balance ");
                System.out.println("4. Exit  ");
                int action = sc.nextInt();

                //  boolean d = 3>2;
                // while ( d == true) {
                if (action == 1) {

                    System.out.println("1. Would Like To Withdraw?  ");
                    System.out.println("2. Cancel Transaction");
                    int action2 = sc.nextInt();
                    if (action2 == 1) {
                        System.out.println("How Much Would You Like To Withdraw?");
                        int amt = sc.nextInt();
                        u2.bal = u2.bal - amt;
                        if (amt < u2.bal)
                            System.out.println("You have withdrawn " + amt + " your new balance is " + u2.bal);
                        else
                            System.out.println("You currently do not have enough money in the account please try again");


                    }//else if (action2 == 2)
                    //  d = 3<2;
                    else
                        System.out.println("Invalid input try again");

                }


                // boolean c=3>2;
                //w//hile(c==true) {
                if (action == 2) {
                    System.out.println("1. Would you like to deposit?");
                    System.out.println("2. Cancel");
                    int action3 = sc.nextInt();
                    if (action3 == 1) {
                        System.out.println("How much would you like to deposit: ");
                        int dp = sc.nextInt();
                        u2.dpAmt = u2.dpAmt + dp;
                        u2.bal = u2.bal + dp;
                        System.out.println("You have deposited " + dp + " your total balance is " + u2.bal);
                    }// else if(action3 == 2) {
                    //c = 5 < 1;
                }
                if (action == 3) {
                    System.out.println("1. Check balance");
                    System.out.println("2. Cancel ");
                    int action4 = sc.nextInt();
                    if (action4 == 1)
                        System.out.println("Your current balance is " + u2.bal);
                    else if (action4 == 2)
                        System.out.println("");
                    else
                        System.out.println("Invalid Input");


                }
                if (action == 4) {
                    b = 3 < 2;
                }
            }
        }
    }
}





