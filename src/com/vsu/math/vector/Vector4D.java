package com.vsu.math.vector;

public class Vector4D {
    private float x;
    private float y;
    private float z;
    private float w;

    public Vector4D(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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

    public float getW() {
        return w;
    }

    public Vector4D sumVector(Vector4D v) {
        float a;
        float b;
        float c;
        float d;
        a = x + v.getX();
        b = y + v.getY();
        c = z + v.getZ();
        d = w + v.getW();
        return new Vector4D(a, b, c, d);
    }

    public Vector4D subtractVector(Vector4D v) {
        float a;
        float b;
        float c;
        float d;
        a = x - v.getX();
        b = y - v.getY();
        c = z - v.getZ();
        d = w - v.getW();
        return new Vector4D(a, b, c, d);
    }

    public Vector4D multiplyScalar(float scalar) {
        float a;
        float b;
        float c;
        float d;
        a = x * scalar;
        b = y * scalar;
        c = z * scalar;
        d = w * scalar;
        return new Vector4D(a, b, c, d);
    }

    public Vector4D divScalar(float scalar) {
        float a;
        float b;
        float c;
        float d;
        a = x / scalar;
        b = y / scalar;
        c = z / scalar;
        d = w / scalar;
        return new Vector4D(a, b, c, d);
    }

    public float getLenght() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public Vector4D normalize() {
        float a = 0;
        float b = 0;
        float c = 0;
        float d = 0;
        float lenght = getLenght();
        if (lenght != 0) {
            a = x / lenght;
            b = y / lenght;
            c = z / lenght;
            d = w / lenght;
        }
        return new Vector4D(a, b, c, d);
    }

    public float scalarMultiply(Vector4D v) {
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
