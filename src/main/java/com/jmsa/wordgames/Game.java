/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmsa.wordgames;

import wordgames.clases.jmsa.WordGames;

/**
 *
 * @author jmsa
 */
public class Game
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        WordGames wg=new WordGames();
        wg.anagram("loa", "ola");
    }
    
}
