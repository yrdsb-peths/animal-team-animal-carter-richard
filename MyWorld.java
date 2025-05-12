import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);
        createApple();

    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}


