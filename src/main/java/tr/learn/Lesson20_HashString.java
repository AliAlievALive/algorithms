package tr.learn;

public class Lesson20_HashString {
    static long stringHash(String s) { // O(n)
        final int p = 31;
        final int m = (int) (Math.pow(10, 9) + 7);
        long hash = 0;
        long primePow = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash = (hash + (ch - 'a' + 1) * primePow) % m;
            primePow = (primePow * p) % m;
        }
        return hash;
    }

    static long stringHash2(String s, int start, int end) {
        long[] hashes = new long[s.length() + 1];
        hashes[0] = 0;
        long[] primes = new long[s.length() + 1];
        primes[0] = 1;

        final int p = 301;
        final int m = (int) (Math.pow(10, 9) + 7);

        for (int i = 0; i < s.length(); i++) {
            hashes[i + 1] = hashes[i] * p + s.charAt(i);
            hashes[i + 1] %= m;
            primes[i + 1] = primes[i] * p;
            primes[i + 1] %= m;
        }

        long substrHash = hashes[end + 1] - (hashes[start] * primes[end - start + 1]) % m;
        if (substrHash < 0) {
            substrHash += m;
        }
        return substrHash;
    }
}
