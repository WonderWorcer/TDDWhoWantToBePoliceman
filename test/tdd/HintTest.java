/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

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
public class HintTest {

    public HintTest() {
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
    public void TestFSBCall() {
        Hint hint= new Hint();
        boolean expResult = hint.isIsUseFCBCall();
        assertTrue(expResult);
        hint.useFSBCall();
        expResult = hint.isIsUseFCBCall();
        assertFalse(expResult);
    }
    @Test
    public void TestCallWitnesses() {
        Hint hint= new Hint();
        boolean expResult = hint.isIsCallWitnesses();
        assertTrue(expResult);
        hint.useCallWitnesses();
        expResult = hint.isIsCallWitnesses();
        assertFalse(expResult);
    }
}
