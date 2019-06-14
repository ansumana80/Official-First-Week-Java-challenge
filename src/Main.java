//Ansu J Rogers//
// Java Web Development Bootcamp//
// June 14, 2019//
//Good luck to me!

/*Week One Challenge: write an application that will show a list of numbers and indicate
whether or they they are prime numbers. Prime numbers are numbers only divisible by they selves with
no reminder*/

import java.util.Random;
public class Main {

    public static void main(String[] args) {


        int number = 0;
        int i = 2;
        boolean Prime = true;

        Random rand = new Random(); // generate a random number

        System.out.println("User Enter Any Random Number:");

        number = rand.nextInt(250) + 1; // random number between one and two



        {
            while (i <= number / 2)
            {
                if (number % i == 0)
                {
                    Prime = false;
                    break;
                }

            }
        }
        if (Prime){
            System.out.println(number + " is a Prime number");}
        else
        {System.out.println(number + " is not a Prime number");}

    }

}