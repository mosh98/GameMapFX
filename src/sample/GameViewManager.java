package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GameViewManager {

    private AnchorPane gamePane;
    private Scene gameScene;
    private Stage gameStage;

    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 800;




    private ImageView mario;
    Image image = new Image(new FileInputStream("/Users/moslehmahamud/Desktop/GameMapFX/src/res/super_mario.png"));
    private Character imMario = new Character("SavageBeast",100,22,1,image);



    public GameViewManager() throws IOException {
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

    public void createNewGame(){
        createCharatcer(imMario);
        gameStage.show();
    }


    public void createCharatcer(Character c){
    mario = new ImageView(c.getImageUrl());

    mario.setLayoutX(GAME_WIDTH / 2);
    mario.setLayoutX(GAME_HEIGHT - 90);

    gamePane.getChildren().add(mario);


    }

}
