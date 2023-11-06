package com.vsu.math.vector.test;

import com.vsu.math.vector.Vector3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {

    @Test
    void sumVector() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        Vector3D vector3D1 = new Vector3D(15, 5,3);
        System.out.println(vector3D.sumVector(vector3D1));
    }

    @Test
    void subtractVector() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        Vector3D vector3D1 = new Vector3D(15, 5,3);
        System.out.println(vector3D.subtractVector(vector3D1));
    }

    @Test
    void multiplyScalar() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        float scalar = 3;
        System.out.println(vector3D.multiplyScalar(scalar));
    }

    @Test
    void divScalar() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        float scalar = 3;
        System.out.println(vector3D.divScalar(scalar));
    }

    @Test
    void getLength() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        System.out.println(vector3D.getLength());
    }

    @Test
    void normalize() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        System.out.println(vector3D.normalize());
    }

    @Test
    void dotProduct() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        Vector3D vector3D1 = new Vector3D(15, 5,3);
        System.out.println(vector3D.dotProduct(vector3D1));
    }

    @Test
    void vectorMultiply() {
        Vector3D vector3D = new Vector3D(5, 5,5);
        Vector3D vector3D1 = new Vector3D(15, 5,3);
        System.out.println(vector3D.vectorMultiply(vector3D1));
    }
}