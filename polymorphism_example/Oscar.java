package Prática_3_Módulo_3;

class Oscar {
    double num_pi = 3.1416;

    // Calcular superficie de um cubo.
    public double figures_surface(double h) {
        double surface = 6 * Math.pow(h, 2);
        return surface;
    }

    // Calcular superficie de um cilindro.
    public double figures_surface(double h, double r) {
        double surface = 2 * num_pi * r * (r + h);
        return surface;
    }

    // Calcular superficie de um paralelepipedo.
    public double figures_surface(double h, double l, double w) {
        double surface = 2 * l * w + 2 * l * h + 2 * w * h;
        return surface;
    }

    // Calcular volume de um cubo.
    public double figures_volume(double h) {
        double volume = Math.pow(h, 3);
        return volume;
    }

    // Calcular volume de un cilindro.
    public double figures_volume (double h, double r) {
        double volume = num_pi * Math.pow(r, 2) * h;
        return volume;
    }

    // Calcular volume de um paralelepipedo.
    public double figures_volume(double h, double l, double w) {
        double volume = h * l * w;
        return volume;
    }
}


