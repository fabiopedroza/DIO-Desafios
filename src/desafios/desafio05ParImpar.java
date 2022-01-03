package desafios;

import java.io.IOException;
import java.util.Scanner;

public class desafio05ParImpar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X;
        for (int i = 0; i < N; i++) {

            //complete sua solução aqui.
            X = leitor.nextInt();
            if (X == 0) {
                System.out.print("NULL ");
            } else if ((X % 2) == 0) {
                System.out.print("EVEN ");  // resultado com valor par
            } else if ((X % 2) != 0) {
                System.out.print("ODD ");  // resultado com valor ímpar
            }
            if (X > 0) {
                System.out.println("POSITIVE");
            } else {
                System.out.println("NEGATIVE");
            }

        }
        leitor.close();
    }
}
