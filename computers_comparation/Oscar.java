package Prática_4_Módulo_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Oscar {
    Scanner sierra_1 = new Scanner(System.in);
    static ArrayList<Charlie> computers = new ArrayList<>();

    public void read_specifications() {
        String product_name, processor, graphics;
        int memory, storage_sort, storage = 0, storage_1;
        double screen, price;

        int i, number_of_devices;

        Oscar obj_1 = new Oscar();

        do {
            System.out.println("Qual o número de computadores a guardar?");
            number_of_devices = sierra_1.nextInt();
        }
        while (number_of_devices < 0);
        sierra_1.nextLine();

        for (i = 1; i <= number_of_devices; i++) {
            System.out.println("COMPUTADOR NÚMERO " + i);

            System.out.println("Nome do computador: ");
            product_name = sierra_1.nextLine();

            System.out.println("Processador: ");
            processor = sierra_1.nextLine();

            System.out.println("Ecrã [Polgadas]: ");
            screen = sierra_1.nextDouble();

            System.out.println("Memória RAM [GB]: ");
            memory = sierra_1.nextInt();

            System.out.println("O seu armazenamento é em GB ou em TB:\n1. GB\n2. TB ");
            storage_sort = sierra_1.nextInt();
            if (storage_sort == 1) {
                System.out.println("Armazenamento [GB]: ");
                storage = sierra_1.nextInt();
            }

            else if (storage_sort == 2) {
                System.out.println("Armazenamento [TB]: ");
                storage_1 = sierra_1.nextInt();
                storage = storage_1 * 1024;
            }
            else {
                System.out.println("Número incorreto.");
            }
            sierra_1.nextLine();

            System.out.println("Gráficos [GPU]: ");
            graphics = sierra_1.nextLine();

            System.out.println("Preço [€]: ");
            price = sierra_1.nextDouble();

            sierra_1.nextLine();
            Charlie ref = new Charlie(product_name, processor, screen, memory, storage, storage_sort, graphics, price);

            computers.add(ref);
        }
            
        System.out.println("Já guardou todos os computadores.");
            obj_1.operations();
    }

    public void operations_1 () {
        int option;
        Scanner sierra_2 = new Scanner(System.in);
        Oscar obj_4 = new Oscar();

        System.out.println("""
                
                O que deseja fazer a seguir?
                
                1. Outras comparações entre computadores
                0. Acabar o programa""");

        option = sierra_2.nextInt();
        if (option == 1) {
            obj_4.operations();
        }
        else if (option == 0) {
            System.exit(0);
        }
        else {
            System.out.println("Número incorreto.");
            obj_4.operations_1();
        }
    }

    public void operations () {
        int operation;

        Oscar obj_2 = new Oscar();

        System.out.println("""                             
                                           
                Qual a operação que deseja completar?
                                
                1. Imprimir todas as caraterísticas de um determinado computador
                2. Imprimir a mesma característica de todos os computadores
                3. Saber qual o mais barato e o mais caro
                4. Saber qual tem maior memória RAM
                5. Saber qual tem maior armazenamento
                6. Saber qual tem o maior e o menor ecrã""");

        operation = sierra_1.nextInt();

        switch (operation) {
            case 1 -> obj_2.printing_specifications();

            case 2 -> {
                int india_1;
                System.out.println("""
                        Qual a característica que deseja imprimir:
                        1. Processador
                        2. Ecrã
                        3. Memória RAM
                        4. Armazenamento
                        5. Gráficos GPU
                        6. Preço""");

                india_1 = sierra_1.nextInt();

                switch (india_1) {
                    case 1 -> {
                        System.out.println("\nProcessador:\n");
                        for (Charlie j_1 : computers) {
                            System.out.println(j_1.product_name + " -> " + j_1.processor);
                        }
                        obj_2.operations_1();
                    }

                    case 2 -> {
                        System.out.println("\nEcrã:\n");
                        for (Charlie j_2 : computers) {
                            System.out.println(j_2.product_name + " -> " + j_2.screen + "\"");
                        }
                        obj_2.operations_1();
                    }

                    case 3 -> {
                        System.out.println("\nMemória RAM:\n");
                        for (Charlie j_3 : computers) {
                            System.out.println(j_3.product_name + " -> " + j_3.memory + " GB");
                        }
                        obj_2.operations_1();
                    }

                    case 4 -> {
                        System.out.println("\nArmazenamento:\n");
                        for (Charlie j_4 : computers) {
                            if (j_4.storage_sort == 1) {
                                System.out.println(j_4.product_name + " -> " + j_4.storage + " GB");
                            }
                            else {
                                System.out.println(j_4.product_name + " -> " + j_4.storage / 1024 + " TB");
                            }
                        }
                        obj_2.operations_1();
                    }

                    case 5 -> {
                        System.out.println("\nGráficos GPU:\n");
                        for (Charlie j_5 : computers) {
                            System.out.println(j_5.product_name + " -> " + j_5.graphics);
                        }
                        obj_2.operations_1();
                    }

                    case 6 -> {
                        System.out.println("\nPreço:\n");
                        for (Charlie j_6 : computers) {
                            System.out.println(j_6.product_name + " -> " + j_6.price + " €");
                        }
                        obj_2.operations_1();
                    }
                    default -> {
                        System.out.println("Número incorreto");
                        obj_2.operations();
                    }
                }
            }

            case 3 -> {
                double highest_price = 0;
                double lowest_price = 0;

                for (Charlie i_3 : computers) {
                    if (i_3.price > highest_price) {
                        highest_price = i_3.price;
                    }
                }

                System.out.println("\nO computador com o maior preço [" + highest_price + " €] é:");
                for (Charlie i_4 : computers) {
                    if (i_4.price == highest_price) {
                        System.out.println(i_4.product_name);
                    }
                }

                for (Charlie i_5 : computers) {
                    if (i_5.price < highest_price) {
                        lowest_price = i_5.price;
                    }
                }

                System.out.println("\nO computador com o menor preço [" + lowest_price + " €] é:");
                for (Charlie i_6 : computers) {
                    if (i_6.price == lowest_price) {
                        System.out.println(i_6.product_name);
                    }
                }
                obj_2.operations_1();
            }

            case 4 -> {
                int highest_memory = 0;

                for (Charlie i_7 : computers) {
                    if (i_7.memory > highest_memory) {
                        highest_memory = i_7.memory;
                    }
                }

                System.out.println("\nO computador com a maior memória RAM [" + highest_memory + " GB] é:");
                for (Charlie i_8 : computers) {
                    if (i_8.memory == highest_memory) {
                        System.out.println(i_8.product_name);
                    }
                }
                obj_2.operations_1();
            }

            case 5 -> {
                int highest_storage = 0;

                for (Charlie i_9 : computers) {
                    if (i_9.storage > highest_storage) {
                        highest_storage = i_9.storage;
                    }
                }

                System.out.println("\nO computador com o maior armazenamento é: ");
                for (Charlie i_10 : computers) {
                    if (i_10.storage == highest_storage) {
                        if (i_10.storage_sort == 2) {
                            highest_storage = highest_storage / 1024;
                            System.out.println(i_10.product_name + " [" + highest_storage + " TB]");
                        }
                        else if (i_10.storage_sort == 1) {
                            System.out.println(i_10.product_name + " [" + highest_storage + " GB]");
                        }
                        else {
                            System.out.println("Número incorreto.");
                            obj_2.operations();
                        }
                    }
                }
                obj_2.operations_1();
            }


            case 6 -> {
                double widest_screen = 0;
                double narrowest_screen = 0;

                for (Charlie i_11 : computers) {
                    if (i_11.screen > widest_screen) {
                        widest_screen = i_11.screen;
                    }
                }

                System.out.println("\nO computador com o maior ecrã [" + widest_screen + "\"] é:");
                for (Charlie i_12 : computers) {
                    if (i_12.screen == widest_screen) {
                        System.out.println(i_12.product_name);
                    }
                }

                for (Charlie i_13 : computers) {
                    if (i_13.screen < widest_screen) {
                        narrowest_screen = i_13.screen;
                    }
                }

                System.out.println("\nO computador com o menor ecrã [" + narrowest_screen + "\"] é:");
                for (Charlie i_14 : computers) {
                    if (i_14.screen == narrowest_screen) {
                        System.out.println(i_14.product_name);

                    }
                }
                obj_2.operations_1();
            }
        }
    }

    public void printing_specifications() {
        int computer_num;

        Oscar obj_3 = new Oscar();

        System.out.println("Insira o número do computador: ");
        computer_num = sierra_1.nextInt() - 1;

        System.out.println("Modelo:        " + computers.get(computer_num).product_name +
                "\nProcessador:   " + computers.get(computer_num).processor +
                "\nEcrã:          " + computers.get(computer_num).screen + "\"" +
                "\nMemória RAM:   " + computers.get(computer_num).memory + " GB");

        if (computers.get(computer_num).storage_sort == 1) {
            System.out.println("Armazenamento: " + computers.get(computer_num).storage + " GB");
        }

        else {
            System.out.println("Armazenamento: " + computers.get(computer_num).storage / 1024 + " TB");
        }
        System.out.println("Gráficos:      " + computers.get(computer_num).graphics +
                "\nPreço:         " + computers.get(computer_num).price + " €");
        obj_3.operations_1();
    }
}