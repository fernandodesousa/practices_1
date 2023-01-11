import java.util.Scanner;

public class operations {
    public static void operations_1() {
        int passengers = (int) (Math.random() * (19980 - 670 + 1) + 670);
        int passengers_bus = (int) (Math.random() * (783 - 70 + 1) + 70);
        int input;
        int input_1;

        tube tube_1 = new tube();
        bus bus_1 = new bus();

        Scanner scan_1 = new Scanner(System.in);

        System.out.println("\nDo que deseja calcular a capacidade: \n1. Metro.\n2. Autocarro.");
        input = scan_1.nextInt();
        if (input == 1) {
            System.out.println("Insira um número de passageiros entre 670 e 19980 ou insira 0 (zero) para gerar um número aleatório:");
            input_1 = scan_1.nextInt();

            if (input_1 == 0) {
                tube_1.calculate_capacity(passengers);
            }

            else if (input_1 > 670 && input_1 < 19980) {
                tube_1.calculate_capacity(input_1);
            }

            else {
                System.out.println("Número incorreto. Tente de novo.");
                operations_1();
            }
        }

        else if (input == 2) {
            System.out.println("Insira um número de passageiros entre 70 e 783 ou insira 0 (zero) para gerar um número aleatório:");
            input_1 = scan_1.nextInt();

            if (input_1 == 0) {
                bus_1.calculate_capacity_bus(passengers_bus);
            }

            else if (input_1 > 70 && input_1 < 783) {
                bus_1.calculate_capacity_bus(input_1);
            }

            else {
                System.out.println("Número incorreto. Tente de novo.");
                operations_1();
            }

        }

        else {
            System.out.println("Número incorreto. Tente de novo.");
            operations_1();
        }
    }
}
