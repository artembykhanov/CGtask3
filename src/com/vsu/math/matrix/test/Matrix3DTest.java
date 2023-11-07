package com.vsu.math.matrix.test;

import com.vsu.math.matrix.Matrix3D;
import com.vsu.math.vector.Vector3D;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3DTest {

    @Test
    void sumMatrix() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        float[][] matrix1 = {
                {1, 2, 22},
                {1, 0, 0},
                {71, 8, 10}};
        float[][] result1 = {
                {2, 4, 25},
                {5, 5, 4},
                {78, 16, 19}};
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D check = matrix3D.sumMatrix(matrix3D1);
        Matrix3D result = new Matrix3D(result1);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void subtractMatrix() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        float[][] matrix1 = {
                {1, 2, 22},
                {1, 0, 0},
                {71, 8, 10}};
        float[][] result1 = {
                {0, 0, -19},
                {3, 5, 4},
                {-64, 0, -1}};
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D check = matrix3D.subtractMatrix(matrix3D1);
        Matrix3D result = new Matrix3D(result1);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void multiplyVector() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        float[][] vector = {
                {30},
                {65},
                {120}};
        Vector3D vector3D = new Vector3D(5, 5, 5);
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D check = matrix3D.multiplyVector(vector3D);
        Matrix3D result = new Matrix3D(vector);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void multiplyMatrix() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        float[][] matrix1 = {
                {1, 2, 22},
                {1, 0, 0},
                {71, 8, 10}};
        float[][] result1 = {
                {216, 26, 52},
                {293, 40, 128},
                {654, 86, 244}};
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D check = matrix3D.multiplyMatrix(matrix3D1);
        Matrix3D result = new Matrix3D(result1);
        Assertions.assertTrue(check.equalsAns(result));
    }

    @Test
    void transpose() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        float[][] result1 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 4, 9}};
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D check = matrix3D.transpose();
        Matrix3D result = new Matrix3D(result1);
        Assertions.assertTrue(check.equalsAns(result));
    }
}