/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Роман
 */
public class QuestionsTest {
    
    public QuestionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {

    }
    
    @Test
    public void newQuestionTest(){
        Questions question = new Questions();
        boolean answer;
        //answer = question.newQuestion("Статья 322 уголовного кодекса",1);
        //assertTrue(answer);
    }
    @Test
    public void LoadQuestionTest(){
        Questions question = new Questions();
        String expQuest = "Сколько лет исполняется Конституции Российской Федерации в 2015 году?";
        assertEquals(expQuest,question.newQuestion());
        
    }
    
    @Test
    public void LoadAnswerATest(){
        Questions question = new Questions();
        String expAnswer = "20";
        assertEquals(expAnswer,question.qetAnswerA());
        
    }
    @Test
    public void LoadAnswerBTest(){
        Questions question = new Questions();
        String expAnswer = "21";
        assertEquals(expAnswer,question.qetAnswerB());
        
    }
    @Test
    public void LoadAnswerCTest(){
        Questions question = new Questions();
        String expAnswer = "22";
        assertEquals(expAnswer,question.qetAnswerC());
        
    }
    @Test
    public void LoadAnswerDTest(){
        Questions question = new Questions();
        String expAnswer = "35";
        assertEquals(expAnswer,question.qetAnswerD());
        
    }
    public void LoadRightAnswer(){
        Questions question = new Questions();
        String expAnswer = "c";
        assertEquals(expAnswer,question.qetRightAnswer());
    }
    public void LoadQuestionWithAnswers(){
        Contest contest = new Contest();
        boolean expResult;
              expResult  = contest.startTest();
        assertTrue(expResult);
    }
    public void LoadQuestionFromFile(){
        Questions question = new Questions();
        String expQuest = "Сколько лет исполняется Конституции Российской Федерации в 2015 году?";
        assertEquals(expQuest,question.newQuestion());
    }
}
