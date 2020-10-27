package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounterListener implements EventListener {
    private File file;

    public WordCounterListener(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        try {
            int overallCount = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                overallCount += words.length;
            }
            scanner.close();
            System.out.println("The number of words: " + overallCount + " in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
