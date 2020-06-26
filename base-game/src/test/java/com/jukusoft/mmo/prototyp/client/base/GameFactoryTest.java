package com.jukusoft.mmo.prototyp.client.base;

import com.jukusoft.engine2d.applayer.BaseGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameFactoryTest {

    @Test
    public void testCreateGame() {
        GameFactory gameFactory = new GameFactory();
        BaseGame game = gameFactory.createGame();
        assertNotNull(game);
    }

}
