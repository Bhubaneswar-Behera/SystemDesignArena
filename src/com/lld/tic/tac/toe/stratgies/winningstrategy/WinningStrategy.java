package com.lld.tic.tac.toe.stratgies.winningstrategy;

import com.lld.tic.tac.toe.model.Board;
import com.lld.tic.tac.toe.model.Cell;
import com.lld.tic.tac.toe.model.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player, Cell cell);
}
