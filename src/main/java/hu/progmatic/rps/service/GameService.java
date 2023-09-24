package hu.progmatic.rps.service;

import hu.progmatic.rps.model.Game;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameService(Game game) {
        this.game = game;
    }

    public void useInput(String choice) {
        game.setPlayerChoice(choice);
        game.setComputerChoice(computerChoice());
        game.setChickenDinner(winnerWinner(game.getComputerChoice(), game.getPlayerChoice()));
    }

    private String computerChoice() {
        switch (new Random().nextInt(3)) {
            case 0 -> {
                return "rock";
            }
            case 1 -> {
                return "paper";
            }
            default -> {
                return "scissors";
            }
        }
    }

    private String winnerWinner(String npc, String player) {
        if (npc.equals(player)) {
            return "No winners, only losers";
        }
        if (npc.equals("rock") && player.equals("paper") ||
                npc.equals("paper") && player.equals("scissors") ||
                npc.equals("scissors") && player.equals("rock")) {
            return "chicken dinner";
        }
        return "no chicken for you player";
    }
}
