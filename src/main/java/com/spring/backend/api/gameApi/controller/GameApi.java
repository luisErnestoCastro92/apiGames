package com.spring.backend.api.gameApi.controller;

import com.spring.backend.api.gameApi.commons.entities.Game;
import com.spring.backend.api.gameApi.commons.entities.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(Utils.V1_ROUTE + Utils.GAME_ROUTE)
public interface GameApi {
    @PostMapping
    ResponseEntity<Game> saveGame(@RequestBody Game game);
}
