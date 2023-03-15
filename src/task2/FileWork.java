package task2;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileWork {

    public static String userDir = System.getProperty("user.dir");
    static String fileForDelete = String.format("%s\\FileForDelete.txt", FileWork.userDir);

    public static List<String> fileReading (String filePathNames) {
        List<String> names;
        try {
            names = Files.lines(Paths.get(filePathNames)).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    //название метода не оторжает суть, лучше рендом лайн
    public static String randomName (List <String> name) {
        Random randomName = new Random();
        return name.get(randomName.nextInt(name.size()));
    }
    public static List<String> listFIOcreating(String filePathNames, String filePathMiddleNames, String filePathSecondNames, Integer number) {
        List<String> names = FileWork.fileReading(filePathNames);
        List<String> middleNames = FileWork.fileReading(filePathMiddleNames);
        List<String> secondNames = FileWork.fileReading(filePathSecondNames);
        List<String> resultList = new ArrayList<>();
        for (int i=0; i<number; i++) {
            String randomeName1 = randomName(names);
            String randomeMiddleName1 = randomName(middleNames);
            String randomeSecondName1 = randomName(secondNames);
            //String fomrmat
            String FIO1 = randomeSecondName1 + " " + randomeName1 + " " + randomeMiddleName1;
            resultList.add(FIO1);
        }
        return resultList;
    }

    public static void fileWriting(List<String> resultList) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-ms");
        String fileName = "NewFIO_" + dateFormat.format(new Date()) + ".txt";
        String newFile = String.format("%s\\" + fileName, System.getProperty("user.dir"));
        //newFileForDelete = newFile;
        File file = new File(newFile);
        try {
            file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Path path = Paths.get(file.getPath());
        try {
            Files.write(path, resultList, StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        File fileDelete = new File(FileWork.fileForDelete);
        Path pathDelete = Paths.get(fileDelete.getPath());
        try {
            FileChannel.open(Path.of(fileForDelete), StandardOpenOption.WRITE).truncate(0).close();
            Files.writeString(pathDelete, fileName, StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileDelete() {
        List<String> fileNames;
        try {
            fileNames = Files.lines(Paths.get(fileForDelete)).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String i: fileNames) {
            File file = new File(i);
            if(file.delete()){
                System.out.println(i + " файл удален");
            } else System.out.println("Файла " + i + " не обнаружено");
        }

    }





}
