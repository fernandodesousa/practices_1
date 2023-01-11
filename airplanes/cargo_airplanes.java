public class cargo_airplanes extends general_airplanes {
    public double load_capacity;
    protected String users;
    private int range;
    private int fuel_capacity;

    cargo_airplanes (String manufacturer, String model, String role, int crew, double load_capacity,
                     String users, int range, int fuel_capacity) {
        super(manufacturer, model, role, crew);
        this.load_capacity = load_capacity;
        this.users = users;
        this.range = range;
        this.fuel_capacity = fuel_capacity;
    }

    public int get_range (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return range;
        }
        else {
            return 0;
        }
    }

    public int get_fuel_capacity (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return fuel_capacity;
        }
        else {
            return 0;
        }
    }
}
