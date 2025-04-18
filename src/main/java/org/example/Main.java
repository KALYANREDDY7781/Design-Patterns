package org.example;

import org.example.creational.singleton.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        LazyInitialization obj1 = LazyInitialization.getInstance();
        LazyInitialization obj2 = LazyInitialization.getInstance();
        System.out.println(obj1 == obj2);
        obj1.print("Hello method from obj1");
        obj2.print("Hello method from obj2");
    }
}