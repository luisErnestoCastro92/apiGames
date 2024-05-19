package com.spring.backend.api.gameApi.repositories;

import com.spring.backend.api.gameApi.commons.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
