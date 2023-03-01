package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;

public class FileWork {

    public static ArrayList<String> fileReading (String parthname) {

        File file = new File(parthname);
        ArrayList <String> name = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                name.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(name);
        }
        return name;
    }

    public static String randomName (ArrayList <String> name) {
        Random randomName = new Random();
        return name.get(randomName.nextInt(name.size()));
    }

}
