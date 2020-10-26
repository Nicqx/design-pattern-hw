package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWordListener implements EventListener {
    private File file;

    public ReverseWordListener(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        try {
            System.out.println("The reverse order of words in this file: " + file.getName() + "\n");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.print("> ");
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(word);
                    sb = sb.reverse();
                    System.out.print(sb + " ");
                }
                System.out.println();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
