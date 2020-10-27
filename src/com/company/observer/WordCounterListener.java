package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounterListener implements EventListener {


    @Override
    public void update(String eventType, File file) {
        try (Scanner scanner = new Scanner(file)){
            int overallCount = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                overallCount += words.length;
            }
            System.out.println("The number of words: " + overallCount + " in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
