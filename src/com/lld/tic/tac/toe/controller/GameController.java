package com.lld.tic.tac.toe.controller;

import com.lld.tic.tac.toe.exception.InvalidMoveException;
import com.lld.tic.tac.toe.model.Game;
import com.lld.tic.tac.toe.model.GameState;
import com.lld.tic.tac.toe.model.Player;
import com.lld.tic.tac.toe.stratgies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameController {
    //makeMove
    //undo
    //checkWinner
    //gameState

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState gameState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void undo(Game game) {

    }
}
