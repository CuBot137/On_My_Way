import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 10;
        int guess = 0;
        int count = 1;

        System.out.print("Enter your name : ");
        String name = sc.next();

        int ranNum = (int) Math.floor(Math.random() * (max - min + 1) + min);

        //System.out.print("Alright " + name + " guess a number between 1 and 10 : ");
        //int guess = sc.nextInt();
         while (guess!= ranNum){
            System.out.print("Alright " + name + " guess a number between 1 and 10 : ");
            guess = sc.nextInt();
            if (guess == ranNum){
                break;}
            else{
                System.out.println("Wrong try again!");
                count ++;
            }

        }
        System.out.println("Congrats "+ name+ " your guess of " + ranNum + " is correct.");
        System.out.println("You guessed it in " + count + " goes!!");


    }
}