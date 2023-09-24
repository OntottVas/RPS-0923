package hu.progmatic.rps.model;

public class Game {
    private String playerChoice;
    private String computerChoice;
    private String chickenDinner;

    public Game() {}

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public String getChickenDinner() {
        return chickenDinner;
    }

    public void setChickenDinner(String chickenDinner) {
        this.chickenDinner = chickenDinner;
    }
}
