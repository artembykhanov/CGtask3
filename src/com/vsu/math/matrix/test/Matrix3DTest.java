package com.vsu.math.matrix.test;

import com.vsu.math.matrix.Matrix3D;
import com.vsu.math.vector.Vector3D;
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
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D result = matrix3D.sumMatrix(matrix3D1);
        result.printMatrix();
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
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D result = matrix3D.subtractMatrix(matrix3D1);
        result.printMatrix();
    }

    @Test
    void multiplyVector() {
        float[][] matrix = {
                {1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};
        Vector3D vector3D = new Vector3D(5, 5,5);
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D result = matrix3D.multiplyVector(vector3D);
        result.printMatrix();
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
        Matrix3D matrix3D = new Matrix3D(matrix);
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D result = matrix3D.multiplyMatrix(matrix3D1);
        result.printMatrix();
    }

    @Test
    void transpose() {
        float[][] matrix1 = {
                {1, 2, 22},
                {1, 0, 0},
                {71, 8, 10}};
        Matrix3D matrix3D1 = new Matrix3D(matrix1);
        Matrix3D result = matrix3D1.transpose();
        result.printMatrix();
    }
}