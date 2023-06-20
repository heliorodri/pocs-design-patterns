package com.heliorodri.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * GameFacade encapsulates the use of the Graphics and Sound subsystems of
 * the game engine to provide simplified methods to the game settings.
 */
@Getter
@AllArgsConstructor
public class GameFacade {

    private final Graphics graphics;
    private final Sound sound;

    public String restartGameSettings() {
        return new StringBuilder()
                .append(graphics.render())
                .append(" - ")
                .append(sound.stopSound())
                .append(" - ")
                .append(sound.playSound())
                .toString();
    }

    public String restartSound() {
        return new StringBuilder()
                .append(sound.stopSound())
                .append(" - ")
                .append(sound.playSound())
                .toString();
    }

}
