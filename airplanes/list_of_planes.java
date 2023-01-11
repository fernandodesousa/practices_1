import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class list_of_planes {
    private static String password_user;
    protected static ArrayList<general_airplanes> general_airplanes = new ArrayList<>();
    protected static ArrayList<cargo_airplanes> cargo_airplanes = new ArrayList<>();
    protected static ArrayList<fighter_airplanes> fighter_airplanes = new ArrayList<>();
    general_airplanes cessna_172 = new general_airplanes("Cessna", " 172 Skyhawk",
            "Avião civil utilitário", 4);

    general_airplanes cirrus_sr_20 = new general_airplanes("Cirrus", " SR20",
            "Avião ligeiro", 5);

    general_airplanes piper_pa_28 = new general_airplanes("Piper", " PA-28 Cherokee",
            "Avião civil utilitário", 2);

    cargo_airplanes boeing_747F = new cargo_airplanes("Boeing", " 747-8F",
            "Avião a jato de fuselagem larga", 2, 132.6,
            "UPS Airlines, Lufthansa, Korean Air", 7899, 226120);

    cargo_airplanes airbus_a300 = new cargo_airplanes("Airbus", " A300-600F",
            "Avião de fuselagem larga", 2, 48.2,
            "Fedex Express, UPS Airline, EAT Leipzig - DHL", 7500, 53505);

    cargo_airplanes lockheed_c130 = new cargo_airplanes("Lockheed Martin", " C-130 Hercules",
            "Avião de transporte tático", 5, 19,
            "US Air Force, Royal Canadian Air Force, US Coast Guard", 3800, 32000);

    fighter_airplanes lookeed_f22 = new fighter_airplanes("Lookheed Martin", " F-22 Raptor",
            "Caça de superioridade aérea", 1, 1, "US Air Force", 3000,
            8200, 2.25, "Canhão rotativo de 20 mm; Mísseis ar-ar, ar-superfície " +
            "e tanques de queda (combustível).", 195);

    fighter_airplanes sukhoi_su57 = new fighter_airplanes("Sukhoi", " Su-57 [Felon]",
            "Caça multifunção", 1, 1, "Russian Aerospace Forces", 3500,
            10220, 2, "Canhão automático 30 mm; Mísseis ar-ar, ar-superfície, " +
            "antinavio e anti-radiação.", 16);

    fighter_airplanes general_dynamics_f16 = new fighter_airplanes("General Dynamics",
            " F-16 Fighting Falcon", "Caça multifunção", 1, 1, "US Air Force, " +
            "Royal Netherlands Air Force, Royal Danish Air Force", 4200, 3980, 2.05,
            "Canhão rotativo 20 mm, Mísseis ar-ar, ar-superfície, antinavio e múltiplas bombas.",
            4604);

    static String password_generated;

    void get_planes(int index) {
        operations obj_1 = new operations();

        general_airplanes.add(cessna_172);
        general_airplanes.add(cirrus_sr_20);
        general_airplanes.add(piper_pa_28);

        cargo_airplanes.add(boeing_747F);
        cargo_airplanes.add(airbus_a300);
        cargo_airplanes.add(lockheed_c130);

        fighter_airplanes.add(lookeed_f22);
        fighter_airplanes.add(sukhoi_su57);
        fighter_airplanes.add(general_dynamics_f16);

        password_generated = obj_1.generate_password();

        if (index < 1 || index > 9) {
            System.out.println("O número que insirou é incorreto. Tente de novo.");
            obj_1.print_to_user();
        }
        else if (index <= 3) {
            int index_new = index - 1;
            System.out.println("Avião -> " + general_airplanes.get(index_new).manufacturer +
                    general_airplanes.get(index_new).model);
            get_plane_details(index);
        }

        else if (index <= 6){
            int index_new = index - 4;

            System.out.println("Avião -> " + cargo_airplanes.get(index_new).manufacturer +
                    cargo_airplanes.get(index_new).model +
                    "\nCapacidade de carga -> " + cargo_airplanes.get(index_new).load_capacity + " t" +
                    "\nUsuários -> " + cargo_airplanes.get(index_new).users);
            get_plane_details(index);

        }

        else {
            int index_new = index - 7;

            System.out.println("Avião -> " + fighter_airplanes.get(index_new).manufacturer +
                    fighter_airplanes.get(index_new).model +
                    "\nUsuários -> " + fighter_airplanes.get(index_new).users +
                    "\nVelocidade -> " + fighter_airplanes.get(index_new).velocity + " match || " +
                            (fighter_airplanes.get(index_new).velocity * 1225) + " Km/h");
            get_plane_details(index);
        }
    }

    static void get_plane_details (int index) {
        operations obj_2 = new operations();

        Scanner scan_2 = new Scanner(System.in);
        password_generated = obj_2.generate_password();

        System.out.println("Para ver detalhes do avião, insira a palavra passe < "  + password_generated + " >");
        password_user = scan_2.nextLine();

        String role_returned;
        int crew_returned;
        int range_returned;
        int fuel_capacity_returned;
        String armament_returned;
        int built_number_returned;

        if (index <= 3) {
            int index_new = index - 1;

            role_returned = general_airplanes.get(index_new).get_role(password_user, password_generated);
            crew_returned = general_airplanes.get(index_new).get_crew(password_user, password_generated);
            print_details(role_returned, crew_returned, 1, 1, "x", 1, index);
        }

        else if (index <= 6){
            int index_new = index - 4;

            role_returned = cargo_airplanes.get(index_new).get_role(password_user, password_generated);
            crew_returned = cargo_airplanes.get(index_new).get_crew(password_user, password_generated);
            range_returned = cargo_airplanes.get(index_new).get_range(password_user, password_generated);
            fuel_capacity_returned = cargo_airplanes.get(index_new).get_fuel_capacity(password_user, password_generated);
            print_details(role_returned, crew_returned, range_returned, fuel_capacity_returned, "x",
                    1, index);
        }

        else {
            int index_new = index - 7;

            role_returned = fighter_airplanes.get(index_new).get_role(password_user, password_generated);
            crew_returned = fighter_airplanes.get(index_new).get_crew(password_user, password_generated);
            range_returned = fighter_airplanes.get(index_new).get_range(password_user, password_generated);
            fuel_capacity_returned = fighter_airplanes.get(index_new).get_fuel_capacity(password_user, password_generated);
            armament_returned = fighter_airplanes.get(index_new).get_armament(password_user, password_generated);
            built_number_returned = fighter_airplanes.get(index_new).get_number_built(password_user, password_generated);

            print_details(role_returned, crew_returned, range_returned, fuel_capacity_returned, armament_returned,
                    built_number_returned, index);
        }
    }

    static void print_details (String role, int crew, int range, int fuel_capacity, String armament,
                               int number_buillt, int index) {
        if (!Objects.equals(role, "0") && crew != 0 && range != 0 && fuel_capacity != 0 &&
        !Objects.equals(armament, "0") && number_buillt != 0) {
            if (index <= 3) {
                System.out.println("Role -> " + role +
                        "\nTripulação -> 1 piloto | " + (crew - 1) + " passageiros");
                finish_program();
            }
            else if (index <= 6)  {
                System.out.println("Função -> " + role +
                        "\nTripulação -> " + crew + " pilotos" +
                        "\nAlcance -> " + range + " Km" +
                        "\nCapacidade de combustivel -> " + fuel_capacity + " l");
                finish_program();
            }
            else {
                System.out.println("Função -> " + role +
                        "\nTripulação -> " + crew + " piloto" +
                        "\nAlcance -> " + range + " Km" +
                        "\nCapacidade de combustivel -> " + fuel_capacity + " l" +
                        "\nArmamento: \n" + armament +
                        "\nNúmero de unidades contruidas -> " + number_buillt);
                finish_program();
            }
        }
        else {
            operations obj_3 = new operations();
            password_generated = obj_3.generate_password();
            System.out.println("Contraseña incoreta. Tente de novo.");
            get_plane_details(index);

        }

    }

    static void finish_program () {
        int input_0;
        Scanner scan_1 = new Scanner(System.in);
        System.out.println("\nO que deseja fazer a seguir:\n1. Seleccionar outra avião\n0. Acabar programa");
        input_0 = scan_1.nextInt();
        operations obj_2 = new operations();

        if (input_0 == 1) {
            obj_2.print_to_user();
        }
        else if (input_0 == 0) {
            System.exit(0);
        }
        else {
            System.out.println("O número que insirou é incorreto. Tente de novo.");
            finish_program();
        }
    }
}
