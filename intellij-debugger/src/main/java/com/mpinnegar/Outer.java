package com.mpinnegar;

public class Outer {
    public static void main(String[] args) {
        Middle middle = new Middle();
        middle.callThroughToInner("my string to pass in");
    }
}
