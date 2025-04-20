package org.example.structural.Bridge;

public class LGTV implements TV{
    @Override
    public void on() {
        System.out.println("LG TV is ON");
    }

    @Override
    public void off() {
        System.out.println("LG TV is OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("LG TV tuned to channel " + channel);
    }
}
