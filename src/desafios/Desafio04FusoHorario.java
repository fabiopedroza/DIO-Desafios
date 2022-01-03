package desafios;

import java.util.Scanner;

public class Desafio04FusoHorario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();


        int ajuste = 0;

        //Escreva a sua lógica aqui
        if (((horasaida + tempoviagem + fuso) ==  24)
                || ((horasaida + tempoviagem - fuso) ==  24)) {
            ajuste = 0;
        }
        else if ((horasaida + tempoviagem + fuso) > 24) {
            ajuste = (horasaida + tempoviagem + fuso) - 24;
        }
        else if ((horasaida + tempoviagem - fuso) > 24) {
            ajuste = (horasaida + tempoviagem - fuso) - 24;
        }
        else {
            ajuste = (horasaida + tempoviagem + fuso);
        }


        System.out.println(ajuste);

        sc.close();
    }
}
