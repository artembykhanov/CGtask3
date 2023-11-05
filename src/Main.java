public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(0,10);
        Vector2D vector2D1 = new Vector2D(10,0);
        System.out.println(vector2D);
        vector2D.sumVector(vector2D1);
        System.out.println(vector2D);
        System.out.println(vector2D.getLenght());
        System.out.println("----------------");
        Vector3D vector3D = new Vector3D(0,0,10);
        Vector3D vector3D1 = new Vector3D(0,10,0);
        Vector3D vector3D2 = vector3D.vectorMultiply(vector3D1);
        System.out.println(vector3D2);
        System.out.println("----------------");
        double[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        Matrix3D matrix3D = new Matrix3D(matrix);



        matrix3D.printMatrix();
        Matrix3D vectorCol = Matrix3D.setVectorCol(vector3D);
        vectorCol.printMatrix();
        Matrix3D vectorRes = matrix3D.multiplyVector(vectorCol);
        vectorRes.printMatrix();
        Matrix3D newMat =  matrix3D.transpose();
        newMat.printMatrix();

    }
}