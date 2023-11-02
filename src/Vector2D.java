public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void sumVector(Vector2D v) {
        this.x += v.getX();
        this.y += v.getY();
    }

    public void subtractVector(Vector2D v) {
        this.x -= v.getX();
        this.y -= v.getY();
    }

    public void multiplyScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    public void divScalar(double scalar) {
        this.x /= scalar;
        this.y /= scalar;
    }

    public double getLenght() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void normalize() {
        double lenght = getLenght();
        if (lenght != 0) {
            this.x /= lenght;
            this.y /= lenght;
        }
    }

    public double scalarProduct(Vector2D v) {
        return this.x * v.getX() + this.y * v.getY();
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
