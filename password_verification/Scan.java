package Modulo_2_Exercicio;

import java.util.Scanner;

public class Scan {
    public void get_password (String text_1) {
        Operations object_1 = new Operations();

        Scanner scan_1 = new Scanner(System.in);

        System.out.println("""
                Digite a palavra-passe.\s
                Deve conter mais de 15 caracteres, não conter espaços em branco e, pelo menos,
                2 números, uma letra maiscúla e um caracter especial [ ~  @  _  /  +  : ]""");
        text_1 = scan_1.nextLine();

        object_1.check_blank_spaces(text_1);
    }

    public void get_password_again (String text_1) {
        Operations object_1 = new Operations();

        Scanner scan_2 = new Scanner(System.in);

        System.out.println("Digite uma nova palavra-passe a seguir:");
        text_1 = scan_2.nextLine();

        object_1.check_blank_spaces(text_1);
    }
}

