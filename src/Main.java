import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder massage = new StringBuilder();


        // Создание папки scr и main
        File fileSrcMain = new File("C://Games/src/main");
        if (fileSrcMain.mkdirs()) {
            massage.append("Ready, folder - src/main - created \n");
        } else massage.append("Error, folder - src/main - not created \n");


        // Создание папки test
        File fileSrcTest = new File("C://Games/src/test");
        if (fileSrcTest.mkdir()) {
            massage.append("Ready, folder - src/test - created \n");
        } else massage.append("Error, folder - src/test - not created \n");


        // Создание файла Main.java
        File fileMain = new File(fileSrcMain, "Main.java");
        try {
            if (fileMain.createNewFile()) {
                massage.append("Ready, file - Main.java - created \n");
            } else massage.append("Error, file - Main.java - not created \n");
        } catch (IOException ex) {
            massage.append(ex);
        }
        // Создание файла Utils.java
        File fileUtils = new File(fileSrcMain, "Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                massage.append("Ready, file - Utils.java - created \n");
            } else massage.append("Error, file - Utils.java - not created \n");
        } catch (IOException ex) {
            massage.append(ex.getMessage());
        }

        // Создание папки res и drawables
        File fileResDrawables = new File("C://Games/res/drawables");
        if (fileResDrawables.mkdirs()) {
            massage.append("Ready, folder - res/drawables - created \n");
        } else massage.append("Error, folder - res/drawables - not created \n");

        // Создание папки vectors
        File fileResVectors = new File("C://Games/res/vectors");
        if (fileResVectors.mkdir()) {
            massage.append("Ready, folder - res/vectors - created \n");
        } else massage.append("Error, folder - res/vectors - not created \n");

        // Создание папки icons
        File fileResIcons = new File("C://Games/res/icons");
        if (fileResIcons.mkdir()) {
            massage.append("Ready, folder - res/icons - created \n");
        } else massage.append("Error, folder - res/icons - not created \n");

        // Создание папки savegames
        File fileSavegames = new File("C://Games/savegames");
        if (fileSavegames.mkdir()) {
            massage.append("Ready, folder - savegames - created \n");
        } else massage.append("Error, folder - savegames - not created \n");

        // Создание папки temp
        File fileTemp = new File("C://Games/temp");
        if (fileTemp.mkdir()) {
            massage.append("Ready, folder - temp - created \n");
        } else massage.append("Error, folder - temp - not created \n");

        // Создание файла temp
        File fileTempFile = new File(fileTemp, "temp.txt");
        try {
            if (fileTempFile.createNewFile()) {
                massage.append("Ready, file - temp.txt - created \n");
            } else massage.append("Error, file - temp.txt - not created \n");
        } catch (IOException ex) {
            massage.append(ex.getMessage());
        }

        //Запись файла temp.txt

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Games/temp/temp.txt"))) {
            writer.write(massage.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}