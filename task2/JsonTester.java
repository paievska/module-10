package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.List;

public class JsonTester {
    public static void toJsonFile(String fileName){
        List<User> userList = User.readUserListFromFile("task2/file.txt");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(userList);
        try(FileWriter file = new FileWriter((fileName))){
            file.write(json);
        }catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
    }
}
