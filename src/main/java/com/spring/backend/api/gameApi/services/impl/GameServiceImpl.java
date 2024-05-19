package com.spring.backend.api.gameApi.services.impl;

import com.spring.backend.api.gameApi.commons.entities.Game;
import com.spring.backend.api.gameApi.repositories.GameRepository;
import com.spring.backend.api.gameApi.services.GameService;

public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game gameRequest) {
        return this.gameRepository.save(gameRequest);
    }
}
