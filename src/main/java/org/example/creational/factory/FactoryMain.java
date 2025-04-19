package org.example.creational.factory;

interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory{
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
public class FactoryMain {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();
    }
}
