package naughtsandcrosses;

public class Point {

    private final int xCoordinate;
    private final int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public boolean equals(Object object) {
        Point point = (Point) object;
        return point.getXCoordinate() == xCoordinate && point.getYCoordinate() == yCoordinate;
    }
}
