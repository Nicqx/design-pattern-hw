package com.company.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EventManager {
    Map<String, List<EventListener>> listeners;

    public EventManager(String... listeners) {
        this.listeners = Arrays.stream(listeners).collect(Collectors.toMap(listener -> listener, listener -> new ArrayList<>()));
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
