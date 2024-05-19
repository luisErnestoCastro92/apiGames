package com.spring.backend.api.gameApi.controller.impl;

import com.spring.backend.api.gameApi.commons.entities.Game;
import com.spring.backend.api.gameApi.controller.GameApi;
import com.spring.backend.api.gameApi.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController implements GameApi {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game createdGame = this.gameService.saveGame(game);
        return ResponseEntity.ok(createdGame);
    }
}
