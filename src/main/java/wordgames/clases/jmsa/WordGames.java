/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgames.clases.jmsa;

/**
 *
 * @author jmsa
 */
public class WordGames
{
/*¿está bien trabajar con arrays de char o mejor con strings?
 */
    
    public WordGames()
    {
    }
    /*isogram (en español existe isograma, pero no tiene nada que ver), palabra 
    o texto en el que cualquiera de sus letras sólo aparece una vez
    */
    public boolean isogram(char []words)
    {
        return false;
    }
    
    /*pangram, palabra o frase que contiene todas las letras del abecedario    
    */
    public boolean pangram(char []words)
    {
        return false;
    }    
    /*palindrome, palabra, sentencia o escrito más largo, que se lee igual del 
    derecho y del revés
    */
    public boolean palindrome(char []words)
    {
        return false;
    }
    /*kangarooWord, palabra que contiene a otra en su interior*/
    public boolean kangarooWord(char []words, char []wordToSearch)
    {
        return false;
    }        
    /*devuelve TRUE si la palabra o palabras pasdas a la función, son un lipograma;
    es decir un texto que evita usar alguna letra deliveradamente
    */
    public boolean lipogram(char []words)
    {
        return false;
    }   
    /*devuelve TRUE si las dos palabras que se le pasan son anagramas, es decir
    utilizan las mismas letras pero cambiadas de orden
    */
    public boolean anagram( String word1, String word2)
    {
        String w1=word1.replace("\\s", "").toLowerCase();
        String w2=word2.replace("\\s", "").toLowerCase();
        for(int i=0;i<w1.length();i++)
        {
            System.out.print("char at ");
            System.out.print(i);
            System.out.print(" ");
            System.out.println(w1.charAt(i));
            System.out.println(w2.charAt(i));
        }
   
        
        return false;
    }        
    
}
