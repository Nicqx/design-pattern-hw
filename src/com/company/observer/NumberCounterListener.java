package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberCounterListener implements EventListener {

    public static final String NUMBER_PATTERN = "[-+]?([\\d]*\\.[\\d]+|[\\d]+)";

    @Override
    public void update(String eventType, File file) {
        try {
            int overallCount = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches(NUMBER_PATTERN)) {
                        overallCount++;
                    }
                }
            }
            scanner.close();
            System.out.println("The number of numbers: " + overallCount + " in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
