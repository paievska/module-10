package task1;

import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumbers {
    public static void validNumber(String fileName){
        try(var file = new FileReader(fileName); Scanner scan = new Scanner(file)){
            Pattern pattern1 = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
            Pattern pattern2 = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(pattern1.matcher(line).matches() || pattern2.matcher(line).matches()){
                    System.out.println(line);
                }
            }
        }catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
