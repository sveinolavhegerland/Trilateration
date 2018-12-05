package no.bouvet.Trilaterering;

import static no.bouvet.Trilaterering.MyMatrix.multiplicar;

public class Main {

    public static void main(String[] args) {

        Double[][] A = {{1.00, 0.0}, {0.0, 1.0}};
        Double[][] B = {{4.0, 4.0}, {2.0, 2.0}};

        MyMatrix matrix = new MyMatrix(A,B);
        Double[][] result = multiplicar(matrix.A, matrix.B);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

    }
}
