package manage_store.logic;

import java.util.Date;
import java.util.HashSet;

import manage_store.beans.Piece;

public class ManagePieces {

    private HashSet<Piece> pieces;

    public ManagePieces() {
        pieces = new HashSet<>();
    }

    public void addPiece(String name, Date date) {
        pieces.add(new Piece(name, date));
    }

    public void addPiece(String name) {
        pieces.add(new Piece(name, new Date()));
    }

    public HashSet<Piece> getOldPieces(Date date) {
        HashSet<Piece> result = new HashSet<>();
        for (Piece piece : result) {
            if (piece.getDate().getTime() < date.getTime()) {
                result.add(piece);
            }
        }
        return result;
    }
}
