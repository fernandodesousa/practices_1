package Pratica_4;

import java.util.Scanner;

public class Operations_p4 {

    public void base_height () {

        double base;
        double height;
        double area;

        Scanner scan_base_height = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        base = scan_base_height.nextDouble();

        System.out.println("Insira o valor da altura: ");
        height = scan_base_height.nextDouble();

        area = (base * height)/2;

        System.out.println("A área do triângulo é " + area);
    }

    public void two_sides_an_angle () {

        double side_one;
        double side_two;
        double angle;
        double area;

        Scanner scan_two_sides_an_angle = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro lado: ");
        side_one = scan_two_sides_an_angle.nextDouble();

        System.out.println("Insira o valor do segundo lado: ");
        side_two = scan_two_sides_an_angle.nextDouble();

        System.out.println("Insira o ângulo que estes formam: ");
        angle = scan_two_sides_an_angle.nextDouble();

        angle = Math.toRadians(angle);

        area = side_one * side_two * Math.sin(angle) / 2;

        System.out.println("A área do triângulo é: " + area);
    }

    public void three_sides () {

        double side_one;
        double side_two;
        double side_three;
        double semi_perimeter;
        double area;


        Scanner scan_three_sides = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro lado: ");
        side_one = scan_three_sides.nextDouble();

        System.out.println("Insira o valor do segundo lado: ");
        side_two = scan_three_sides.nextDouble();

        System.out.println("Insira o valor do terceiro lado: ");
        side_three = scan_three_sides.nextDouble();

        semi_perimeter = (side_one + side_two + side_three)/2;

        area = Math.sqrt(semi_perimeter * (semi_perimeter - side_one) * (semi_perimeter - side_two) *
                (semi_perimeter - side_three));

        System.out.println("A área do triângulo é: " + area);
    }

    public void two_angles_a_side () {

        double side;
        double pow = 2;
        double first_angle;
        double second_angle;
        double area;

        Scanner scan_two_angles_a_side = new Scanner(System.in);

        System.out.println("Insira o valor do lado: ");
        side = scan_two_angles_a_side.nextDouble();

        System.out.println("Insira o primeiro ângulo: ");
        first_angle = scan_two_angles_a_side.nextDouble();

        System.out.println("Insira o valor do segundo ângulo: ");
        second_angle = scan_two_angles_a_side.nextDouble();

        first_angle = Math.toRadians(first_angle);
        second_angle = Math.toRadians(second_angle);

        area = ((Math.pow(side, pow)) * (Math.sin(first_angle)) * (Math.sin(second_angle)))
                / (2 * (Math.sin(first_angle + second_angle)));

        System.out.println("A área do triângulo é: " + area);

    }
}

