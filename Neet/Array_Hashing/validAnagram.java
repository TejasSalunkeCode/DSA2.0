package Neet.Array_Hashing;

// import Interface.breake;

public class validAnagram {
    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
       
        Character[] chars = new Character[s.length()];
        Character[] chars2 = new Character[t.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            chars[i] = t.charAt(i);
        }

        if (chars.length != chars2.length)
            return false;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars[i] == chars2[j]) {
                    count++;
                    chars2[j] = null;
                    // continue;
                    break;
                }
            }
        }
        System.out.println(count);
        if (count == chars.length)
            return true;
        return false;

    }
}

