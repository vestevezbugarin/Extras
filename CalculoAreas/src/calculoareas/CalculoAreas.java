package calculoareas;

import java.util.*;

public class CalculoAreas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        byte selec = 0;

        System.out.println("\n***********************************************************************"
                + "\n                           Calculadora de áreas                        "
                + "\n***********************************************************************");
        do {
            System.out.println("\nSelecciona de que queres calcular a area:"
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

                    Rectangulo rect1 = new Rectangulo(base, altura);
                    System.out.println("A area do Rectangulo é :" + rect1.calculo(base, altura));

                    break;
                case 2:
                    System.out.println("\n***********************************************************************"
                            + "\n                            Triangulo                                 "
                            + "\n***********************************************************************"
                            + "\nIntroduce os valores necesareos para realizar os calculos:"
                            + "\nBase:");
                    float baseT = teclado.nextFloat();
                    System.out.println("Altura: ");
                    float alturaT = teclado.nextFloat();

                    Triangulo tria1 = new Triangulo(baseT, alturaT);
                    System.out.println("A área do Triangulo é:" + tria1.calculo(baseT, alturaT));

                    break;
                case 3:
                    System.out.println("\n***********************************************************************"
                            + "\n                            Circulo                                 "
                            + "\n***********************************************************************"
                            + "\nIntroduce os valores necesareos para realizar os calculos:"
                            + "\nRadio:");
                    float radio = teclado.nextFloat();
                    Circulo circ1 = new Circulo(radio);
                    

                    break;
                case 4:
                    System.out.println("\n***********************************************************************"
                            + "\n                            Trapecio                                 "
                            + "\n***********************************************************************"
                            + "\nIntroduce os valores necesareos para realizar os calculos:"
                            + "\nBase Mayor:");
                    float baseMayor = teclado.nextFloat();
                    System.out.println("Base Menor: ");
                    float baseMenor = teclado.nextFloat();
                    System.out.println("Altura: ");
                    float alto = teclado.nextFloat();
                    break;
                default:
                    System.out.println("Esta opción non está contemplada.");
                    break;
            }

        } while (selec != 0);

    }

}
