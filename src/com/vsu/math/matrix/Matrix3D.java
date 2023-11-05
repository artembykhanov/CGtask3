package com.vsu.math.matrix;

import com.vsu.math.vector.Vector3D;

public class Matrix3D {
    private float[][] matrix;

    public Matrix3D() {
        this.matrix = new float[3][3];
    }

    public Matrix3D(boolean isUnitMatrix) {
        if (isUnitMatrix) {
            this.matrix = new float[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}};
        } else {
            this.matrix = new float[3][3];
        }
    }

    public Matrix3D(float[][] matrix) {
        this.matrix = matrix;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public float getCell(int row, int col) {
        return matrix[row][col];
    }

    public static Matrix3D setVectorCol(Vector3D vector3D) {
        float[][] values = new float[][]{
                {vector3D.getX()},
                {vector3D.getY()},
                {vector3D.getZ()}};
        return new Matrix3D(values);
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

    public Matrix3D sumMatrix(Matrix3D matrix3D) {
        float[][] values = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] + matrix3D.getCell(i, j);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D subtractMatrix(Matrix3D matrix3D) {
        float[][] values = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] - matrix3D.getCell(i, j);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D multiplyVector(Matrix3D vectorCol) {
        float[][] values = new float[3][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][0] += matrix[i][j] * vectorCol.getCell(i, 0);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D multiplyMatrix(Matrix3D matrix3D) {
        float[][] values = new float[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < 3; k++) {
                    values[i][j] += matrix[i][k] * matrix3D.getCell(k, j);
                }
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D transpose() {
        float[][] transposed = new float[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return new Matrix3D(transposed);
    }

}
