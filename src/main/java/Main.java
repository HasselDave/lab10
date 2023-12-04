import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Danci danci = new Danci("jive");
        File file = new File("C:\\Users\\cti22c105\\IdeaProjects\\lab10\\Main.txt");
        objectMapper.writeValue(file,danci.figure);
        Danci abc= objectMapper.readValue(file,Danci.class);
        System.out.println(abc);
    }
}