
/**
 * Program: Pig Latin 
 * File: PigLatin.java 
 * Summary: Reads text from an input file, and converts the text to Pig Latin 
 * Author: Evan W Wilson 
 * Date: October 22, 2017
 */

import java.io.FileReader; //import FileReader from in/out class
import java.io.BufferedReader; //import BufferedReader from in/out class

public class PigLatin {
//begin main class

    public static void main(String[] args) throws Exception {
        //begin main method, throws exceptions

        FileReader file = new FileReader("PigLatin.txt");
        //Ensure PigLatin.txt is in the same directory as PigLatin.java!
        BufferedReader reader = new BufferedReader(file);
        //loads PigLatin.txt file

        String[] words; //creates string array
        String input = reader.readLine(); //reads next word in the file
        words = input.split(" "); //splits the string
        String upperWord;
        String lowerWord;

        System.out.printf("%-20s%-20s\n", "Original", "PIG LATIN");
        System.out.println();
        //Prints collumns to designate original word and translated word
        //Prints blank line for readability

        for (String word : words) {
            lowerWord = word.toLowerCase(); //used for else if statement
            upperWord = word.toUpperCase(); //used to output uppercase translation
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                System.out.printf("%-20s%-20s\n", word, upperWord + "WAY ");
                //prints output to screen in tabular format if word starts with a vowel
            } else if (lowerWord.startsWith("bl") || lowerWord.startsWith("br") || lowerWord.startsWith("ch") || lowerWord.startsWith("cl")
                    || lowerWord.startsWith("cr") || lowerWord.startsWith("dr") || lowerWord.startsWith("fl") || lowerWord.startsWith("fr")
                    || lowerWord.startsWith("gl") || lowerWord.startsWith("gr") || lowerWord.startsWith("ph") || lowerWord.startsWith("pl")
                    || lowerWord.startsWith("pr") || lowerWord.startsWith("qu") || lowerWord.startsWith("sc") || lowerWord.startsWith("sh")
                    || lowerWord.startsWith("sk") || lowerWord.startsWith("sl") || lowerWord.startsWith("sm") || lowerWord.startsWith("sn")
                    || lowerWord.startsWith("sp") || lowerWord.startsWith("st") || lowerWord.startsWith("sw") || lowerWord.startsWith("th")
                    || lowerWord.startsWith("tr") || lowerWord.startsWith("tw") || lowerWord.startsWith("wh") || lowerWord.startsWith("wr")
                    || lowerWord.startsWith("sch") || lowerWord.startsWith("scr") || lowerWord.startsWith("spl") || lowerWord.startsWith("squ")
                    || lowerWord.startsWith("str") || lowerWord.startsWith("thr")) {
                //checks for all common english starting consonant clusters
                System.out.printf("%-20s%-20s\n", word, upperWord.substring(2) + upperWord.substring(0, 2) + "AY ");
                //prints output to screen in tabular format if word starts with consonant
            } else {
                //else if statement that identifies all common english consonant clusters
                System.out.printf("%-20s%-20s\n", word, upperWord.substring(1) + upperWord.substring(0, 2) + "AY ");
                //prints output to screen in tabular format if word starts with consonant cluster
            }
        }
    }

}
