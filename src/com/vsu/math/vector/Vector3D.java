package com.vsu.math.vector;

public class Vector3D {
    private float x;
    private float y;
    private float z;

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector3D sumVector(Vector3D v) {
        float a;
        float b;
        float c;
        a = x + v.getX();
        b = y + v.getY();
        c = z + v.getZ();
        return new Vector3D(a, b, c);
    }

    public Vector3D subtractVector(Vector3D v) {
        float a;
        float b;
        float c;
        a = x - v.getX();
        b = y - v.getY();
        c = z - v.getZ();
        return new Vector3D(a, b, c);
    }

    public Vector3D multiplyScalar(float scalar) {
        float a;
        float b;
        float c;
        a = x * scalar;
        b = y * scalar;
        c = z * scalar;
        return new Vector3D(a, b, c);
    }

    public Vector3D divScalar(float scalar) {
        float a;
        float b;
        float c;
        a = x / scalar;
        b = y / scalar;
        c = z / scalar;
        return new Vector3D(a, b, c);
    }

    public float getLenght() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public Vector3D normalize() {
        float a = 0;
        float b = 0;
        float c = 0;
        float lenght = getLenght();
        if (lenght != 0) {
            a = x / lenght;
            b = y / lenght;
            c = z / lenght;
        }
        return new Vector3D(a, b, c);
    }


    public float scalarMultiply(Vector3D v) {
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
    }

    public Vector3D vectorMultiply(Vector3D v) {
        float newX = this.y * v.getZ() - this.z * v.getY();
        float newY = this.z * v.getX() - this.x * v.getZ();
        float newZ = this.x * v.getY() - this.y * v.getX();

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
