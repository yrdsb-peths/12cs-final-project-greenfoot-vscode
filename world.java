public class MyWorld extends World {
    private int cameraX, cameraY;
    private int mapWidth, mapHeight;

    public MyWorld() { 
        super(800, 600, 1); // 初始化世界
        mapWidth = 1600;
        mapHeight = 1200;
        cameraX = getWidth() / 2;
        cameraY = getHeight() / 2;
    }

    public void act() {
        handleInput();
        checkMapSwitch();
    }

    private void handleInput() {
        if (Greenfoot.isKeyDown("left")) {
            scrollCamera(-5, 0);
        } else if (Greenfoot.isKeyDown("right")) {
            scrollCamera(5, 0);
        } else if (Greenfoot.isKeyDown("up")) {
            scrollCamera(0, -5);
        } else if (Greenfoot.isKeyDown("down")) {
            scrollCamera(0, 5);
        }
    }

    private void scrollCamera(int dx, int dy) {
        cameraX += dx;
        cameraY += dy;

        for (Object obj : getObjects(null)) {
            Actor actor = (Actor) obj;
            actor.setLocation(actor.getX() - dx, actor.getY() - dy);
        }
    }

    private void checkMapSwitch() {
        if (cameraX < 0 || cameraX > mapWidth || cameraY < 0 || cameraY > mapHeight) {
            loadMap("newMap");
        }
    }

    private void loadMap(String newMap) {
        setBackground(new GreenfootImage(newMap + ".png"));
        cameraX = getWidth() / 2; 
        cameraY = getHeight() / 2;
    }
}
