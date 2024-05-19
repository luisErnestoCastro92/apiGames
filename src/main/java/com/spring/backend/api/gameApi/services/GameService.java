package com.spring.backend.api.gameApi.services;

import com.spring.backend.api.gameApi.commons.entities.Game;

public interface GameService {

    Game saveGame(Game gameRequest);

}
