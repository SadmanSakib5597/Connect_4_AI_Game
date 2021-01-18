package main;

import UIComponent.Player;
import backend.Board;
import backend.WinStatus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Board board;
    Player playerType;

    @FXML
    GridPane UIBoard;
    @FXML
    Text statusText;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        board = new Board(6, 7, UIBoard);
        playerType = Player.HUMAN;
        statusText.setText("Human Turn");
        statusText.setFill(Paint.valueOf("b54545"));
    }

    void toggleTurn()
    {
        if(!isValidTurn())
            return;

        if(playerType == Player.HUMAN)
        {
            playerType = Player.AI;
            statusText.setText("AI Turn");
            statusText.setFill(Paint.valueOf("c6854b"));
        }
        else
        {
            //For minimax AI algo
            //board.turn(playerType, -1);

            playerType = Player.HUMAN;
            statusText.setText("Human Turn");
            statusText.setFill(Paint.valueOf("b54545"));
        }
    }

    public boolean isValidTurn()
    {
        int winStatus = board.getWInStatus();

        if(winStatus == 1)
        {
            statusText.setText("Human Win");
            board.winStatus = WinStatus.WIN;
            return false;
        }

        else if(winStatus == 2)
        {
            statusText.setText("AI Win");
            board.winStatus = WinStatus.WIN;
            return false;
        }

        else if(board.isEmptyBoard())
        {
            return true;
        }

        return false;
    }

    public void setTurnForCol_0()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 0);
        toggleTurn();
    }

    public void setTurnForCol_1()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 1);
        toggleTurn();
    }

    public void setTurnForCol_2()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 2);
        toggleTurn();
    }

    public void setTurnForCol_3()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 3);
        toggleTurn();
    }

    public void setTurnForCol_4()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 4);
        toggleTurn();
    }

    public void setTurnForCol_5()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 5);
        toggleTurn();
    }

    public void setTurnForCol_6()
    {
        if(!isValidTurn())
            return;

        board.turn(playerType, 6);
        toggleTurn();
    }

    public void exitGame()
    {
        System.exit(0);
    }

}
