package org.example.structural.Adapter;

//Concrete Player
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 music: "+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.playMusic(audioType,fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
