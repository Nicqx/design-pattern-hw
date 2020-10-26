package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberCounterListener implements EventListener {
    private File file;

    public NumberCounterListener(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        try {
            int overalCount = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches("-?\\d+")) {
                        overalCount++;
                    }
                }
            }
            scanner.close();
            System.out.println("The number of numbers: " + overalCount + " in this file: " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
