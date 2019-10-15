package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameViewManager {

    private AnchorPane gamePane;
    private Scene gameScene;
    private Stage gameStage;

    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 800;


    private Stage menuStage;
    private ImageView ship;

    public GameViewManager(){
    initializeStage();
    }

    public void initializeStage(){
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane,GAME_HEIGHT,GAME_WIDTH);
        gameStage = new Stage();
        gameStage.setScene(gameScene);

    }

    private void createKeyListener(){
        gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                if(keyEvent.getCode() == KeyCode.LEFT){

                }else if(keyEvent.getCode() == KeyCode.RIGHT){

                }
            }
        });
        gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode() == KeyCode.LEFT){

                }else if(keyEvent.getCode() == KeyCode.RIGHT){

                }

            }
        });
    }

}
