import com.vsu.math.matrix.*;
import com.vsu.math.vector.*;

public class Main {
    public static void main(String[] args) {
        float[][] matrix = {
                {1, 2, 3, 10},
                {4, 5, 6, 4},
                {70, 8, 10, 4},
                {7, 8, 9, 4}
        };
        float[][] result1 = {
                {1, 4, 70, 7},
                {2, 5, 8, 4},
                {3, 6, 8, 9},
                {10, 10, 4, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);
        Matrix4D check = matrix4D.transpose();
        check.printMatrix();

    }
}