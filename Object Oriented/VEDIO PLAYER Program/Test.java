package com.parkash.question$2b;

public class Test {
    public static void main(String[] args) {
        VideoPlayer vP = new VideoPlayer("My Video Player");
        AudioPlayer aP = new AudioPlayer("My Audio Player");

        vP.play();
        vP.previous();

        aP.showPlayList();
        aP.next();
    }
}
