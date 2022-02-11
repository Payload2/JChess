package pedro.cunha.view;

import javax.swing.*;

public class JSquare extends JPanel {

    private JPiece jPiece;
    private int x,y;

    public JSquare(int x, int y){
        this.x = x;
        this.y = y;
    }

    public JPiece getjPiece() {
        return jPiece;
    }

    public void setjPiece(JPiece jPiece) {
        this.jPiece = jPiece;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
