import java.util.Objects;

public class general_airplanes {
    public String manufacturer;
    protected String model;
    private String role;
    private int crew;

    general_airplanes (String manufacturer, String model, String role, int crew) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.role = role;
        this.crew = crew;
    }

    public String get_role (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return role;
        }
        else {
            return "0";
        }
    }

    public int get_crew (String password_user, String password_generated) {
        if (password_user.equals(password_generated)) {
            return crew;
        }
        else {
            return 0;
        }
    }
}
