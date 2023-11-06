package com.vsu.math.matrix.test;

import com.vsu.math.matrix.Matrix4D;
import com.vsu.math.vector.Vector3D;
import com.vsu.math.vector.Vector4D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix4DTest {

    @Test
    void sumMatrix() {
        float[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };
        float[][] matrix1 = {
                {1, 2, 3, 10},
                {4, 5, 6, 4},
                {70, 8, 10, 4},
                {7, 8, 9, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D matrix4D1 = new Matrix4D(matrix1);
        Matrix4D result = matrix4D.sumMatrix(matrix4D1);
        result.printMatrix();
    }

    @Test
    void subtractMatrix() {
        float[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };
        float[][] matrix1 = {
                {1, 2, 3, 10},
                {4, 5, 6, 4},
                {70, 8, 10, 4},
                {7, 8, 9, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D matrix4D1 = new Matrix4D(matrix1);
        Matrix4D result = matrix4D.subtractMatrix(matrix4D1);
        result.printMatrix();
    }

    @Test
    void multiplyVector() {
        float[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };
        Vector4D vector4D = new Vector4D(5, 5,5,2);
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D result = matrix4D.multiplyVector(vector4D);
        result.printMatrix();
    }

    @Test
    void multiplyMatrix() {
        float[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };
        float[][] matrix1 = {
                {1, 2, 3, 10},
                {4, 5, 6, 4},
                {70, 8, 10, 4},
                {7, 8, 9, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D matrix4D1 = new Matrix4D(matrix1);
        Matrix4D result = matrix4D.multiplyMatrix(matrix4D1);
        result.printMatrix();
    }

    @Test
    void transpose() {
        float[][] matrix = {
                {1, 2, 3, 10},
                {4, 5, 6, 4},
                {70, 8, 10, 4},
                {7, 8, 9, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D result = matrix4D.transpose();
        result.printMatrix();
    }
}