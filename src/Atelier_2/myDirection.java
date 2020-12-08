package Atelier_2;
public class myDirection {

    /** Listed All directions possibles */
    enum Direction {
        north, east, south, west;
    }

    
    public static void main(String[] args) {
        Direction direction = Direction.east;
        switch (direction) {
            case north:
                System.out.println("You are heading north");
                break;
            case east:
                System.out.println("You are heading east");
                break;
            case south:
                System.out.println("You are heading south");
                break;
            case west:
                System.out.println("You are heading west");
                break;
        }
    }
}
