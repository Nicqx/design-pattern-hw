package com.company.observer;

import java.io.File;

public class FileOpener {
    public EventManager events;

    public FileOpener() {
        this.events = new EventManager("word counter", "number counter", "longest word", "reverse word");
    }

    public void openFile(String filePath) {
        File file = new File(filePath);
        events.notify("word counter", file);
        events.notify("number counter", file);
        events.notify("longest word", file);
        events.notify("reverse word", file);

    }
}
