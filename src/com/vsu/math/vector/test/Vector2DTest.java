package com.vsu.math.vector.test;

import com.vsu.math.vector.Vector2D;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    @org.junit.jupiter.api.Test
    void sumVector() {
        Vector2D vector2D = new Vector2D(5, 5);
        Vector2D vector2D1 = new Vector2D(15, 5);
        System.out.println(vector2D.sumVector(vector2D1));
    }

    @org.junit.jupiter.api.Test
    void subtractVector() {
        Vector2D vector2D = new Vector2D(5, 5);
        Vector2D vector2D1 = new Vector2D(15, 5);
        System.out.println(vector2D.subtractVector(vector2D1));
    }

    @org.junit.jupiter.api.Test
    void multiplyScalar() {
        Vector2D vector2D = new Vector2D(5, 5);
        float scalar = 5;
        System.out.println(vector2D.multiplyScalar(scalar));
    }

    @org.junit.jupiter.api.Test
    void divScalar() {
        Vector2D vector2D = new Vector2D(5, 5);
        float scalar = 5;
        System.out.println(vector2D.divScalar(scalar));
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        Vector2D vector2D = new Vector2D(5, 5);
        System.out.println(vector2D.getLength());
    }

    @org.junit.jupiter.api.Test
    void normalize() {
        Vector2D vector2D = new Vector2D(5, 5);
        System.out.println(vector2D.normalize());
    }

    @org.junit.jupiter.api.Test
    void dotProduct() {
        Vector2D vector2D = new Vector2D(5, 5);
        Vector2D vector2D1 = new Vector2D(1, 10);
        System.out.println(vector2D.dotProduct(vector2D1));
    }
}