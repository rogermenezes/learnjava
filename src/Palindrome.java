public class Palindrome {

    public boolean isPalindrome(String s) {
        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("racecar")); // true
        System.out.println(palindrome.isPalindrome("hello")); // false
    }

}
