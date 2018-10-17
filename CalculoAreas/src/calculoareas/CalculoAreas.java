package calculoareas;

import java.util.*;

public class CalculoAreas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        byte selec = 0;

        do {
            System.out.println("\n***********************************************************************"
                    + "\n                           Calculadora de areas                        "
                    + "\n***********************************************************************"
                    + "\nSelecciona de que queres calcular a area:"
                    + "\n1.- Rectangulo/Cadrado            2.- Triangulo"
                    + "\n3.- Circulo                       4.- Trapecio"
                    + "\n--             Pulsa 0 para sair            --");
            byte a = teclado.nextByte();

            switch (a) {
                case 1:
                    System.out.println("\n***********************************************************************"
                            + "\n                            Rectangulo                                 "
                            + "\n***********************************************************************"
                            + "\nIntroduce os valores necesareos para realizar os calculos:"
                            + "\nBase:");
                    float base = teclado.nextFloat();
                    System.out.println("Altura: ");
                    float altura = teclado.nextFloat();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        } while (selec != 0);

    }

}
