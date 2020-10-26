package com.company;

import com.company.adapter.ArrayListAdapter;
import com.company.adapter.LinkedListAdapter;
import com.company.adapter.StackAdapter;
import com.company.adapter.VectorAdapter;
import com.company.observer.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        performAdapter();
        performObserver();


    }

    private static void performObserver() {
        System.out.println("3. Observer Task\n");
        FileOpener fileOpener = new FileOpener();

        String testFile = "./src/com/company/observer/testFiles/test.txt";
        fileOpener.events.subscribe("word counter", new WordCounterListener(testFile));
        fileOpener.events.subscribe("number counter", new NumberCounterListener(testFile));
        fileOpener.events.subscribe("longest word", new LongestWordKeeperListener(testFile));
        fileOpener.events.subscribe("reverse word", new ReverseWordListener(testFile));

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
