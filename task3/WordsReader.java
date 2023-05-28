package task3;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsReader {
    public static void calculateDublWords(String fileName){
        Map<String, Integer> words = new HashMap<>();
        try(var file = new FileReader(fileName); Scanner scan = new Scanner(file)){
            while(scan.hasNext()){
                String word = scan.next();
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }catch(Exception e){
            System.out.println("Error" + e);
        }
        for (Map.Entry<String, Integer> word:words.entrySet()) {
            System.out.println( word.getKey()+ " " + word.getValue());
        }
    }
}
