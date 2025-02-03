package com.parkash.question$2b;

import com.parkash.question$2b.Player;

public class VideoPlayer implements Player {
    private String name;
    public VideoPlayer(String name){
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Video Player is playing a song");
    }

    @Override
    public void stop() {
        System.out.println("Video Player has stopped a song");
    }

    @Override
    public void pause() {
        System.out.println("Video Player has paused a song");
    }

    @Override
    public void next() {
        System.out.println("Song has been changed in Video Player");
    }

    @Override
    public void previous() {
        System.out.println("Previous song has been kept again");
    }

    @Override
    public void showPlayList() {
        System.out.println("List of PlayList in Video Player");
    }
}
