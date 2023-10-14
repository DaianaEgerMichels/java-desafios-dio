package com.github.daianaegermichels.poo;

public class UseIphone {
    public static void main(String[] args) {
        Iphone iphone =  new Iphone();

        // music
        iphone.play();
        iphone.pause();
        iphone.selectMusic();

        // call
        iphone.call();
        iphone.meet();
        iphone.startVoiceConversation();

        // browser
        iphone.addNewTab();
        iphone.displayPage();
        iphone.updatePage();


    }
}
