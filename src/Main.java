import com.vsu.math.matrix.*;
import com.vsu.math.vector.*;

public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(1, 1);
        Vector2D vector2D1 = new Vector2D(10, 0);
        System.out.println(vector2D.sumVector(vector2D1));
        System.out.println(vector2D.getLength());
        System.out.println(vector2D.normalize());
        System.out.println("----------------");

        Vector4D vector3D = new Vector4D(0, 0, 10, 0);
        Vector4D vector3D1 = new Vector4D(0, 10, 0, 10);
        Vector4D vector3D2 = vector3D.sumVector(vector3D1);
        System.out.println(vector3D2);
        System.out.println("----------------");
        float[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };
        Matrix4D matrix4D = new Matrix4D(matrix);


        matrix4D.printMatrix();
        System.out.println("----------------");
        System.out.println("----------------");
        Matrix4D vectorRes = matrix4D.multiplyVector(vector3D);
        vectorRes.printMatrix();
        System.out.println("----------------");
        Matrix4D newMat = matrix4D.transpose();
        newMat.printMatrix();
        System.out.println("----------------");
        Matrix4D res = matrix4D.multiplyMatrix(newMat);
        res.printMatrix();

    }
}