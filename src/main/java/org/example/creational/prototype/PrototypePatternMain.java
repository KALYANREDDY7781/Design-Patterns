package org.example.creational.prototype;

interface Prototype{
    Prototype clone();
}

class Circle implements Prototype{

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius,this.color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
public class PrototypePatternMain {
    public static void main(String[] args) {
        Circle original = new Circle(10,"red");
        Circle clone1 = (Circle) original.clone();
        Circle clone2 = (Circle) original.clone();
        System.out.println(original);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println((clone1==clone2) +" : "+(original==clone2)); //false, false
    }
}
