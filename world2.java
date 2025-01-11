public class MyWorld extends World {
    private Tool currentTool;

    public MyWorld() {
        super(800, 600, 1);
    }

    public void act() {
        checkKeyInput();
        updateToolPosition();
    }

    private void checkKeyInput() {
        if (Greenfoot.isKeyDown("E")) {
            switchTool("tool1.png");
        } else if (Greenfoot.isKeyDown("M")) {
            switchTool("tool2.png");
        }
    }

    private void switchTool(String toolImage) {
        if (currentTool != null) {
            removeObject(currentTool);
        }
        currentTool = new Tool(toolImage);
        addObject(currentTool, 0, 0);
    }

    private void updateToolPosition() {
        if (currentTool != null) {
            Actor player = getObjects(Player.class).get(0);
            currentTool.setLocation(player.getX() + 30, player.getY());
        }
    }
}
