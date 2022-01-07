package desafios;

import java.math.BigInteger;
import java.util.Scanner;

public class Desafio02Graos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int numCasasTabuleiro = sc.nextInt();

            BigInteger quantGraos = BigInteger.valueOf(2);

            quantGraos = quantGraos.pow(numCasasTabuleiro);

            BigInteger quantKg = quantGraos.divide(BigInteger.valueOf(12000));

            System.out.println(quantKg + " kg");

        }
        sc.close();
    }
}
