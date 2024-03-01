public class FahrtToCel {


    public static int convertFahr(int f) {
        int c = (int) (5.0 / 9.0 * (f - 32));
        return c;
    }

    public static int convertCel(int c) {
        int f = (int) ((9.0 / 5.0) * c + 32);
        return f;
    }

    public static float kelvinToCelsius(float k) {
        float c = (float) (k - 273.15);
        return c;
    }

    public static double kelvinToFahrenheit(double k) {
        float f = (float) ((9.0 / 5.0) * (k - 273.15) + 32);
        return f;
    }

}
