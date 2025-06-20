package com.lld.tic.tac.toe.stratgies.botplayingstrategy;

import com.lld.tic.tac.toe.model.Board;
import com.lld.tic.tac.toe.model.Cell;
import com.lld.tic.tac.toe.model.CellState;
import com.lld.tic.tac.toe.model.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        //Iterate over the board and make a move at the first empty cell.

        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
