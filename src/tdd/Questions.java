/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Роман
 */
public class Questions {

    static FileReader file;
    static BufferedReader buffer;
    static String question, a, b, c, d, answer;

    public Questions() {
        try {
            file = new FileReader("questions.txt"); // Initializes  the FileReader
            buffer = new BufferedReader(new InputStreamReader(new FileInputStream("questions.txt"),"Cp1251")); // Initializes the BufferedReader
        } catch (IOException e) {

        }
    }

    public String newQuestion() {

        try {
            question = buffer.readLine(); // Sets the value of question
        } catch (IOException e) {

        }
        return question;

    }

    public String qetAnswerA() {
        try {
            a = buffer.readLine(); // Sets the value of a
        } catch (IOException e) {

        }
        return a;
    }

    public String qetAnswerB() {
        try {
            b = buffer.readLine(); // Sets the value of b
        } catch (IOException e) {

        }
        return b;
    }

    public String qetAnswerC() {
        try {
            c = buffer.readLine(); // Sets the value of c
        } catch (IOException e) {

        }
        return c;
    }

    public String qetAnswerD() {
        try {
            d = buffer.readLine(); // Sets the value of d
        } catch (IOException e) {

        }
        return d;
    }

    public String qetRightAnswer() {
        try {
            answer = buffer.readLine(); // Sets the value of answer
        } catch (IOException e) {

        }
        return answer;
    }
}
