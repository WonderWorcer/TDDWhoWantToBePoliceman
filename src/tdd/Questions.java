/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Роман
 */
public class Questions {
    static FileReader file;
    static BufferedReader buffer;
static String question , a, b, c, d, answer;
    public Questions() {
try
         {
            file = new FileReader("questions.txt"); // Initializes  the FileReader
            buffer = new BufferedReader(file); // Initializes the BufferedReader
         }
            catch (IOException e)
            {

            }
    }

    public String newQuestion() {

        try
         {
            question = buffer.readLine(); // Sets the value of question
         }
            catch (IOException e)
            {

            }
         return question;

    }
    public String qetAnswerA(){
        return "20";
    }
    public String qetAnswerB(){
        return "21";
    }
    public String qetAnswerC(){
        return "22";
    }
    public String qetAnswerD(){
        return "35";
    }
    public String qetRightAnswer(){
        return "c";
    }
}
