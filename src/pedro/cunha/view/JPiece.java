package pedro.cunha.view;

import pedro.cunha.models.Piece;

import javax.swing.*;

public class JPiece extends JLabel {

    private Piece piece;

    public JPiece(Piece piece){
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
