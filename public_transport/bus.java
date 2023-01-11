interface bus_capacity {
    void calculate_capacity_bus(int passengers);

    int bus_max_seating_one_trip = 62;
    int bus_max_capacity_one_trip = 87;
}

public class bus implements bus_capacity {
    int trips_standing = 0;
    int trips_seating = 0;

    @Override
    public void calculate_capacity_bus(int passengers) {
        int passengers_number = passengers;

        trips_seating = passengers / bus_max_seating_one_trip;

        if (trips_seating > 9) {
            do {
                passengers = passengers - bus_max_capacity_one_trip;
                trips_standing++;
                trips_seating = passengers / bus_max_seating_one_trip;
            }
            while (trips_seating >= (9 - trips_standing));
        }

        if (trips_standing == 0) {
            System.out.println("\nPara transportar " + passengers_number + " passageiros do ponto A ao ponto B, " +
                    "com autocarros, precisam-se " + (trips_seating) + " viajes. " +
                    "\nTodos eles serão feitos com as pessoas sentadas.");
        }
        else if (trips_seating != 0 && trips_seating > 0) {
            System.out.println("\nPara transportar " + passengers_number + " passageiros do ponto A ao ponto B, " +
                    "com autocarros, precisam-se " + (trips_standing + trips_seating) + " viajes. " +
                    "\nSó é possível que " + trips_seating + " destes viajes sejam feitos só com pessoas sentadas.");
        }
        else {
            System.out.println("\nPara transportar " + passengers_number + " passageiros do ponto A ao ponto B, " +
                    "com o metro precisam-se " + (trips_standing + trips_seating) + " viajes com lotação completa. ");
        }
    }
}