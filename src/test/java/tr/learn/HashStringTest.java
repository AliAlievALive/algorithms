package tr.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashStringTest {

    @org.junit.jupiter.api.Test
    void stringHash() {
        String s1 = "aaa";
        String s2 = "abb";
        String s3 = "abb";
        String sHash2 = "sdfadqwesdfsdf";
        int start = 3;
        int end = 7;
        assertEquals(993, Lesson20_HashString.stringHash(s1));
        assertEquals(Lesson20_HashString.stringHash(s2), Lesson20_HashString.stringHash(s3));
        assertEquals(965854844, Lesson20_HashString.stringHash2(sHash2, start, end));
    }
}