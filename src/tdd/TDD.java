/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.Scanner;

/**
 *
 * @author Роман
 */
public class TDD {

    static Questions questionclass = new Questions(); // Initialize the questionclass object

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 500, values[] = new int[]{500, 1000, 2000, 5000, 10000, 20000, 50000, 75000, 150000, 250000, 500000, 1000000}, money[] = new int[4], winnervalue = 0, count = 0;
        String question = "", a = "", b = "", c = "", d = "", answer = "", hint = "", response = "";
        boolean rightwrong = false, quit = false;
        System.out.println("\t\t-----------------------------");
        System.out.println("\t\tКто хочет стать миллиционером");
        System.out.println("\t\t-----------------------------");

        count = 0;
        quit = false;
        value = 500; // Initializes value as the first value, $500

        do // Do while loop for the questions until the player chooses to quit or gets a question wrong
        {
            if (value == 500) {
                System.out.println("Приветствую" + ", Ваша очередь доказать, что Вы настоящий миллиционер\n"); // Outputs a player's name and introduction to the game
            }
            question = questionclass.newQuestion(); // Initializes Question
            System.out.println("Вопрос за $" + value + "....... " + question);

            a = questionclass.qetAnswerA(); 
            System.out.println(a);

            b = questionclass.qetAnswerB();
            System.out.println(b);

            c = questionclass.qetAnswerC(); 
            System.out.println(c);

            d = questionclass.qetAnswerD(); 
            System.out.println(d);

            answer = questionclass.qetRightAnswer(); // Intialize the answer

            do // Do while to check the response of the contestant and to ensure they enter a valid option
            {
                System.out.print("Введите ваш ответ: ");
                response = scanner.nextLine(); // Gets the input of the user
                response = response.toLowerCase(); // Changes the input to lowercase
                if (response.charAt(0) < 97 || response.charAt(0) > 102) // Check to see if the value is between a and f
                {
                    System.out.println("Введите ответ верно!");
                }
            } while ((response.charAt(0) < 97 || response.charAt(0) > 102) || (response.compareTo("e") == 0) || (response.compareTo("f") == 0 && value == 500));

            if (response.compareTo("f") == 0 && value != 500) // Checks to see if the user wants to quit, then it outputs a thank you statement and quits the game for that user.
            {
                System.out.println("Спасибо за игру!");
                quit = true; // Boolean to tell the game to end for that user
            }
            if (response.compareTo(answer) == 0) // Checks to see if the question is correct
            {
                rightwrong = true;
            } else // Otherwise it keeps the variable as false and shows that they did not answer correctly
            {
                rightwrong = false;
            }
            if (rightwrong == true && value != 1000000) // Outputs if they are correct or not while it is not the last question
            {
                System.out.println("\nОтлично! " + answer + " правильный ответ!\n");
                value = values[count + 1];
            } else if (rightwrong == true && value == 1000000) // Outputs if they are corect or not while it is the last question
            {
                System.out.println("Поздравляю!!!! Вы стали миллиционером!\n");
                rightwrong = false;
            } else if (rightwrong == false && response.compareTo("f") != 0) // Checks to see if they have not chosen to leave the game and got the question right or wrong
            {
                System.out.println("\nИзвините, но вы не правы! Правильный ответ: " + answer);
                System.out.println("Вы уходите домой с $" + value +"и при этом вы не стали миллиционером"+"\n");
            } else if (rightwrong == false && response.compareTo("f") == 0) // Checks to see if they have chosen to leave the game
            {
                System.out.println("\nYou have decided to leave the game! The correct answer was: " + answer);
                System.out.println("Вы уходите домой с $" + value +"и при этом вы не стали миллиционером"+"\n");
            }
            count++; // Increases the count
        } while (rightwrong != false && value <= 1000000 && quit != true); // End of Do While Loop

    }

}
