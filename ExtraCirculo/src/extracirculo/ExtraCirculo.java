package extracirculo;

import java.util.*;

public class ExtraCirculo {

    /*
     * Codifica un programa que calcule a lonxitude, area e o volume dun circulo/esfera.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean validar;
        float radio;

        System.out.println("*******************************************************\n"
                + "|         Cálculos con Círculos e Esferas             |\n"
                + "*******************************************************\n"
                + "|         Lonxitude = 2 · PI · Radio                  |\n"
                + "*******************************************************\n"
                + "|         Area = PI · Radio²                          |\n"
                + "*******************************************************\n"
                + "|         Volume =  4 · PI · Radio³ / 3               |\n"
                + "*******************************************************\n");
        do {
            System.out.println("Introduce o radio en cm da circumferencia ou do "
                    + "sector central da esfera: ");
            radio = teclado.nextFloat();
            if (radio <= 0) {
                System.out.print("O radio non pode ser 0 ou negativo!");
                validar = false;
            } else {
                validar = true;
            }

        } while (validar == true);
        System.out.println("A longitude é :" + 2 * Math.PI * radio);
        System.out.println("O area é : :" + Math.PI * Math.pow(radio, 2));
        System.out.println("O volume é :" + 4 * Math.PI * Math.pow(radio, 3) / 3);

    }

}
