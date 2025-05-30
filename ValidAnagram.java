import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array,s2Array);
    }

    public static void main(String[] agrs) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println(isAnagram(s1, s2));
    }
    
} 