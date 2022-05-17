package ro.fasttrackit.homework.lab12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingForFiles {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static void readFile() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("fild/grades.txt"));

        String line;
        while ((line = fileReader.readLine()) != null) {
            System.out.println(line);
        }

    }

}