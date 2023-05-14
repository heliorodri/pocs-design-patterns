package com.heliorodri;

import com.heliorodri.game.GameFacade;
import com.heliorodri.game.Graphics;
import com.heliorodri.game.Sound;

public class Main {
    public static void main(String[] args) {
        Sound sound = new Sound();
        Graphics graphics = new Graphics();

        GameFacade gameSettings = new GameFacade(graphics, sound);

        System.out.println(gameSettings.restartGameSettings());
        System.out.println(gameSettings.getGraphics().render());
        System.out.println(gameSettings.getSound().playSound());
    }
}