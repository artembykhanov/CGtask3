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

        double[][] matrix1 = {
                {-1,-2,-3},
                {-4,-5,-6},
                {-7,-8,-9}};
        Matrix3D matrix3D1 = new Matrix3D(matrix1);

        matrix3D.printMatrix();
        Matrix3D matrix3D2 = matrix3D.sumMatrix(matrix3D1);
        matrix3D2.printMatrix();
        matrix3D2 = matrix3D.subtractMatrix(matrix3D1);
        matrix3D2.printMatrix();
        Matrix3D matrix3D3 = new Matrix3D(true);
        matrix3D3.printMatrix();
        Matrix3D vectorCol = new Matrix3D(Matrix3D.setVectorCol(vector3D));
        vectorCol.printMatrix();
        System.out.println(matrix3D.multiplyVector(vectorCol));

    }
}