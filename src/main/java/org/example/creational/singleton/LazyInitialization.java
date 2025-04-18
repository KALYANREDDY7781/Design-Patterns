package org.example.creational.singleton;
//This is not thread-safe
public class LazyInitialization {

    private static int counter = 0;
    private static LazyInitialization instance;

    private LazyInitialization(){
        counter++;
        System.out.println("Counter value is: "+counter);
    }

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void print(String msg){
        System.out.println("In print: "+msg);
    }
}
