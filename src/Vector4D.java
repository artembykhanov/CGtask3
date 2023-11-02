public class Vector4D {
    private double x;
    private double y;
    private double z;
    private double w;

    public Vector4D(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getW() {
        return w;
    }

    public void sumVector(Vector4D v) {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
        this.w += v.getW();
    }

    public void subtractVector(Vector4D v) {
        this.x -= v.getX();
        this.y -= v.getY();
        this.z -= v.getZ();
        this.w -= v.getW();
    }

    public void multiplyScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
        this.w += scalar;
    }

    public void divScalar(double scalar) {
        this.x /= scalar;
        this.y /= scalar;
        this.z /= scalar;
        this.w /= scalar;
    }

    public double getLenght() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public void normalize() {
        double lenght = getLenght();
        if (lenght != 0) {
            this.x /= lenght;
            this.y /= lenght;
            this.z /= lenght;
            this.w /= lenght;
        }
    }

    public double scalarMultiply(Vector4D v) {
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ() + this.w * v.getW();
    }


    @Override
    public String toString() {
        return "Vector4D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", w=" + w +
                '}';
    }
}
