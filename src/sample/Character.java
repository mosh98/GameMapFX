package sample;

import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

public class Character {
    private String name;
    private int health;
    private int attack;
    private int level;
    private int positionX;
    private int positionY;
    private boolean isDead;
    private Image image;

    public Character(String name, int health, int attack, int level, Image image) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.level = level;
        this.image=image;

    }

    public void movement(){

    }


    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    public Image getImageUrl(){
        return image;
    }
}
