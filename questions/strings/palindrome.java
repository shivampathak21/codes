public class palindrome {
    public static void main(String[] args) {
        String str = "rayhnar"; // Example string
        
        // Function call to check if the string is a palindrome
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        // Compare characters from start and end of the string
        while (start < end) {
            // If characters at start and end don't match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}
