package com.game.chess.pieces;

import com.game.chess.pieces.enums.Color;
import com.game.chess.pieces.enums.PieceType;
import com.game.chess.board.Board;

public class Rook extends SlidingPiece {

    public Rook(Board board, Color color, Position position) {
        super(board, color, position);
    }

    @Override
    public boolean isValidMove(Position destPosition) {
        return isValidLinearMove(destPosition) && isDestinationAvailable(destPosition);
    }

    @Override
    public boolean canAttack(Position destPosition) {
        if (destPosition == getPosition()) {
            return false;
        }
        return isValidLinearMove(destPosition);
    }

    @Override
    public String getPieceType() {
        return PieceType.ROOK.getName();
    }

    @Override
    public String getSymbol() {
        return getColor() == Color.BLACK ? "♜" : "♖";
    }
}
