package pedro.cunha.models;

public class Board {

    private Piece[][] board;
    private Piece selectedPiece = null;
    private EnumColor turn = EnumColor.WHITE;

    public Board() {
        this.board = new Piece[8][8];
    }

    public Piece getPiece(int x, int y){
        return this.board[x][y];
    }

    public void addPiece(Piece piece){
        this.board[piece.getPosX()][piece.getPosY()] = piece;
        piece.setBoard(this);
    }

    public void selectPiece(Piece piece){
        if(piece.isSelected()){
            // Desmarca a peça selecionada
            piece.setSelected(false);
            this.selectedPiece = null;
        }else{
            // Marca a peça selecionada
            piece.setSelected(true);
            this.selectedPiece = piece;
        }
    }

    public void movePiece(Piece piece, int posX, int posY){

    }

    public void nextTurn(){
        this.turn = (this.turn.equals(EnumColor.WHITE)) ? EnumColor.BLACK : EnumColor.WHITE;
    }
}
