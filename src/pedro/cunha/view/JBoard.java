package pedro.cunha.view;
import javax.swing.*;
import pedro.cunha.models.Board;

public class JBoard extends JPanel{

    private Board board;

    public JBoard(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
