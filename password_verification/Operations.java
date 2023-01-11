package Modulo_2_Exercicio;

public class Operations {

    public void check_blank_spaces (String text_2) {
        Operations object_0 = new Operations();
        Scan object_1 = new Scan();

        int zero = 0;
        int blank_account = 0;


        for(int i=0;i<text_2.length();++i) {
            if(text_2.charAt(i)==' ')
                blank_account++;
            }

        if (blank_account != zero) {
            System.out.println("A palavra-passe tem um espaço em branco.");
            object_1.get_password_again("");
        }
        else {
            object_0.check_numbers(text_2);
        }
    }

    public void check_numbers(String text_2) {
        Scan object_1 = new Scan();
        Operations object_2 = new Operations();

        String text_3 = "";

        int error_0 = -1;

        int number_0;
        int number_1;
        int number_2;
        int number_3;
        int number_4;
        int number_5;
        int number_6;
        int number_7;
        int number_8;
        int number_9;

        number_0 = text_2.indexOf("0");
        number_1 = text_2.indexOf("1");
        number_2 = text_2.indexOf("2");
        number_3 = text_2.indexOf("3");
        number_4 = text_2.indexOf("4");
        number_5 = text_2.indexOf("5");
        number_6 = text_2.indexOf("6");
        number_7 = text_2.indexOf("7");
        number_8 = text_2.indexOf("8");
        number_9 = text_2.indexOf("9");

        //check if the number_x exits into the password.
        if (number_0 != error_0) {
            text_3 = text_2.replaceFirst("0", "x");
        }
        else if (number_1 != error_0) {
            text_3 = text_2.replaceFirst("1", "x");
        }
        else if (number_2 != error_0) {
            text_3 = text_2.replaceFirst("2", "x");
        }
        else if (number_3 != error_0) {
            text_3 = text_2.replaceFirst("3", "x");
        }
        else if (number_4 != error_0) {
            text_3 = text_2.replaceFirst("4", "x");
        }
        else if (number_5 != error_0) {
            text_3 = text_2.replaceFirst("5", "x");
        }
        else if (number_6 != error_0) {
            text_3 = text_2.replaceFirst("6", "x");
        }
        else if (number_7 != error_0) {
            text_3 = text_2.replaceFirst("7", "x");
        }
        else if (number_8 != error_0) {
            text_3 = text_2.replaceFirst("8", "x");
        }
        else if (number_9 != error_0) {
            text_3 = text_2.replaceFirst("9", "x");
        }
        else {
            System.out.println("A palavra-passe não contém dois números.");
            object_1.get_password_again("");
        }

        int second_number_0;
        int second_number_1;
        int second_number_2;
        int second_number_3;
        int second_number_4;
        int second_number_5;
        int second_number_6;
        int second_number_7;
        int second_number_8;
        int second_number_9;

        second_number_0 = text_3.indexOf("0");
        second_number_1 = text_3.indexOf("1");
        second_number_2 = text_3.indexOf("2");
        second_number_3 = text_3.indexOf("3");
        second_number_4 = text_3.indexOf("4");
        second_number_5 = text_3.indexOf("5");
        second_number_6 = text_3.indexOf("6");
        second_number_7 = text_3.indexOf("7");
        second_number_8 = text_3.indexOf("8");
        second_number_9 = text_3.indexOf("9");

        //check if the second_number_x exits into the password.
        if (second_number_0 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_1 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_2 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_3 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_4 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_5 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_6 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_7 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_8 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else if (second_number_9 != error_0) {
            object_2.check_special_characters(text_2);
        }
        else {
            System.out.println("A palavra-passe só contém um número.");
            object_1.get_password_again("");
        }
    }

    public void check_special_characters(String text_2) {
        Scan object_2 = new Scan();
        Operations object_3 = new Operations();

        int error_1 = -1;

        int accent_mark;
        int at_sign;
        int underscore;
        int slash;
        int plus;
        int two_points;

        accent_mark = text_2.indexOf("~");
        at_sign = text_2.indexOf("@");
        underscore = text_2.indexOf("_");
        slash = text_2.indexOf("/");
        plus = text_2.indexOf("+");
        two_points = text_2.indexOf(":");

        if (accent_mark != error_1) {
            object_3.check_upper_case(text_2);
        }
        else if (at_sign != error_1) {
            object_3.check_upper_case(text_2);
        }
        else if (underscore != error_1) {
            object_3.check_upper_case(text_2);
        }
        else if (slash != error_1) {
            object_3.check_upper_case(text_2);
        }
        else if (plus != error_1) {
            object_3.check_upper_case(text_2);
        }
        else if (two_points != error_1) {
            object_3.check_upper_case(text_2);
        }
        else {
            System.out.println("A palavra-passe não contém um caracter especial [ ~  @  _  /  +  : ].");
            object_2.get_password_again("Text");
        }
    }

    public void check_upper_case(String text_2) {

        Scan object_3 = new Scan();
        Operations object_4 = new Operations();

        int zero = 0;
        int upper_cases = 0;

        for (int i = 0; i < text_2.length(); i++) {
            if (Character.isUpperCase(text_2.charAt(i))) {
                upper_cases = upper_cases + 1;
            }
        }

        if (upper_cases > zero) {
            object_4.check_string_length(text_2);
        }

        else {
            System.out.println("A palavra-passe não contém uma letra em maiúscula.");
            object_3.get_password_again("");
        }
    }

    public void check_string_length (String text_2) {

        Scan object_4 = new Scan();
        //Operations object_5 = new Operations();

        int string_length = text_2.length();

        if (string_length < 15) {
            System.out.println("A palavra-passa é muito corta.");
            object_4.get_password_again("");
        }

        else {
            System.out.println("A palavra-passe é correta.");
            System.exit(0);
        }
    }
}
