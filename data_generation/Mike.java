package Prática_1_Módulo_2_Sign_In;

import java.util.Scanner;

public class Mike {
    public static void main(String[] args) {
        String st_1;

        Scanner scan_1 = new Scanner(System.in);
        System.out.println("Insira o seu correio eletrónico: ");

        st_1 = scan_1.nextLine();
        Oscar.email_confirmation(st_1);
    }
}
