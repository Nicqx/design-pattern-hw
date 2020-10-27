package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordKeeperListener implements EventListener {

    @Override
    public void update(String eventType, File file) {
        String localLongestWord = "";
        int localLongestCount = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > localLongestCount) {
                        localLongestCount = word.length();
                        localLongestWord = word;
                    }
                }
            }
            scanner.close();
            System.out.println("The longest word length is: " + localLongestCount + " and the word is: '" + localLongestWord + "' in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
