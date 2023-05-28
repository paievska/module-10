package task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User- " + name + ", age- " + age;
    }
    public static List<User> readUserListFromFile(String fileName){
        List<User> userList = new ArrayList<>();
        try(var file = new FileReader(fileName); Scanner scan = new Scanner(file)){
            String line;
            line = scan.nextLine();
            while(scan.hasNextLine()){
                line = scan.nextLine();
                String words[] = line.split(" ");
                String name = words[0];
                int age = Integer.parseInt(words[1]);
                User user = new User(name, age);
                userList.add(user);
            }
        }catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        return userList;
    }
}
