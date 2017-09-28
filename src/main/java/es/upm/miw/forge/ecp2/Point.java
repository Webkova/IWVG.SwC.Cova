package es.upm.miw.forge.ecp2;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.z -= origin.getZ();
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "," + "]";
    }
    
    public void addValueToCoordinates(int value) {
        this.x = this.x + value;
        this.y = this.y + value;
    }
    
}
