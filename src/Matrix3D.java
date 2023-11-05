import java.util.Arrays;

public class Matrix3D {
    private double[][] matrix;

    public Matrix3D() {
        this.matrix = new double[3][3];
    }

    public Matrix3D(boolean isUnitMatrix) {
        if (isUnitMatrix) {
            this.matrix = new double[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}};
        } else {
            this.matrix = new double[3][3];
        }
    }

    public Matrix3D(double[][] matrix) {
//        if (matrix.length != 3 || matrix[0].length != 3) {
//            throw new IllegalArgumentException();
//        }
        this.matrix = matrix;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public double getCell(int row, int col) {
        return matrix[row][col];
    }

    public static Matrix3D setVectorCol(Vector3D vector3D) {
        double[][] values = new double[][]{
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
        double[][] values = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] + matrix3D.getCell(i, j);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D subtractMatrix(Matrix3D matrix3D) {
        double[][] values = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][j] = matrix[i][j] - matrix3D.getCell(i, j);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D multiplyVector(Matrix3D vectorCol) {
        double[][] values = new double[3][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                values[i][0] += matrix[i][j] * vectorCol.getCell(i, 0);
            }
        }
        return new Matrix3D(values);
    }

    public Matrix3D transpose() {
        double[][] transposed = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i]=matrix[i][j];
            }
        }
        return new Matrix3D(transposed);
    }

}
