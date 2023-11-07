package com.vsu.math.vector.test;

import com.vsu.math.vector.Vector3D;
import com.vsu.math.vector.Vector4D;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector4DTest {

    @Test
    void sumVector() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 0);
        Vector4D vector4D1 = new Vector4D(15, 5, 3, 7);
        Vector4D check = vector4D.sumVector(vector4D1);
        Vector4D result = new Vector4D(20, 10, 8, 7);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void subtractVector() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 0);
        Vector4D vector4D1 = new Vector4D(15, 5, 3, 7);
        Vector4D check = vector4D.subtractVector(vector4D1);
        Vector4D result = new Vector4D(-10, 0, 2, -7);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void multiplyScalar() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 5);
        float scalar = 3;
        Vector4D check = vector4D.multiplyScalar(scalar);
        Vector4D result = new Vector4D(15, 15, 15, 15);

        Assertions.assertTrue(result.equalsAns(check));
    }

    @Test
    void divScalar() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 5);
        float scalar = 5;
        Vector4D check = vector4D.divScalar(scalar);
        Vector4D result = new Vector4D(1, 1, 1, 1);
        Assertions.assertTrue(result.equalsAns(check));
    }

    @Test
    void getLength() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 5);
        float check = vector4D.getLength();
        float result = 10f;
        Assertions.assertEquals(check, result, 1e-4);
    }

    @Test
    void normalize() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 5);
        Vector4D check = vector4D.normalize();
        Vector4D result = new Vector4D(5 / 10f, 5 / 10f, 5 / 10f, 5 / 10f);
        Assertions.assertEquals(check.getX(), result.getX(), 1e-4);
        Assertions.assertEquals(check.getY(), result.getY(), 1e-4);
        Assertions.assertEquals(check.getZ(), result.getZ(), 1e-4);
        Assertions.assertEquals(check.getW(), result.getW(), 1e-4);
    }

    @Test
    void dotProduct() {
        Vector4D vector4D = new Vector4D(5, 5, 5, 5);
        Vector4D vector4D1 = new Vector4D(15, 5, 3, 1);
        float check = vector4D.dotProduct(vector4D1);
        float result = 120;
        Assertions.assertEquals(check, result, 1e-4);

    }
}