/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgames.clases.jmsa;

import static org.testng.Assert.*;

/**
 *
 * @author jmsa
 */
public class WordGamesNGTest
{
    
    public WordGamesNGTest()
    {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception
    {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception
    {
    }

    /**
     * Test of pangram method, of class WordGames.
     */
    @org.testng.annotations.Test
    public void testPangram()
    {
        System.out.println("pangram");
        char[] words = null;
        WordGames instance = new WordGames();
        boolean expResult = false;
        boolean result = instance.pangram(words);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of palindrome method, of class WordGames.
     */
    @org.testng.annotations.Test
    public void testPalindrome()
    {
        System.out.println("palindrome");
        char[] words = null;
        WordGames instance = new WordGames();
        boolean expResult = false;
        boolean result = instance.palindrome(words);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kangarooWord method, of class WordGames.
     */
    @org.testng.annotations.Test
    public void testKangarooWord()
    {
        System.out.println("kangarooWord");
        char[] words = null;
        char[] wordToSearch = null;
        WordGames instance = new WordGames();
        boolean expResult = false;
        boolean result = instance.kangarooWord(words, wordToSearch);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lipogram method, of class WordGames.
     */
    @org.testng.annotations.Test
    public void testLipogram()
    {
        System.out.println("lipogram");
        char[] words = null;
        WordGames instance = new WordGames();
        boolean expResult = false;
        boolean result = instance.lipogram(words);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
