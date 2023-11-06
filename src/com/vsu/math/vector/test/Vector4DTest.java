package com.vsu.math.vector.test;

import com.vsu.math.vector.Vector4D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector4DTest {

    @Test
    void sumVector() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        Vector4D vector4D1 = new Vector4D(15, 5,3,7);
        System.out.println(vector4D.sumVector(vector4D1));
    }

    @Test
    void subtractVector() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        Vector4D vector4D1 = new Vector4D(15, 5,3,7);
        System.out.println(vector4D.subtractVector(vector4D1));
    }

    @Test
    void multiplyScalar() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        float scalar = 3;
        System.out.println(vector4D.multiplyScalar(scalar));
    }

    @Test
    void divScalar() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        float scalar = 3;
        System.out.println(vector4D.divScalar(scalar));
    }

    @Test
    void getLength() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        System.out.println(vector4D.getLength());
    }

    @Test
    void normalize() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        System.out.println(vector4D.normalize());
    }

    @Test
    void dotProduct() {
        Vector4D vector4D = new Vector4D(5, 5,5,0);
        Vector4D vector4D1 = new Vector4D(15, 5,3,7);
        System.out.println(vector4D.dotProduct(vector4D1));

    }
}