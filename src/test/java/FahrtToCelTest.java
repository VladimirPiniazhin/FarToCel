import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FahrtToCelTest {

    @Test
    void convrtFahr() {
        int test = (FahrtToCel.convertFahr(32));
        assertEquals(0, test);
    }
    @Test
    void convertCel() {
        int test = (FahrtToCel.convertCel(0));
        assertEquals(32, test);
    }
    @Test
    void kelvinToCelsius() {
        float test = (FahrtToCel.kelvinToCelsius(273));
        assertEquals(-0.15, test, 0.01  );
    }
    @Test
    void kelvinToFahrenheit() {
        double test = (FahrtToCel.kelvinToFahrenheit(300.1));
        assertEquals(59.0, test, 0.01);
    }
}