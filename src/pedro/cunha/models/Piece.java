package pedro.cunha.models;

public abstract class Piece {

    private EnumColor color;
    private int posX, posY;
    private String img;
    private boolean died = false;
    private boolean selected = false;
    private Board board;

    public Piece(EnumColor color, int posX, int posY, String img, Board board) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.img = img;
        this.board = board;
    }

    // Obrigatoriedade de implementação do método de verificação de um movimento válido.
    public abstract boolean isLegalMove(int desX, int desY);

    public EnumColor getColor() {
        return this.color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public int getPosX() {
        return this.posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isDied() {
        return this.died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}