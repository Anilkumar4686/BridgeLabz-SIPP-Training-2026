import java.util.*;

public class SpyAgency {

    // Reverse a message
    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String message) {
        String cleaned = message.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String message) {
        int vowels = 0, consonants = 0;

        for (char ch : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check anagrams
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find first non-repeating character
    public static char firstNonRepeatingCharacter(String log) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : log.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret message input
        System.out.print("Enter the secret message: ");
        String secretMessage = sc.nextLine();

        // Reverse message
        System.out.println("Reversed Message: " + reverseMessage(secretMessage));

        // Palindrome check
        if (isPalindrome(secretMessage)) {
            System.out.println("The message is a Palindrome.");
        } else {
            System.out.println("The message is NOT a Palindrome.");
        }

        // Vowel and consonant count
        countVowelsAndConsonants(secretMessage);

        // Anagram check inputs
        System.out.print("\nEnter first intercepted message: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter second intercepted message: ");
        String intercept2 = sc.nextLine();

        if (areAnagrams(intercept1, intercept2)) {
            System.out.println("The intercepted messages are Anagrams.");
        } else {
            System.out.println("The intercepted messages are NOT Anagrams.");
        }

        // Surveillance log input
        System.out.print("\nEnter surveillance log: ");
        String surveillanceLog = sc.nextLine();

        char result = firstNonRepeatingCharacter(surveillanceLog);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found.");
        }

        sc.close();
    }
}