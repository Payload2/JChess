package pedro.cunha.models;

public class Bishop extends Piece{

    public Bishop(EnumColor color, int posX, int posY, String img) {
        super(color, posX, posY, img, board);
    }

    @Override
    public boolean isLegalMove(int desX, int desY) {
        return false;
    }

}
