package Prática_1_Módulo_2_Sign_In;

public class Bravo {
    static void print_user_additional_information () {
        Oscar user_1 = new Oscar();
        user_1.account_number = Oscar.generate_verification_code(10, 9, 0) + "_" + Oscar.st_3;
        user_1.password = Oscar.generate_password();
        user_1.secret_code = Oscar.generate_verification_code(6, 9, 0);

        System.out.println("\nA sua informação:\nTELEMÓVEL -> " + Oscar.telephone +
                "\nCORREIO ELETRÓNICO -> " + Oscar.email_1 +
                "\nID DA CONTA -> " + user_1.account_number +
                "\nPALABVRA PASSE -> " + user_1.password +
                "\nCÓDIGO SECRETO -> " + user_1.secret_code +
                "\n[Guarde esta informação num lugar seguro]" +
                "\nObrigado por o registro nesta App!");

        System.exit(0);
    }
}
