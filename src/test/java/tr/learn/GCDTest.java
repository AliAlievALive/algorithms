package tr.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDTest {

    @org.junit.jupiter.api.Test
    void gcd() {
        assertEquals(3, Lesson16_GCD.gcd(15, 24));
        assertEquals(7, Lesson16_GCD.gcd(7, 14));
        assertEquals(7, Lesson16_GCD.gcd(14, 7));
        assertEquals(1, Lesson16_GCD.gcd(15, 28));

        assertEquals(120, Lesson16_GCD.lcm(15, 24));
        assertEquals(14, Lesson16_GCD.lcm(7, 14));
        assertEquals(14, Lesson16_GCD.lcm(14, 7));
        assertEquals(15 * 28, Lesson16_GCD.lcm(15, 28));
    }
}
