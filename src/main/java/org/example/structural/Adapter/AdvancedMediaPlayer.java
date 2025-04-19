package org.example.structural.Adapter;

//Adaptee
public class AdvancedMediaPlayer {
    public void playVLCPlayer(String audioType,String fileName){
        System.out.println("Playing VLC file: " + fileName);
    }
    public void playMp4Player(String audioType,String fileName){
        System.out.println("Playing MP4 file: " + fileName);
    }
}
