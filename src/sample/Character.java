package sample;

public class Character {
    private String name;
    private int health;
    private int attack;
    private int level;
    private int positionX;
    private int positionY;
    private boolean isDead;
    private String image;

    public Character(String name, int health, int attack, int level,String image) {
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

    public String getImageUrl(){
        return image;
    }
}
