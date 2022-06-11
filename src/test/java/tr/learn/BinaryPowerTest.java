package tr.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryPowerTest {

    @org.junit.jupiter.api.Test
    void bin_pow() {
        assertEquals(1024, Lesson14_BinaryPower.bin_pow1(2, 10));
        assertEquals(243, Lesson14_BinaryPower.bin_pow1(3, 5));
        assertEquals(14348907, Lesson14_BinaryPower.bin_pow1(3, 15));
        assertEquals(1024, Lesson14_BinaryPower.bin_pow2(2, 10));
        assertEquals(243, Lesson14_BinaryPower.bin_pow2(3, 5));
        assertEquals(14348907, Lesson14_BinaryPower.bin_pow2(3, 15));
    }
}
