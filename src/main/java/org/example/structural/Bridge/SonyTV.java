package org.example.structural.Bridge;

public class SonyTV implements TV{
    @Override
    public void on() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony TV is OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Sony TV tuned to channel " + channel);
    }
}
