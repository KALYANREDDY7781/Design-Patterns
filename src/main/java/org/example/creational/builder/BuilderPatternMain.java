package org.example.creational.builder;

import java.nio.file.attribute.AclEntry;

class Computer{
    private String CPU;
    private String RAM;
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;
        public Builder(String CPU,String RAM){
            this.CPU = CPU;
            this.RAM = RAM;
        }
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}
public class BuilderPatternMain {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder("Intel i9","32GB").setBluetooth(true)
                .setGraphicsCard(true).build();

        Computer officePc = new Computer.Builder("Intel i7","16GB").build();
        System.out.println(gamingPc);
        System.out.println(officePc);
    }
}
