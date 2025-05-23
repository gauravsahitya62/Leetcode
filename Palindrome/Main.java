public class Main {
    public static void main(String[] args) {
        Palindrome checker = new Palindrome();  // Use the Palindrome class
        int x = 1221;

        boolean result = checker.isPalindrome(x);
        System.out.println(x + " is palindrome? " + result);
    }
}
