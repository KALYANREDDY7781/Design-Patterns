package org.example.structural.Bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    void turnOn() {
        tv.on();
    }

    @Override
    void turnOff() {
        tv.off();
    }

    @Override
    void setChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
