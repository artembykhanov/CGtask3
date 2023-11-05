package com.vsu.math.matrix;

import com.vsu.math.vector.Vector3D;
import com.vsu.math.vector.Vector4D;

public class Matrix4D {
    private float[][] matrix;

    public Matrix4D() {
        this.matrix = new float[4][4];
    }

    public Matrix4D(boolean isUnitMatrix) {
        if (isUnitMatrix) {
            this.matrix = new float[][]{
                    {1, 0, 0, 0},
                    {0, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}};
        } else {
            this.matrix = new float[4][4];
        }
    }

    public Matrix4D(float[][] matrix) {
        this.matrix = matrix;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public float getCell(int row, int col) {
        return matrix[row][col];
    }

    public static Matrix4D setVectorCol(Vector4D vector4D) {
        float[][] values = new float[][]{
                {vector4D.getX()},
                {vector4D.getY()},
                {vector4D.getZ()},
                {vector4D.getW()}};
        return new Matrix4D(values);
    }


    public void printMatrix() {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix4D sumMatrix(Matrix4D matrix4D) {
        float[][] values = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] + matrix4D.getCell(i, j);
            }
        }
        return new Matrix4D(values);
    }

    public Matrix4D subtractMatrix(Matrix4D matrix4D) {
        float[][] values = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] - matrix4D.getCell(i, j);
            }
        }
        return new Matrix4D(values);
    }

    public Matrix4D multiplyVector(Matrix4D vectorCol) {
        float[][] values = new float[4][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][0] += matrix[i][j] * vectorCol.getCell(i, 0);
            }
        }
        return new Matrix4D(values);
    }

    public Matrix4D multiplyMatrix(Matrix4D matrix4D) {
        float[][] values = new float[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < 3; k++) {
                    values[i][j] += matrix[i][k] * matrix4D.getCell(k, j);
                }
            }
        }
        return new Matrix4D(values);
    }

    public Matrix4D transpose() {
        float[][] transposed = new float[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return new Matrix4D(transposed);
    }


}