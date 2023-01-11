import java.util.Random;
import java.util.Scanner;

public class operations {
    list_of_planes obj_0 = new list_of_planes();

    void print_to_user () {
        Scanner scan_0 = new Scanner(System.in);
        int input_0;

        System.out.println("""
                Selecione o avião do que deseja conhecer as características:
                
                1. Cessna 172 Skyhawk
                2. Cirrus SR20
                3. Piper PA-28 Cherokee
                4. Boeing 747-8F
                5. Airbus A300-600F
                6. Lookheed C-130 Hercules
                7. Lookheed F-22 Raptor
                8. Sukhoi Su-57
                9. General Dynamics F-16 Fighting Falcon""");

        input_0 = scan_0.nextInt();
        obj_0.get_planes(input_0);
    }

    String generate_password () {
        StringBuilder strb_0 = new StringBuilder();
        Random random = new Random();

        String capital_case_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_case_letters = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";

        for (int i = 0; i < 2; i++) {
            strb_0.append(capital_case_letters.charAt(random.nextInt(capital_case_letters.length())));
            strb_0.append(lower_case_letters.charAt(random.nextInt(lower_case_letters.length())));
            strb_0.append(number.charAt(random.nextInt(number.length())));
        }
        return strb_0.toString();
    }
}
