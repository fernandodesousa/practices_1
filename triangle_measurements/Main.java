package Pratica_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations_p4 Operations_p4_object = new Operations_p4();
        Scanner scan_main_0 = new Scanner(System.in);
        int in_0;

        System.out.println("""
                
                Calcular a área de um triângulo.
                
                Escolha o método de acordo aos dados que possue:
                
                1. Base e altura.
                2. Dois lados e o ângulo gerado por estes lados.
                3. Três lados.
                4. Dois ângulos e o lado entre estes ângulos.""");

        in_0 = scan_main_0.nextInt();

        switch (in_0) {
            case 1 -> Operations_p4_object.base_height();
            case 2 -> Operations_p4_object.two_sides_an_angle();
            case 3 -> Operations_p4_object.three_sides();
            case 4 -> Operations_p4_object.two_angles_a_side();
        }
    }
}
