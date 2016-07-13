package com.mpinnegar;

public class Middle {
    private String value;
    private Inner inner = new Inner();

    void callThroughToInner(String foo) {
        inner.callWith(foo);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
