package org.example.structural.Adapter;

//Adapter Class
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLCPlayer("vlc",fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playVLCPlayer("mp4",fileName);
        }
    }
}
