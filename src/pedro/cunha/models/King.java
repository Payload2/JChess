package pedro.cunha.models;

public class King extends Piece{

    private boolean checked = false;

    public King(EnumColor color, int posX, int posY, String img, Board board) {
        super(color, posX, posY, img, board);
    }

    @Override
    public boolean isLegalMove(int desX, int desY) {
        return false;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
