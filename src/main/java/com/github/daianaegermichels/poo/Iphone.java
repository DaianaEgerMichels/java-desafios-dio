package com.github.daianaegermichels.poo;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {
    @Override
    public void play() {
        System.out.println("Playing music on the iPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on the iPhone");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting a song on the iPhone");
    }

    @Override
    public void displayPage() {
        System.out.println("Displaying a web page in the iPhone's browser");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding a new tab in the iPhone's browser");
    }

    @Override
    public void updatePage() {
        System.out.println("Refreshing the web page in the iPhone's browser");
    }

    @Override
    public void call() {
        System.out.println("Making a call on the iPhone");
    }

    @Override
    public void meet() {
        System.out.println("Answering a call on the iPhone");
    }

    @Override
    public void startVoiceConversation() {
        System.out.println("Starting a voice conversation on the iPhone");
    }
}
