package org.example.creational.singleton;
class Singleton1{
    private Singleton1(){}

    private static class Holder{
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return Holder.INSTANCE;
    }
}
public class BillPugh {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2);
        obj1.print("Hello method from obj1");
        obj2.print("Hello method from obj2");
    }
}
