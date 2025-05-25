package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File jsonFile = new File("tasks.json");

            if (jsonFile.createNewFile()) {
                System.out.println("JSON created: " + jsonFile.getName());
            } else {
                System.out.println("File already exist!");
            }
        } catch(IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
