package org.example.structural.Bridge;

public class BridgePatternMain {
    public static void main(String[] args) {
        TV sony = new SonyTV();
        RemoteControl sonyRemote = new BasicRemote(sony);
        sonyRemote.turnOn();
        sonyRemote.setChannel(10);
        sonyRemote.turnOff();

        TV lg = new LGTV();
        RemoteControl lgRemote = new BasicRemote(lg);
        lgRemote.turnOn();
        lgRemote.setChannel(7);
        lgRemote.turnOff();
    }
}
