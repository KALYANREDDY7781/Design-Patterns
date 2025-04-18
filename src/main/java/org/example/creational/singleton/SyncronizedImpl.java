package org.example.creational.singleton;

class SyncronizedImpl {

    public static void main(String[] args) {
        MainClass obj1 = MainClass.getInstance();
        MainClass obj2 = MainClass.getInstance();
        System.out.println(obj1 == obj2);
        obj1.print("Hello method from obj1");
        obj2.print("Hello method from obj2");
    }

}

class MainClass{
    private static int counter = 0;
    private static MainClass instance;

    private MainClass(){
        counter++;
        System.out.println("Counter value is: "+counter);
    }

    public static synchronized MainClass getInstance(){
        if(instance == null){
            instance = new MainClass();
        }
        return instance;
    }

    public void print(String msg){
        System.out.println("In print: "+msg);
    }
}
