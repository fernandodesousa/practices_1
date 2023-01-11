package Prática_3_Módulo_3;

import java.util.Scanner;

public class Alpha {
    Scanner scan_1 = new Scanner(System.in);

    String str_1;
    String str_2;
    double h;
    double r;
    double l;
    double w;

    public void papa () {

        Oscar obj_1 = new Oscar();
        Alpha obj_2 = new Alpha();
        System.out.println("\nO que você deseja calcular?\n1. Área\n2. Volume");
        str_1 = scan_1.nextLine();

        if (str_1.equals("1")) {
            System.out.println("Escolha a figura da qual quer conhecer a área:\n1. Cubo\n2. Cilindro\n3. Paralelepípedo");

            str_2 = scan_1.nextLine();
            switch (str_2) {
                case "1" -> {
                    System.out.println("Insira o valor da aresta:");
                    h = scan_1.nextDouble();
                    System.out.println("A área do cubo é " + obj_1.figures_surface(h) + " unidades\u00B2");
                }

                case "2" -> {
                    System.out.println("Insira o valor do rádio:");
                    r = scan_1.nextDouble();
                    System.out.println("Insira o valor da altura:");
                    h = scan_1.nextDouble();
                    System.out.println("A área do cilindro é " + obj_1.figures_surface(h, r) + " unidades\u00B2");
                }

                case "3" -> {
                    System.out.println("Insira o valor da altura:");
                    h = scan_1.nextDouble();
                    System.out.println("Insira o valor do comprimento:");
                    l = scan_1.nextDouble();
                    System.out.println("Insira o valor da largura:");
                    w = scan_1.nextDouble();
                    System.out.println("A área do paralelepípedo é " + obj_1.figures_surface(h, l, w) + " unidades\u00B2");
                }
                default -> {
                    System.out.println("O número inserido é incorreto.");
                    obj_2.papa();
                }
            }
        }

        else if (str_1.equals("2")) {
            System.out.println("Escolha a figura da qual quer conhecer o volume\n1. Cubo\n2. Cilindro\n3. Paralelepípedo");

            str_2 = scan_1.nextLine();
            switch (str_2) {
                case "1" -> {
                    System.out.println("Insira o valor da aresta:");
                    h = scan_1.nextDouble();
                    System.out.println("O volume do cubo é " + obj_1.figures_volume(h) + " unidades\u00B3");
                }

                case "2" -> {
                    System.out.println("Insira o valor do rádio:");
                    r = scan_1.nextDouble();
                    System.out.println("Insira o valor da altura:");
                    h = scan_1.nextDouble();
                    System.out.println("O volume do cilindro é " + (obj_1.figures_volume(h, r)) + " unidades\u00B3");
                }

                case "3" -> {
                    System.out.println("Insira o valor da altura:");
                    h = scan_1.nextDouble();
                    System.out.println("Insira o valor do comprimento:");
                    l = scan_1.nextDouble();
                    System.out.println("Insira o valor da largura:");
                    w = scan_1.nextDouble();
                    System.out.println("O volume do paralelepípedo é " + obj_1.figures_volume(h, l, w) + " unidades\u00B3");
                }

                default -> {
                    System.out.println("O número inserido é incorreto.");
                    obj_2.papa();
                }
            }
        }

        else {
            System.out.println("O número inserido é incorreto.");
            obj_2.papa();
        }
    }
}
