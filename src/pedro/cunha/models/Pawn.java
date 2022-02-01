package pedro.cunha.models;

public class Pawn extends Piece{

    private boolean wasMoved = false;

    public Pawn(EnumColor color, int posX, int posY, String img) {
        super(color, posX, posY, img, board);
    }

    @Override
    public boolean isLegalMove(int desX, int desY) {
        // Verificação de movimentos válidos
        return false;
    }
}
