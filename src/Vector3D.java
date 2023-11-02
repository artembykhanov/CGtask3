public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void sumVector(Vector3D v) {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
    }

    public void subtractVector(Vector3D v) {
        this.x -= v.getX();
        this.y -= v.getY();
        this.z -= v.getZ();
    }

    public void multiplyScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public void divScalar(double scalar) {
        this.x /= scalar;
        this.y /= scalar;
        this.z /= scalar;
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
        }
    }

    public double scalarMultiply(Vector3D v) {
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
    }

    public Vector3D vectorMultiply(Vector3D v) {
        double newX = this.y * v.getZ() - this.z * v.getY();
        double newY = this.z * v.getX() - this.x * v.getZ();
        double newZ = this.x * v.getY() - this.y * v.getX();

        return new Vector3D(newX, newY, newZ);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
