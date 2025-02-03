package com.parkash.question$2b;

public class AudioPlayer implements Player {
    private String name;
    public AudioPlayer(String name){
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Audio Player is playing a song");
    }

    @Override
    public void stop() {
        System.out.println("Audio Player has stopped a song");
    }

    @Override
    public void pause() {
        System.out.println("Audio Player has paused a song");
    }

    @Override
    public void next() {
        System.out.println("Song has been changed in Audio Player");
    }

    @Override
    public void previous() {
        System.out.println("Previous song has been kept again");
    }

    @Override
    public void showPlayList() {
        System.out.println("List of PlayList in Audio Player");
    }
}
