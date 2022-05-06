package com.company.singleton;

public class Superman {
    private static volatile Superman instance;
    public String say;

    private Superman(String say) {
        this.say = say;
    }

    public static Superman getInstance(String say) {
        if (instance == null) {
            synchronized (Superman.class) {
                if (instance == null) {
                    instance = new Superman(say);
                }
            }
        }
        return instance;
    }
}
