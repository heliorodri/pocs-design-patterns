package com.heliorodri.facade;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameFacadeTest {

    private static GameFacade facade;

    @BeforeAll
    static void setUp() {
        facade = new GameFacade(new Graphics(), new Sound());
    }

    @Test
    void itShouldRestartGameSoundSuccessfully() {
        final Sound sound = new Sound();
        final String expected = new StringBuilder()
                .append(sound.stopSound())
                .append(" - ")
                .append(sound.playSound())
                .toString();

        assertEquals(expected, facade.restartSound());
    }

    @Test
    void itShouldRestartGameSettingsSuccessfully() {
        final Graphics graphics = new Graphics();
        final Sound sound = new Sound();

        final String expected = new StringBuilder()
                .append(graphics.render())
                .append(" - ")
                .append(sound.stopSound())
                .append(" - ")
                .append(sound.playSound())
                .toString();

        assertEquals(expected, facade.restartGameSettings());
    }
}