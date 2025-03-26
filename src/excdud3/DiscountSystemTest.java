package excdud3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountSystemTest {
    @Test
    void factorialExcepcion() {
        try {
            DiscountSystem.applyDiscount(-1, false);
            fail("FALLO: n < 0 debería generar una excepción");
        } catch (Exception e) {
        }
    }

    @Test
    void test1(){
        assertEquals(47.5, DiscountSystem.applyDiscount(50, false));
    }

    @Test
    void test2(){
        assertEquals(135, DiscountSystem.applyDiscount(150, false));
    }

    @Test
    void test3(){
        assertEquals(170, DiscountSystem.applyDiscount(200, true));
    }
}
