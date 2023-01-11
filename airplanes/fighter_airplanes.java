public class fighter_airplanes extends cargo_airplanes {
    public double velocity;
    protected String armament;
    private int number_built;

    fighter_airplanes (String manufacturer, String model, String role, int crew, double load_capacity,
                       String users, int range, int fuel_capacity, double velocity, String armament,
                       int number_built) {
        super(manufacturer, model, role, crew, load_capacity, users, range, fuel_capacity);
        this.velocity = velocity;
        this.armament = armament;
        this.number_built = number_built;
    }

    public String get_armament (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return armament;
        }
        else {
            return "0";
        }
    }

    public int get_number_built (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return number_built;
        }
        else {
            return 0;
        }
    }
}
