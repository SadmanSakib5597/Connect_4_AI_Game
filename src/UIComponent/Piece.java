package UIComponent;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Piece {

    Player playerType;
    ImageView imageView;
    Cell cellNumber;
    GridPane UIboard;

    public Piece(Player playerType, Cell cellNumber, GridPane UIBoard)
    {
        this.playerType = playerType;
        this.cellNumber = cellNumber;
        this.UIboard = UIBoard;

        imageView = new ImageView();

        if(playerType == Player.HUMAN)
            imageView.setImage(new Image("res/Player_01.png"));
        else
            imageView.setImage(new Image("res/Player_02.png"));

        imageView.setPreserveRatio(false);
        imageView.setFitWidth(130);
        imageView.setFitHeight(110);
    }

    public void addPieceToCell()
    {
        UIboard.add(imageView, cellNumber.y, cellNumber.x);
    }

}
