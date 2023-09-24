package hu.progmatic.rps.config;

import hu.progmatic.rps.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class GameConfig {

    @Bean
    public Game gameBean() {
        return new Game();
    }
}
