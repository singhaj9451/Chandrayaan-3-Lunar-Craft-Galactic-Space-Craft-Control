public class Spacecraft {
    private int[] position; // x, y, z coordinates
    private String direction;

    public Spacecraft(int[] initialPosition, String initialDirection) {
        position = initialPosition.clone();
        direction = initialDirection;
    }

    public void moveForward() //Method for moving Spacecraft Forward by one step
    {
        switch (direction) {
            case "N":
                position[1]++;
                break;
            case "S":
                position[1]--;
                break;
            case "E":
                position[0]++;
                break;
            case "W":
                position[0]--;
                break;
        }
    }

    public void moveBackward() //Method for moving Spacecraft Backward by one step
    {
        switch (direction) {
            case "N":
                position[1]--;
                break;
            case "S":
                position[1]++;
                break;
            case "E":
                position[0]--;
                break;
            case "W":
                position[0]++;
                break;
        }
    }

    public void turnLeft() //Method for rotating Spacecraft Left by 90 degrees 
    {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() //Method for rotating Spacecraft Right by 90 degrees  
    {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void turnUp() //Method for the spacecraft changes its angle, rotating upwards. 
    {
        switch (direction) {
            case "N":
                direction = "Up";
                break;
            case "S":
                direction = "Down";
                break;
        }
    }

    public void turnDown() //Method for the spacecraft changes its angle, rotating downwards.
    {
        switch (direction) {
            case "Up":
                direction = "N";
                break;
            case "Down":
                direction = "S";
                break;
        }
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
        }
    }

    public void printFinalPositionAndDirection() {
        System.out.println("Final Position: (" + position[2] + ", " + position[1] + ", " + position[0] + ")");
        System.out.println("Final Direction: " + direction);
    }

    public static void main(String[] args) {
        int[] initialPosition = {0, 0, 0};
        String initialDirection = "N";
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        Spacecraft chandrayaan3 = new Spacecraft(initialPosition, initialDirection);
        chandrayaan3.executeCommands(commands);
        chandrayaan3.printFinalPositionAndDirection();
    }
}

