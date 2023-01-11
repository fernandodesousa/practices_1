package Prática_1_Módulo_2_Sign_In;

import java.security.SecureRandom;
import java.util.Scanner;

public class Oscar {
    private static char at_sign = '@';
    private static char point = '.';
    private static int at_sign_validate;
    private static int at_sign_validate_1;
    private static int domain_verification;
    private static int point_position;

    protected static String st_2;
    protected static String st_3;

    protected static String email_1;
    protected static String telephone;
    protected String account_number;
    protected String password;
    protected String secret_code;

    private static void try_again() {
        Scanner sc_1 = new Scanner(System.in);
        System.out.println("Insira de novo a sua direção de email: ");
        String new_email = sc_1.nextLine();
        Oscar.email_confirmation(new_email);
    }

    static void email_confirmation(String email) {
        // Verifica que o email contenha um só @.

        email_1 = email;
        String email_verification;

        email_verification = email.replaceFirst("@", "*");
        at_sign_validate = email_verification.indexOf(at_sign);

        if (at_sign_validate != -1) {
            System.out.println("O seu correio contém mais de um @.");
            Oscar.try_again();
        } else {
            point_confirmation(email);
        }
    }

    private static void point_confirmation(String email_2) {
        // Verifica que a direção do email não tenha dois pontos seguidos.

        point_position = email_2.indexOf('.') + 1;

        if (point_position >= email_2.length()) {
            System.out.println("A sua direção de email não é correta! Erro 54 [Contém um ponto no final].");
            Oscar.try_again();
        } else if (email_2.charAt(point_position) == point) {
            System.out.println("A sua direção de email não é correta! Erro 59 [Contém dois pontos sucesivos]");
            Oscar.try_again();
        } else {
            Oscar.point_existence(email_2);
        }
    }

    private static void point_existence(String email_1) {

        at_sign_validate_1 = email_1.indexOf(at_sign);

        st_2 = email_1.substring(at_sign_validate_1 + 1);
        st_3 = email_1.substring(0, at_sign_validate_1);
        domain_verification = st_2.indexOf(point);

        // Verifica que a parte do domínio tenha um ponto.
        if (domain_verification == -1) {
            System.out.println("A sua direção de email não é correta! Erro 79 [O domínio não é válido].");
            Oscar.try_again();
        }

        // Verifica que o ponto não se encontre no princípio nem no final nem antes ou depois do @.
        else if (email_1.charAt(0) == point || email_1.charAt(at_sign_validate_1 - 1) == point
                || email_1.charAt(at_sign_validate_1 + 1) == point) {
            System.out.println("A sua direção de email não é correta! Erro 44 [Contém um ponto no " +
                    "princípio ou junto do @].");
            Oscar.try_again();
        }

        // Verifica que a direção de email não seja demasiado curta.
        else if (st_2.length() < 4 || st_3.length() < 4) {
            System.out.println("A sua direção de email não é correta! Erro 44 [É curta demais]");
        }

        else {
            System.out.println("A direção de email é correta.");
            Oscar.telephone_entrance();
        }
    }

    private static void telephone_entrance() {
        // Verifica que o número contém 9 digitos.

        Scanner sc_2 = new Scanner(System.in);
        int telephone_len;

        System.out.println("Insira o seu número de telemóvel sem o código do país: ");
        telephone = sc_2.nextLine();

        telephone_len = telephone.length();

        if (telephone_len != 9) {
            System.out.println("O seu número de telemóvel é incorreto.");
            Oscar.telephone_entrance();
        }

        else {
            Oscar.digit_confirmation(telephone);
        }
    }

     private static void digit_confirmation (String telephone) {
         // Verifica que os 9 digitos são números.

         int digit_confirmation_value = 0;

         char[] phone_digits_transformation_1 = new char[telephone.length()];
         int[] phone_digits_transformation_2 = new int[phone_digits_transformation_1.length];

         for (int j = 0; j < telephone.length(); j++) {
             phone_digits_transformation_1[j] = telephone.charAt(j);
             for (int i = 0; i < phone_digits_transformation_1.length; i++) {
                 phone_digits_transformation_2[i] = (int) phone_digits_transformation_1[i];

             }
         }

         for (int i : phone_digits_transformation_2) {
             if (i < 48 || i > 57) {
                 digit_confirmation_value++;
             }
         }

         if (digit_confirmation_value != 0) {
             System.out.println("O seu número de telemóvel contém algum valor que não é um número.");
             Oscar.telephone_entrance();
         }

         else {
             System.out.println("O seu número está correto. Vai receber um código.");
             Oscar.generate_verification_code();
         }

     }

     private static void generate_verification_code () {
        // Gera o código de verificação que o usuário precisa de inserir para completar o processo.
        String st3 = Oscar.generate_verification_code(4, 9, 0);
        System.out.println("\nCódigo que <recebeu> no seu telemóvel -> " + st3);
        Oscar.verificate_code(st3);
    }

     static String generate_verification_code(int code_len, int num_max, int num_mim) {
        int[] code = new int[code_len];

        String code_1;
        StringBuilder code_2 = new StringBuilder(code_len - 1);

        for (int i = 0; i <= code_len - 1 ; i++) {
            code[i] = (int) (Math.random()*((num_max-num_mim) + 1)) + num_mim;
        }

        for (int j = 0; j <= code_len - 1; j++ ) {
            code_2.append(code[j]);
        }

        code_1 = code_2.toString();

        return code_1;
    }

     static String generate_password () {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom rm_1 = new SecureRandom();
        StringBuilder strb_1 = new StringBuilder();

        for (int i = 0; i < 11; i++) {
            int rm_inx_1 = rm_1.nextInt(characters.length());
            strb_1.append(characters.charAt(rm_inx_1));
        }

        return strb_1.toString();
    }

    private static void verificate_code (String code_3) {
        // Recebe o código que o usuário insere e o compara com o que foi gerado.
        Scanner sc_1 = new Scanner(System.in);
        System.out.println("Insira o código que recebeu para confirmar o seu telemóvel: ");
        String st4 = sc_1.nextLine();
        int st4_len = st4.length();

        int code_confirmation_value = 0;

        if (st4_len > 4) {
            System.out.println("Código errado. \nVai receber um novo código no seu telemóvel.");
            Oscar.generate_verification_code();
        }


        for (int i = 0; i < st4_len; i++) {
            if (code_3.charAt(i) != st4.charAt(i)) {
                code_confirmation_value++;
            }
        }

        if (code_confirmation_value != 0 || st4_len != 4) {
            System.out.println("Código errado. \nVai receber um novo código no seu telemóvel.");
            Oscar.generate_verification_code();
        }

        else {
            Bravo.print_user_additional_information();
        }
    }
}
