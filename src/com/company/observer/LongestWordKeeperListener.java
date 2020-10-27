package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordKeeperListener implements EventListener {
    private int globalLongestCount;
    private String globalLongestWord;

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
                    if (word.length() > globalLongestCount) {
                        globalLongestCount = word.length();
                        globalLongestWord = word;
                    }
                    if (word.length() > localLongestCount) {
                        localLongestCount = word.length();
                        localLongestWord = word;
                    }
                }
            }
            scanner.close();
            System.out.println("The longest word length from every file is: " + globalLongestCount + " and the word is: '" + globalLongestWord + "' in this file: " + file.getName());
            System.out.println("The longest word length from actual file is: " + localLongestCount + " and the word is: '" + localLongestWord + "' in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
