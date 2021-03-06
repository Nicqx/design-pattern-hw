package com.company;

import com.company.adapter.ArrayListAdapter;
import com.company.adapter.LinkedListAdapter;
import com.company.adapter.StackAdapter;
import com.company.adapter.VectorAdapter;
import com.company.builder.House;
import com.company.factory.HouseFactory;
import com.company.observer.*;
import com.company.singleton.Superman;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        performAdapter();
        performObserver();
        performSingleton();
        performBuilder();
        performFactory();
    }

    private static void performFactory() {
        System.out.println("\nxx. Factory Task\n");
        System.out.println("Creating smallHouse");
        com.company.factory.House smallHouse = HouseFactory.getHouse(5);
        System.out.println("Creating bigHouse");
        com.company.factory.House bigHouse = HouseFactory.getHouse(12);
        System.out.println();
        System.out.println("small house: " + smallHouse.toString());
        System.out.println("big house: " + bigHouse.toString());
    }

    private static void performBuilder() {
        System.out.println("\nx. Builder Task\n");

        System.out.println("Creating smallHouse with garden");
        House smallHouse = new House.HouseBuilder("green", 2).beGardenExist(true).build();
        System.out.println("Creating bigHouse without garden");
        House bigHouse = new House.HouseBuilder("blue", 3).build();
        System.out.println();
        System.out.println("smallHouse windows: " + smallHouse.getWindowCount());
        System.out.println("smallHouse wall's colour: " + smallHouse.getWallColour());
        System.out.println("smallHouse garden: " + smallHouse.getGardenExisit());
        System.out.println();
        System.out.println("bigHouse windows: " + bigHouse.getWindowCount());
        System.out.println("bigHouse wall's colour: " + bigHouse.getWallColour());
        System.out.println("bigHouse garden: " + bigHouse.getGardenExisit());

    }

    private static void performSingleton() {
        System.out.println("\n8. Singleton Task\n");

        System.out.println("Instantiate Superman");
        Superman superman = Superman.getInstance("I am Superman!");

        System.out.println("Try to instantiate decoy Superman");
        Superman decoySuperman = Superman.getInstance("I am Batman!");

        System.out.println("Ask the first: " + superman.say);
        System.out.println("Then ask the second: " + decoySuperman.say);

    }

    private static void performObserver() {
        System.out.println("3. Observer Task\n");
        FileOpener fileOpener = new FileOpener();

        String testFile = "./src/com/company/observer/testFiles/test.txt";
        fileOpener.events.subscribe("word counter", new WordCounterListener());
        fileOpener.events.subscribe("number counter", new NumberCounterListener());
        fileOpener.events.subscribe("longest word", new LongestWordKeeperListener());
        fileOpener.events.subscribe("reverse word", new ReverseWordListener());

        System.out.println("3.1 First file: " + testFile);
        fileOpener.openFile(testFile);

        testFile = "./src/com/company/observer/testFiles/test2.txt";

        System.out.println("\n3.2 Second file: " + testFile);
        fileOpener.openFile(testFile);
    }

    private static void performAdapter() {
        System.out.println("2. Adapter Task\n");
        System.out.println("2.1 Array List\n");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(23);

        System.out.println("Original list:" + arrayList);

        ArrayListAdapter arrayListAdapter = new ArrayListAdapter(arrayList);

        System.out.println("Performing the pop(): " + arrayListAdapter.pop());
        System.out.println("List after the pop:" + arrayList);
        System.out.println("Performing the push() with an element 95");
        arrayListAdapter.push(95);
        System.out.println("List after the push: " + arrayList);

        System.out.println("--------------------\n");
        System.out.println("2.2 Linked List\n");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(23);

        System.out.println("Original list:" + arrayList);

        LinkedListAdapter linkedListAdapter = new LinkedListAdapter(linkedList);

        System.out.println("Performing the pop(): " + linkedListAdapter.pop());
        System.out.println("List after the pop:" + linkedList);
        System.out.println("Performing the push() with an element 95");
        linkedListAdapter.push(95);
        System.out.println("List after the push: " + linkedList);

        System.out.println("--------------------\n");
        System.out.println("2.3 Vector List\n");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(9);
        vector.add(23);

        System.out.println("Original list:" + vector);

        VectorAdapter vectorAdapter = new VectorAdapter(vector);

        System.out.println("Performing the pop(): " + vectorAdapter.pop());
        System.out.println("List after the pop:" + vector);
        System.out.println("Performing the push() with an element 95");
        vectorAdapter.push(95);
        System.out.println("List after the push: " + vector);

        System.out.println("--------------------\n");
        System.out.println("2.4 Stack List\n");
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(9);
        stack.add(23);

        System.out.println("Original list:" + stack);

        StackAdapter stackAdapter = new StackAdapter(stack);

        System.out.println("Performing the pop(): " + stackAdapter.pop());
        System.out.println("List after the pop:" + stack);
        System.out.println("Performing the push() with an element 95");
        stackAdapter.push(95);
        System.out.println("List after the push: " + stack);

        System.out.println("--------------------\n");
    }
}
