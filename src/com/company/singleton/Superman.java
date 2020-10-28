package com.company.singleton;

public class Superman {
    private static Superman instance;
    public String say;

    private Superman(String say) {
        this.say = say;
    }

    public static synchronized Superman getInstance(String say) {
        if (instance == null) {
            instance = new Superman(say);
        }
        return instance;
    }
}
