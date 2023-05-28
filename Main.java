import task1.PhoneNumbers;
import task2.JsonTester;
import task3.WordsReader;

public class Main {
    public static void main(String[] args) {
        //Display task1
        PhoneNumbers.validNumber("task1/file.txt");
        //Display task2
        JsonTester.toJsonFile("task2/user.json");
        //Display task3
        WordsReader.calculateDublWords("task3/words.txt");
    }
}
