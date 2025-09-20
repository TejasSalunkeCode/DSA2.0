package _58_KarpRabin;

public class KarpRabin {
    private final int PRIME = 101;

    private long calculateHash(String str, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength) {
        long newHash = (prevHash - oldChar) / PRIME;
        newHash += newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m > n) {
            System.out.println("Pattern longer than text, no match.");
            return;
        }

        long patternHash = calculateHash(pattern, m);
        long textHash = calculateHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash && text.substring(i, i + m).equals(pattern)) {
                System.out.println("Pattern found at index " + i);
            }

            if (i < n - m) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + m), m);
            }
        }
    }
}
