package com.vsu.math.vector;

public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2D sumVector(Vector2D v) {
        float a;
        float b;
        a = (x + v.getX());
        b = (y + v.getY());
        return new Vector2D(a, b);
    }

    public Vector2D subtractVector(Vector2D v) {
        float a;
        float b;
        a = x - v.getX();
        b = y - v.getY();
        return new Vector2D(a, b);
    }

    public Vector2D multiplyScalar(float scalar) {
        float a;
        float b;
        a = x * scalar;
        b = y * scalar;
        return new Vector2D(a, b);
    }

    public Vector2D divScalar(float scalar) {
        float a;
        float b;
        a = x / scalar;
        b = y / scalar;
        return new Vector2D(a, b);
    }

    public float getLenght() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public Vector2D normalize() {
        float a = 0;
        float b = 0;
        float lenght = getLenght();
        if (lenght != 0) {
            a = x / lenght;
            b = y / lenght;
        }
        return new Vector2D(a, b);
    }

    public float dotproduct(Vector2D v) {
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
