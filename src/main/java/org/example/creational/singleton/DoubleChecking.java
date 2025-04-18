package org.example.creational.singleton;

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print(String msg){
        System.out.println("In print: "+msg);
    }
}
public class DoubleChecking {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2);
        obj1.print("Hello method from obj1");
        obj2.print("Hello method from obj2");
    }
}
