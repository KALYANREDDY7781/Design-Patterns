package org.example.structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.playMusic("mp3","songs.mp3");
        player.playMusic("mp4", "movie.mp4");
        player.playMusic("vlc", "video.vlc");
        player.playMusic("avi", "clip.avi");
    }
}
